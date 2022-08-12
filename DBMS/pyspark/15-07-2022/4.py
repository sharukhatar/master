#4.Find the total and average balance for each type of job (4.py)

import sys
from pyspark import SparkContext,SparkConf

sc = SparkContext("local","Bank example")
bankData = sc.textFile("bank.csv")

bankLines = bankData.map(lambda l:l.split(","))

#only get job and balance field

selectedBankField = bankLines.map(lambda x:(x[1],int(x[5])))

#Claculate balance sum for each job

grouped_sum = selectedBankField.reduceByKey(lambda a,b:a+b)

for element in grouped_sum.collect():
    print(element)

# Now average

grouped_avg = selectedBankField.groupByKey().mapValues (lambda x: sum (x)/
len(x)) 

for element in grouped_avg.collect():
    print(element)