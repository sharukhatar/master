#!/bin/bash
index_array=(1 2 3 4 5 6)
echo ${index_array[0]}
for i in ${index_array[@]}
do
    echo $i
done
echo "length of the array is: ${#index_array[@]}"

name[0]="nancy"
name[1]="riya"
name[2]="vansh"
name[3]="yash"
name[4]="sakshi"
echo "First Index value : ${name[0]}"
echo "All members of array : ${name[*]}"
echo "All members of array : ${name[@]}"


