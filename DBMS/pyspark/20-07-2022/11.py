from pyspark.sql import SparkSession

spark = SparkSession.builder.appName('Missing').getOrCreate()
df = spark.read.csv ('containsNull.csv',inferSchema = True, header = True)
df.show()

#Drop rows that have any null value columns
df.na.drop().show()

# A row must have at least two non-null columns to appear in the output
df.na.drop(thresh = 2).show()

#Drop rows that have any null value columns 

df.na.drop(how='any').show()

#Drop rows that have all null value 
df.na.drop(how='all').show()

#Drop rows that have a null value inthe sales columns
df.na.drop(subset = ['Sales']).show()

#Fill null values with our own value
df.na.fill('Dummy Insert').show()

#Fill null values with zeros for numeric columns 
df.na.fill(0).show()

#Fill name values only for name columns with our own value
df.na.fill('No name',subset = ['Name']).show()