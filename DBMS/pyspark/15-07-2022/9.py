#4.top three student who have the highest average gardes (9.py)

import sys
from pyspark import SparkContext, SparkConf
sc = SparkContext("local","Student example")
studentData =sc.textFile("student.txt")
Data = studentData.map(lambda l:l.split(","))

avg=Data.map(lambda x:(x[0],x[1],((float(x[2])+float(x[3]))/2))).filter(lambda x:x[1]=='year2').sortBy(lambda x: -x[2])
topThree = avg.take (3)
print(topThree)

""" for element in avg.collect():
    print(element) """