n = int(input("Enter number of elements: "))
arr = list(map(int, input().split()))

# Increasing order
arr.sort()
print("Increasing:", arr)

# Decreasing order
arr.sort(reverse=True)
print("Decreasing:", arr)


# n = int(input("Enter number of elements: "))
# arr = list(map(int, input().split()))

# # Increasing order
# for i in range(n):
#     for j in range(n):
#         if arr[i] < arr[j]:
#             arr[i], arr[j] = arr[j], arr[i]

# print("Increasing:", arr)

# # Decreasing order
# for i in range(n):
#     for j in range(n):
#         if arr[i] > arr[j]:
#             arr[i], arr[j] = arr[j], arr[i]

# print("Decreasing:", arr)