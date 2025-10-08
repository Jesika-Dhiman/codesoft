# Python Basic Exercises

# 1. Print Hello World
print("Hello, World!")

# 2. Print multiple values
print("Name:", "Age:", 20)

# 3. Arithmetic operations
a, b = 10, 3
print(a+b, a-b, a*b, a/b, a%b, a**b)

# 4. Odd or Even
num = 5
print("Even" if num % 2 == 0 else "Odd")

# 5. Positive, Negative, or Zero
n = -2
if n > 0: print("Positive")
elif n < 0: print("Negative")
else: print("Zero")

# 6. Leap Year
year = 2024
print("Leap Year" if (year%4==0 and year%100!=0) or (year%400==0) else "Not Leap Year")

# 7. Numbers 1 to N
for i in range(1, 6): print(i)

# 8. Squares of numbers
for i in range(5): print(i**2)

# 9. Reverse number
n = 1234
rev = 0
while n>0:
    rev = rev*10 + n%10
    n//=10
print("Reverse:", rev)

# 10. Factorial
def fact(n):
    return 1 if n==0 else n*fact(n-1)
print("Factorial:", fact(5))

# 11. Prime check
def is_prime(n):
    if n<2: return False
    for i in range(2, int(n**0.5)+1):
        if n%i==0: return False
    return True
print(is_prime(7))

# 12. Fibonacci
def fib(n):
    a,b=0,1
    for _ in range(n):
        print(a, end=" ")
        a,b=b,a+b
fib(5)

# 13. List operations
lst = [1,3,2]
lst.append(4)
lst.insert(1,5)
lst.remove(3)
lst.sort()
print(lst)

# 14. List comprehension
print([x**2 for x in range(10) if x%2==0])

# 15. Tuple immutability
t = (1,2,3)
print(t)

# 16. Set remove duplicates
print(set([1,2,2,3,4,4]))

# 17. Dictionary operations
d = {'a':1, 'b':2}
d['c']=3
print(d)

# 18. Count vowels
s = "hello"
print(sum(1 for c in s if c in 'aeiou'))

# 19. Reverse string
print(s[::-1])

# 20. Palindrome check
word = "madam"
print("Palindrome" if word == word[::-1] else "Not")

# 21. f-String
name, age = "John", 25
print(f"My name is {name} and I am {age} years old.")
