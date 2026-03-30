n=int(input("enter the number of element in the array "))
arr=list(map(int,input("enter the element :").split()))
maximum=0
for i in arr:
    if i>maximum:
        maximum=i

print("maximum element is :",maximum)