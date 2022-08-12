import pyspark
from pyspark.sql import SparkSession
from pyspark.sql.functions import *
spark = SparkSession.builder.appName('Basics').getOrCreate()
empDF = spark.read.csv('emp.csv',inferSchema = True,header = True)
deptDF = spark.read.csv('dept.csv',inferSchema = True,header = True)

empDF.show()
deptDF.show()



#empDF.join(deptDF,empDF.emp_dept_id == deptDF.dept_id, "inner").show()
# empDF.join(deptDF, empDF.dept_id == deptDF.emp_dept_id, "outer").show()

# empDF.join(deptDF, deptDF.emp_dept_id == empDF.emp_dept_id).show()


empDF.join(deptDF,empDF.emp_dept_id == deptDF.emp_dept_id, "full").show()
'''empDF.join(deptDF,empDF.emp_dept_id == deptDF.dept_id, "fullouter").show()
empDF.join(deptDF,empDF.emp_dept_id == deptDF.dept_id, "left").show()
empDF.join(deptDF,empDF.emp_dept_id == deptDF.dept_id, "leftouter").show()
empDF.join(deptDF,empDF.emp_dept_id == deptDF.dept_id, "right").show()
empDF.join(deptDF,empDF.emp_dept_id == deptDF.dept_id, "rightouter").show()
'''