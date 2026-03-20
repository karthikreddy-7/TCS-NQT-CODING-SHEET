# ### 📝 Duplicate Transaction Detection (Short)

# You are given `n` transactions. Each transaction has:

# ```
# Sender Receiver Amount Timestamp
# ```

# ### 🎯 Task:

# Print a transaction if:

# * **Sender, Receiver, Amount are same**
# * But **Timestamp is different**

# ---

# ### 📥 Input:

# * Integer `n`
# * Next `n` lines: transaction details

# ---

# ### 📤 Output:

# * Print duplicate transactions

# ---

# ### 📌 Example:

# **Input:**

# ```
# 2
# Anto Logesh 50 11111
# Anto Logesh 50 12292
# ```

# **Output:**

# ```
# Anto Logesh 50 12292
# ```



n = int(input())

transactions = {}

for _ in range(n):
    sender, receiver, amount, timestamp = input().split()
    
    key = (sender, receiver, amount)
    
    if key in transactions:
        if transactions[key] != timestamp:
            print(sender, receiver, amount, timestamp)
    else:
        transactions[key] = timestamp