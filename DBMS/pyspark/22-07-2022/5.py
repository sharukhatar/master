#Find all detail about sales people

from venv import create
from pyspark.sql import SparkSession

spark =(SparkSession \
        .builder\
            .appName("SparkSQL Demo")\
                .getOrCreate ()
            )
csv_file= "salespeople.txt"
#schema = "`snum`INT, `sname`STRING, `city`STRING, `comm`FLOAT"
df = (spark.read.format("csv")\
    .option("inferSchema","true")\
        .option("header","true")\
#           .schema(schema)\
            .load(csv_file))

#Find salespeople located either in Barcelona or London 
df.select(['sname','city']).filter((df.city=="Barcelona") | (df.city=="London")).show()
            

#1.Find all detail about sales people
#by sql
# df.createOrReplaceTempView("salespeople_tbl")    
# spark.sql("""SELECT snum,sname,city,comm
#             FROM salespeople_tbl
#             """).show()
#by DataFrame
# df.select(['sname','city','comm']).show()

#2. Do the same thing by using the * syntax
# df.createOrReplaceTempView("salespeople_tbl")    
# spark.sql("""SELECT *
#             FROM salespeople_tbl
#             """).show()
#by DataFrame
# df.select(['*']).show()
#3. Show only the sales people name and commissions.
# df.createOrReplaceTempView("salespeople_tbl")    
# spark.sql("""SELECT sname,comm
#             FROM salespeople_tbl
#             """).show()
#by DataFrame
# df.select(['sname','comm']).show()

#4. Display names and commission of all the salespeople in London 
df.createOrReplaceTempView("salespeople_tbl")    
spark.sql("""SELECT sname,city
            FROM salespeople_tbl
            WHERE city='London'""").show()

#by DataFrame
df.select(['sname','city']).filter(df.city == 'London').show()        

