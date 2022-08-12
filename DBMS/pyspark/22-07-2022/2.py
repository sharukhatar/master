from venv import create
from pyspark.sql import SparkSession

spark =(SparkSession \
        .builder\
            .appName("SparkSQL Demo")\
                .getOrCreate ()
            )
csv_file= "sales_info-2.csv"
df = (spark.read.format("csv")\
    .option("inferSchema","true")\
        .option("header","true")\
            .load(csv_file))

df.createOrReplaceTempView("stock_tbl")    
spark.sql("""SELECT Company, AVG (Sales)
            FROM stock_tbl
            GROUP BY Company""").show()
