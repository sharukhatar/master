#2. Find the total number of married and unmarried 
from ast import Lambda
import sys

from pyspark import SparkContext

sc=SparkContext()
otherMethod = sc.textFile("bank.csv")\
    .map(lambda x: (x.split(',')[2],1))\
        .filter(lambda x: x[0] !='divorced' )\
        .countByKey()

dict_items = otherMethod.items()
print(otherMethod.items())
print("***now printing each items in the dictionary***")
for key, value in dict_items:
    print("Status of marriege : %s, count: %s" % (key,value))  