digit=input()
n=len(digit)
total=0
for d in digit:
    total=total+int(d)**n
if total==int(digit):
    print("the number is amstrong")
else:
    print("not amstrong")

