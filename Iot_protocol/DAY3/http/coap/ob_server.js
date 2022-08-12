const coap = require('coap') // or coap
const server = coap.createServer()

server.on('request', (req, res) => {
    if (req.headers.Observe !== 0) {
        return res.end(new Date().toISOString() + '\n')
    }

    const interval = setInterval(() => {
        res.write(new Date().toISOString() + '\n')
    }, 10)

    res.on('finish', () => {
        clearInterval(interval)
    })
})

server.listen(() => {
    console.log('server started')
})