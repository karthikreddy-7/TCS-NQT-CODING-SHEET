n=int(input("enter the first number:"))
m=int(input("enter the second number:"))
res=0
for i in range(n,m+1):
    res+=i*i*i
print("result is :",res)