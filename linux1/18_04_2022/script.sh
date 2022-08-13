#!/bin/bash

touch test.sh
chmod 777 test.sh
echo "#!/bin/bash">test.sh
echo "sudo apt update">>test.sh
./test.sh

