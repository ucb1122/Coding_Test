def solution(n):
    target_count = bin(n).count('1')
    
    next_num = n + 1
    while True:
        if bin(next_num).count('1') == target_count:
            return next_num
        next_num += 1