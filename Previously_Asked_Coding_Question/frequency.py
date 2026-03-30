n = int(input())

arr = input().split()   # take input as strings

freq = {}

for x in arr:
    if x in freq:
        freq[x] = freq[x] + 1
    else:
        freq[x] = 1

for key in freq:
    print(key, "occurs", freq[key], "times")