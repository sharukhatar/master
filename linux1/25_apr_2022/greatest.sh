#!/bin/bash
greatest()
{
    if [ $number1 -gt $number2 ] && [ $number1 -gt $number3 ]
    then
    echo "$number1 is greater"
    elif [ $number2 -gt $number3 ]
    then
     echo "$number2 is greater"
    else
     echo "$number3 is greater"
     fi
}
read -p "Enter First number : " number1
read -p "Enter Second number : " number2
read -p "Enter Third number : " number3
greatest $number1 $number2 $number3
