from requests import Session
from pyspark.sql import SparkSession
spark = SparkSession.builder.appName('Basics').getOrCreate()
df = spark.read.csv ('appl_stock.csv',inferSchema = True, header = True)


#df.filter((df['Close']<500)&(df['Open']>200)).select(['Open','Close']).show()
#df.filter((df['Close']<500)&(df['Open']>200)).select(['Open','Close']).show(100)
filtered = df.filter(df['Low']== 197.16).collect()
print(filtered)
