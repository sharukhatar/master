def add_two_number(num1,num2):
    return num1 + num2

name =input("Enter your name = ")
print("welcome {0} to the world of containers !!".format(name))
print("You are about to start your journy with python and docker")
number1=int(input("Enter the first number = "))
number2=int(input("Enter the second number = "))
result=add_two_number(number1,number2)
print("Hello {0} sum is {1} + {2} = {3}".format(name,number1,number2,result))