#!/bin/bash
helloworld () {
    echo "hello $1"
    echo "Shell syntex is very easy"
}
helloworld
echo "-------------------------------"
sum()
{
    result=$(($1+$2+$3))
    #echo "SUM is : "$result
    #expr $1 * $2 * $3
    return $result 
    
}
sum "10" "20" "2"
y=$?
echo "SUM IS : "$y
z=$((y/2))
echo "Average is : "$z
echo "-------------------------------"
subtract()
{
    sub=`expr $1 \- $2`
    return $sub
}
read -p "Enter first number :" number1
read -p "Enter second number :" number2
subtract $number1 $number2
res=$?
echo "$number1 - $number2 = $res"
echo "-------------------------------"
multiplication()
{
    mulres=`expr $1 \* $2`
    return $mulres
}
read -p "Enter first number :" number1
read -p "Enter second number :" number2
multiplication $number1 $number2
res=$?
echo "$number1 * $number2 = $res"
