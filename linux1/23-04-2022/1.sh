#!/bin/bash
for i in 1 2 3 4 5 
do
    echo "Loop runs $i times "
done  
echo "-------------------------------"
for i in {0..4}
do
    echo "Loop runs $i times "
done 
echo "-------------------------------"
for i in {0..10..2}
do
    echo "Value of i is : $i "
done 
str="hi"
echo "Length is ${#str}"

print_it () {  
    echo Hello $1  
    return 5  
}  
  
print_it User  
print_it Reader  
echo The previous function returned a value of $?  