n=int(input("enter the number of element in the array "))
arr=list(map(int,input("enter the element :").split()))

if n%2==0:
    median=(arr[n//2-1]+arr[n//2])//2
else:
    median=arr[n//2]

print("Median is :", median)