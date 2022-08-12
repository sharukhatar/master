from venv import create
from pyspark.sql import SparkSession

spark =(SparkSession \
        .builder\
            .appName("SparkSQL Demo")\
                .getOrCreate ()
            )
csv_file= "customers.txt"
df = (spark.read.format("csv")\
    .option("inferSchema","true")\
        .option("header","true")\
            .load(csv_file))

#1.Display all the customer in San Jose Whose rating is above 200.

df.createOrReplaceTempView("customer_tbl")    
spark.sql("""SELECT cname,city,rating
            FROM customer_tbl
            WHERE city='San Jose' AND rating >200 """).show()

#by Dataframe

df.select(['cname','city','rating']).filter((df.city=="San Jose") & (df.rating>200)).show()

#2.Display all the customer who are in San Jose or whose rating is above 200
df.createOrReplaceTempView("customer_tbl")    
spark.sql("""SELECT cname,city,rating
            FROM customer_tbl
            WHERE city='San Jose' AND rating > 200 """).show()

#by Dataframe

df.select(['cname','city','rating']).filter((df.city=="San Jose") & (df.rating>200)).show()
