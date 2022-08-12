#1. count number of users for every age (1.py)

from ast import Lambda
import sys

from pyspark import SparkContext

sc=SparkContext()
"""
-------------------------------------------------------------------------------------------------------
output=sc.textFile("bank.csv")\
        .map(lambda x: (x.split(',')[0],1))\
            .reduceByKey(lambda x,y:x+y ) 

print(output.collect())            
"""
# using count by key

otherMethod = sc.textFile("bank.csv")\
    .map(lambda x: (x.split(',')[0],1))\
        .countByKey()

dict_items = otherMethod.items()
print(otherMethod.items())
print("***now printing each items in the dictionary***")
for key, value in dict_items:
    print("Age:%s, Number of customers: %s" % (key,value))      
