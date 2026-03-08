s=input("enter the string:")
count_star=0
count_hash=0

for ch in s:
    if ch=='*':
        count_star+=1
    elif ch=='#':
        count_hash+=1
result=count_star-count_hash
print("the result is :",result)