def solution(s):
    if len(s) % 2 != 0:
        return 0

    answer = 0
    n = len(s)

    for x in range(n):
        rotated = s[x:] + s[:x]

        if is_valid(rotated):
            answer += 1

    return answer


def is_valid(str_val):
    stack = []
    pair = {")": "(", "]": "[", "}": "{"}

    for ch in str_val:
        if ch in "([{":
            stack.append(ch)
        else:
            if not stack or stack[-1] != pair[ch]:
                return False
            stack.pop()

    return len(stack) == 0