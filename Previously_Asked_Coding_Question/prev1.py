arr=[1, 3, -1, -3, 5, 3, 6, 7]
k=3
res=[]
for i in range(len(arr)-k+1):
    m=arr[i]
    for j in range(i,i+k):
        if arr[j]>m:
            res.append(arr[j])
print(res)