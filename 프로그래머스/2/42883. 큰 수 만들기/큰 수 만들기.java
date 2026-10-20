class Solution {
    public String solution(String number, int k) {
        int n = number.length();
        int resultLen = n - k;              // 최종 결과 길이
        char[] stack = new char[n];
        int top = 0;                        // 스택의 크기

        for (int i = 0; i < n; i++) {
            char c = number.charAt(i);

            // 스택 맨 위가 현재 숫자보다 작으면 제거 (k가 남아있을 때만)
            while (k > 0 && top > 0 && stack[top - 1] < c) {
                top--;
                k--;
            }
            stack[top++] = c;
        }

        // k가 남아있으면 뒤에서 잘라내므로, 앞의 resultLen 개만 사용
        return new String(stack, 0, resultLen);
    }
}