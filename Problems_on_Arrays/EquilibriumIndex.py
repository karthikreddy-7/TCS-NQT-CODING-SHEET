m=int(input("enter the number of element in the array :"))
arr=[]
print("enter the element of the array :")
for i in range(m):
    arr.append(int(input()))
total=sum(arr)
left_sum=0
for i in range(m):
    right_sum=total-left_sum-arr[i]

    if right_sum==left_sum:
        print("equilibrium point is :",i)
        break
    left_sum+=arr[i]

else:
    print("no equilibrium point found.")