n=int(input("Enter the number of the chocolate: "))
choco=[]
for i in range(n):
    choco.append(int(input("Enter the each elemt of array: ")))
count=0
for i in range(n):
    if(choco[i]!=0):
        choco[count]=choco[i]
        count+=1
for i in range(count,n):
    choco[i]=0
print("The number of the chocolate is: ",choco)

