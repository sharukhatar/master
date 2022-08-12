

import sys
from pyspark import SparkContext, SparkConf
sc =SparkContext("local", "Pyspark RRD example")
myRDD= sc.parallelize([('Big Data',80),('Python',85),('ML',56),('java',67),('web analytics',78),('Good programming practices',67),('software design',77)])
myRDD.take(7)
myRDD.saveAsTextFile("myRDD/")
