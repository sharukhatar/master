from pyspark.sql import SparkSession
from pyspark.sql.functions import countDistinct,avg,count,min
spark = SparkSession.builder.appName('Basics').getOrCreate()
df = spark.read.csv ('sales_info-2.csv',inferSchema = True, header = True)

df.select(countDistinct('Sales')).show()
#Earlier sentax
df.agg({'Sales' : 'avg'}).show()

#Another syntax fro the same thing

df.select(avg('Sales')).show()
df.select(count('Sales')).show()
df.select(min('Sales')).show()
