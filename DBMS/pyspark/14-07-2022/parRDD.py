import sys
from pyspark import SparkContext,SparkConf
sc = SparkContext("local","pair RDD example")

marks_rdd=sc.parallelize([('Rahul',25),('Swati',26),('Shreya',22),('Abhay',29),('Rohan',22),('Rahul',23),('Swati',19),('Shreya',28),('Abhay',26),('Rohan',22)])


#Display marks sorted by student name

print(marks_rdd.sortByKey('ascending').collect())

print(marks_rdd.sortByKey(False).collect())