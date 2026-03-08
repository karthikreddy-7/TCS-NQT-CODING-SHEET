arr1=[]
arr2=[]

m=int(input("Enter number of elements in array1: "))
print("Enter elements of array1:")
for i in range(m):
    arr1.append(int(input()))

n=int(input("Enter number of elements in array2: "))
print("Enter elements of array2:")
for i in range(n):
    arr2.append(int(input()))

# decide smaller and larger array
if m <= n:
    small = arr1
    large = arr2
else:
    small = arr2
    large = arr1

subset=True
for x in small:
    if x not in large:
        subset=False
        break

if subset:
    print("Smaller array is a subset of larger array")
else:
    print("No subset relationship")