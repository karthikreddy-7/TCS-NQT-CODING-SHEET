n=int(input("Enter number of elements: "))
arr=list(map(int,input("Enter elements: ").split()))

freq={}

for i in arr:
    if i in freq:
        freq[i]=freq[i]+1
    else:
        freq[i]=1

print("Frequency of elements:")
for key,value in freq.items():
    print("Frequency of ",key,"is",value)
    