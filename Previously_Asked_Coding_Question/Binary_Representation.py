n= int(input("Enter a number: "))
binary=""
temp=n
while temp>0:
    bit=temp&1
    binary=str(bit)+binary
    temp=temp>>1

power=0
result=0
for i in range(len(binary)-1,-1,-1):
    if(binary[i]=="0"):
        result+=2**power
    power+=1
print("Binary representation of",n,"is",binary)
print("Decimal representation of",binary,"is",result)   