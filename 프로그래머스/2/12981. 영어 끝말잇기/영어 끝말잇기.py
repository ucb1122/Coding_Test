def solution(n, words):
    used_words = set()
    used_words.add(words[0])

    for i in range(1, len(words)):
        word = words[i]
        prev_word = words[i - 1]

        if word[0] != prev_word[-1] or word in used_words:
            person_num = (i % n) + 1
            turn_num = (i // n) + 1
            return [person_num, turn_num]

        used_words.add(word)

    return [0, 0]