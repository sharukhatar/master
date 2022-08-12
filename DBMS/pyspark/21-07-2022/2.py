#by RDD
import sys
from pyspark import SparkContext,SparkConf
sc = SparkContext("local","Student example")
studentMarksData = sc.textFile("student.txt")
studentLines = studentMarksData.map(lambda l: l.split(","))
firstYearMarks = studentLines.filter(lambda x : x[1]=='year1') 
firstYearMarksMean = firstYearMarks.map(lambda x : [x[0],x[1],(float(x[2])+float(x[3]))/2])
firstYearMarksMeanList = firstYearMarksMean.collect()

secondYearMarks =studentLines.filter(lambda x : x[1] == 'year2')
secondYearMarksMean= secondYearMarks.map(lambda x : [x[0],x[1],(float(x[2])+float(x[3]))/2])
secondYearMarksMeanList = secondYearMarksMean.collect()
i=0
print("List of students whose second year aggregate is higher than that of the first year ...")

for firstListElement in firstYearMarksMeanList:
    secondListElement = secondYearMarksMeanList[i]
    if (secondListElement[2]>firstListElement [2]):
        print("Student : %s, Second year Aggrigate : %f , First Year Aggrigate : %f " %(firstListElement[0],secondListElement[2],firstListElement[2]))
        i+= 1



