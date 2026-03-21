s1=input().lower().replace(" ","")
s2=input().lower().replace(" ","")
if sorted(s1)==sorted(s2):
    print("The given strings are anagrams")
else:
    print("The given strings are not anagrams")