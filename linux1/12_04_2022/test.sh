#!/bin/bash
#how to declare a variable
#variable name=value (without space)
system_hostname=`uname -n`
system_kernal_name=`uname -s`
system_kernal_version=`uname -v`
echo "Your System name : "$system_hostname
echo "your kernal version : "$system_kernal_version
echo "your kernal name : "$system_kernal_name

<< comment 
hello there Nimesh how are
you well havent heard from you 
where are you now days
comment
read -p "Enter your name : " name
read -p "Enter your age : " age
echo "hello !! mr $name "
echo "your age is $age  "


