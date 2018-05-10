# This python script will take one number as input n and print fibonacci series with n numbers.
n = int(input("Enter number for fibonacci"))
a = 0
b = 1
count = 0

if n <= 0:
    print ("\nPlease enter a positive integer")
elif n == 1:
    print ("\nFibonacci series: ")
    print (a)
else:
    print ("\nFibonacci series: ")
    while count < n:
        print (a)
        nth = a + b
        a = b
        b = nth
        count += 1
