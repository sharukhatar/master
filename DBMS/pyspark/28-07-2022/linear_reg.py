from pyspark.sql import SparkSession
from pyspark.ml.regression import LinearRegression
from pyspark.ml.linalg import Vectors
from pyspark.ml.features import VectorAssembler

spark =SparkSession.builder.appName('lr_examples').getOrCreate()

data = spark.read.csv('Ecommerse_Customers.csv', inferSchema = True, header =True)
assembler = VectorAssembler(inputCols = ['Avg Session Length', 'Time on App','Time on website','Length of Membership' ],outputCol = 'features')
output = assembler.transform(data)
output.printSchema()
output.select('features').show()
print(output.head(1))


