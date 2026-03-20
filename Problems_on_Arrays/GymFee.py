
# Gym Membership Cost Calculator

# A gym offers membership plans for fixed durations with predefined prices.

# 💰 Pricing Details:

# 1 month → 2000

# 3 months → 5000

# 6 months → 9000

# 9 months → 12000

# 12 months → 15000

# 🎯 Problem Statement

# Write a program to calculate the total minimum cost of a gym membership for a given number of months n.

# 📥 Input

# An integer n representing the number of months

# 📤 Output

# Print the minimum total cost using any combination of available plans

# If it is not possible to exactly match n, print:

# Error
# 📌 Examples
# Example 1
# Input:
# 12
# Output:
# 15000

# Example 2
# Input:
# 24
# Output:
# 30000


def gym_fee(n):
    if n % 12 == 0:
        return (n // 12) * 15000
    elif n % 9 == 0:
        return (n // 9) * 12000
    elif n % 6 == 0:
        return (n // 6) * 9000
    elif n % 3 == 0:
        return (n // 3) * 5000
    else:
        return "Error"