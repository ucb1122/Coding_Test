def solution(s):
    count = 0      
    zeros_removed = 0
    
    while s != "1":
        count += 1
        num_zeros = s.count('0')
        zeros_removed += num_zeros
        ones_count = len(s) - num_zeros
        s = bin(ones_count)[2:]
        
    return [count, zeros_removed]