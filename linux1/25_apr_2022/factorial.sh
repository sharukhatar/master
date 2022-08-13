#!/bin/bash

Factorial()
{   
    result=1
    for ((i=1;i<=$number;i++)) 
    do
        result=$((result*i))
    done
    echo $result     
}
read -p "Enter the number = " number
Factorial $number 
<<comment
Factorial()
{   
    result=1
    for i in {1..5}
    do
        result=$((result*i))
    done
    echo $result     
}
Factorial 
comment
