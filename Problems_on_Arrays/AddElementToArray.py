n=int(input("enter the number of element in the array:"))
arr=[]
for i in range(n):
    arr.append(int(input()))

a=int(input("enter the element that should be inserted :"))
b=int(input("enter the position where it should be inserted :"))
arr.insert(b,a)
print(arr)