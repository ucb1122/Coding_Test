from collections import Counter

def solution(want, number, discount):
    answer = 0
    
    want_dict = {}
    for w, n in zip(want, number):
        want_dict[w] = n
        
    for i in range(len(discount) - 9):
        window_counter = Counter(discount[i:i + 10])
        
        if window_counter == want_dict:
            answer += 1
            
    return answer