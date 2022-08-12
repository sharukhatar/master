from pyspark.sql import SparkSession
spark =SparkSession.builder.appName('lr_examples').getOrCreate()
from pyspark.ml.regression import LinearRegression
data = spark.read.csv('Ecommerse_Customers.csv', inferSchema = True, header =True)

data.printSchema()
data.show()
data.head(1)
for item in data.head(2)[1]:
    print(item)
    
