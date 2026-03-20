arr = list(map(int, input("Enter elements: ").split()))

# Remove duplicates and keep order
unique = list(dict.fromkeys(arr))

print("After removing duplicates:", unique)


# arr = list(map(int, input("Enter sorted elements: ").split()))

# k = 0
# for j in range(1, len(arr)):
#     if arr[k] != arr[j]:
#         k += 1
#         arr[k] = arr[j]

# print("After removing duplicates:", arr[:k+1])