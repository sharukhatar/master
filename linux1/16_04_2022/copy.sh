#!/bin/bash
read -p "Enter the destination of the filr to be copied : " path
read -p "Enter the name of the file : " file_name
cp $poem.txt $path
echo "Copied successfully"
