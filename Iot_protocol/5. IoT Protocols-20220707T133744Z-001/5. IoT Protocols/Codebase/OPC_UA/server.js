/*------------------------------------------------------------
 * Demo OPC UA Server Program for DIoT Session
 * Date: Jun 2022
 * Description: Server exposes three variables with functions
 * -----------------------------------------------------------*/
const nodeOPCUA = require("node-opcua")

let rpi, namespace;

// OPC UA server instace
const opc_server = new nodeOPCUA.OPCUAServer({
    port: 26683,
    buildInfo : {
        productName: "DIoTSession_OPCUA",
        buildDate: new Date(),
        buildNumber: "1214"
    }
});

opc_server.initialize(async ()=>{
    await add_addressSpace();
    console.log("OPC UA Server has been done initiliazing...");
})

// Add the addressSpace to expose to Clients
async function add_addressSpace(){
    const addressSpace = opc_server.engine.addressSpace;
    namespace = addressSpace.getOwnNamespace();

    rpi = namespace.addFolder("RootFolder",{browseName:"RPI"});

    let temp = 24;

    // Add your sensor logic here
    setInterval(()=>{
        temp += 0.2;
    },1000)

    // Adding Variable
    namespace.addVariable({
        componentOf: rpi,
        nodeId: "ns=1;s=Temperature",
        browseName: "tempSensor",
        dataType: "Float",
        value :{
            get: function() {
                return new nodeOPCUA.Variant({
                    dataType: nodeOPCUA.DataType.Float, value: temp
                });
            }
        }
    })
    startServer();
    
}

// Starting the server
function startServer(){

    opc_server.start(()=>{
        console.log("OPC UA Server is listening... ");
        console.log("At: " + opc_server.endpoints[0].endpointDescriptions()[0].endpointUrl)
    })  
}





