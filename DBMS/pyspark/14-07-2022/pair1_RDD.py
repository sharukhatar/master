import sys
from pyspark import SparkContext,SparkConf
sc = SparkContext("local","Pair RDD example")

marks_rdd=sc.parallelize([('Rahul',25),('Swati',26),('Shreya',22),('Abhay',29),('Rohan',22),('Rahul',23),('Swati',19),('Shreya',28),('Abhay',26),('Rohan',22)])

mobile_rdd=sc.parallelize([('Rahul','9898989898'),('Swati','9797979797'),('Shreya','9696969696'),('Abhay','9595959595'),('Rohan','9494949494')])

full_rdd = marks_rdd.join(mobile_rdd)
for key,value in full_rdd.collect():
    print(key, list(value))