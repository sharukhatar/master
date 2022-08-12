from pyspark.sql import SparkSession
from pyspark.sql.types import StructField,StringType,IntegerType,FloatType,StructType

from pyspark.sql.functions import format_number 

spark = SparkSession.builder.appName("Python Spark data frame exam").getOrCreate()

data_schema = [StructField ('student_id',StringType(),True),
               StructField('year',StringType(),True),
               StructField('sem_1',FloatType(),True), 
               StructField('sem_2',FloatType(),True)]                    

final_struct = StructType (fields = data_schema)
df= spark.read.csv("student.txt", header =False,schema =final_struct)

filtered_df =df.filter (df['year']=='year2')
result_df = filtered_df.select('student_id','year',format_number(((df['sem_1']+df['sem_2'])/2),2).alias ("Avg Marks"))
result_df.show()
#problem 3
#result_df.orderBy (result_df['AvgMarks'].desc()).show()

#problem 4
#result_df.orderBy(result_df['AvgMarks'].desc()).show(3)


