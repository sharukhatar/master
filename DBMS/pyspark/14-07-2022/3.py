import sys
from pyspark import SparkContext, SparkConf
sc = SparkContext("local","Bank example")
bankData =sc.textFile("bank.csv")

bankLines= bankData.map(lambda l:l.split(","))

#only get job material status, and balance fields
selectedBankFields = bankLines.map (lambda x:(x[1],x[2],x[5]))

filteredData = selectedBankFields.filter(lambda f:(f[0]=='blue-collar' and f[1]=='divorced'))

#only get the balance field - convert to integer

onlyBalance = filteredData.map(lambda x: int((x[2])))
#convert to a list
balanceList = onlyBalance.collect()

avgBal = sum (balanceList)/len (balanceList)

print("Average balance is : %d" %avgBal)

