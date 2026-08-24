from collections import Counter

def solution(topping):
    answer = 0
    brother = Counter(topping)
    chulsoo = set()
    brother_type_count = len(brother)
    
    for t in topping:
        chulsoo.add(t)
        brother[t] -= 1
        
        if brother[t] == 0:
            brother_type_count -= 1
            
        if len(chulsoo) == brother_type_count:
            answer += 1
            
    return answer