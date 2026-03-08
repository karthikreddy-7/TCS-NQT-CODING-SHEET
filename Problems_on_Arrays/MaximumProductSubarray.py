n=int(input("enter the number of element :"))
arr=list(map(int,input("enter the elements :").split()))

max_prod=arr[0]

for i in range(n):
    prod=1
    for j in range(i,n):
        prod*=arr[j]
        if prod>max_prod:
            max_prod=prod

print("maximum product of subset is :",max_prod)