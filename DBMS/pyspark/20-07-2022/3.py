from requests import Session
from pyspark.sql import SparkSession
spark = SparkSession.builder.appName('Basics').getOrCreate()
df = spark.read.csv ('appl_stock.csv',inferSchema = True, header = True)
df.printSchema ()
df.filter("Close < 500").show()
df.filter("Close<500").slect(['open','close']).show()
