list = [3, 4, -7, 1, 3, 3, 1, -4]
k = 7
n = len(list)
res = []
for i in range(n):
    temp = []
    total = 0
    for j in range(i, n):
        total += list[j]
        temp.append(list[j])
        if total == k:
            print(temp)

            # res.append(temp)
