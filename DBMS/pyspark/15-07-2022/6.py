"""
You are given data indiacating students garades for a two- year (four - semester )course.
seven students are enrolled in this course.
The 'student.txt' file depicts two years  of gradedata, devided into semisters for seven enrolled students

fields are: student id ,year, semester 1 marks, semester 2 marks,
"""
# Calculate average year wise marks (i.e for 2 semester for a year)for each student (6.py)
import sys
from pyspark import SparkContext, SparkConf
sc = SparkContext("local","Student example")
studentData =sc.textFile("student.txt")
Data = studentData.map(lambda l:l.split(","))

avg=Data.map(lambda x:(x[0],x[1],(float(x[2])+float(x[3])/2)))

for element in avg.collect():
    print(element)