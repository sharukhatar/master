#SQL

from venv import create
from pyspark.sql import SparkSession

spark =(SparkSession \
        .builder\
            .appName("SparkSQL Demo")\
                .getOrCreate ()
            )
csv_file= "appl_stock.csv"
df = (spark.read.format("csv")\
    .option("inferSchema","true")\
        .option("header","true")\
            .load(csv_file))
#SQL
# df.createOrReplaceTempView("stock_tbl")
# spark.sql("""SELECT Date,Open, Close
#         FROM stock_tbl
#         WHERE Close <500 """).show(5)    


#Data frame
# df.filter ((df['Close']<500)&(df['Open']>200)).select(['Open','Close']).show(5)

#SQL
# df.createOrReplaceTempView("stock_tbl")
# spark.sql("""SELECT Date,Close ,Open 
#             FROM stock_tbl
#             WHERE Close <500 AND Open>200""").show(10)

df.createOrReplaceTempView("stock_tbl")    
spark.sql("""SELECT *
            FROM stock_tbl
            WHERE low=197.16""").show()

