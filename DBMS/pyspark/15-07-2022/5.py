#5. Find jobs and balancees that have balance value higheer than the average of blue-coller people(5.py)



import sys
from pyspark import SparkContext,SparkConf

sc = SparkContext("local","Bank example")
bankData = sc.textFile("bank.csv")

bankLines = bankData.map(lambda l:l.split(","))

#only get job and balance field

selectedBankFields = bankLines.map(lambda x:(x[1],int(x[5])))
filteredData = selectedBankFields.filter (lambda f: (f[0]=='blue-collar'))

#only get balanced field - convert to integer
onlyBalance =filteredData.map(lambda x:int(x[1]))

#convert to a list

balancelist =onlyBalance.collect()
avgBal = sum(balancelist)/len(balancelist)

print("Blue coller average is %d"% avgBal)

higherThanBlueCollarAverage =selectedBankFields.filter(lambda f: int(f[1])> avgBal)

#print in the output screen 

for element in higherThanBlueCollarAverage.collect():
    print("job:%s and balance : %d"%(element[0],element[1]))

