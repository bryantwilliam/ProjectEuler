# Page 1, Problem 14

def evenN(n):
    return n / 2

def oddN(n):
    return 3 * n + 1

def getCollatz(n):
    if n % 2 == 0:
        return evenN(n)
    return oddN(n)

def generateCollatzSequence(n):
    collSeq = [n]
    while n > 1:
        n = getCollatz(n)
        collSeq.append(n)
    return collSeq

"""
Iterates through every number (n) below a million, printing the longest
collatz sequence so far, when n is the starting number
"""
longestCollSeq = []
for n in reversed(range(int(1e6))):
    collSeq = generateCollatzSequence(n)
        
    if len(collSeq) > len(longestCollSeq):
        longestCollSeq = collSeq
        print(collSeq, "\nLength of collatz sequence so far:", len(collSeq),
              "\nStarting number (n):", n)

# ANSWER: 837799 starting number of the collatz sequence with a length of 525
