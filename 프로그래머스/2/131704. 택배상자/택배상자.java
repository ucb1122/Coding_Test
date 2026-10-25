import java.util.*;

class Solution {
    public int solution(int[] order) {
        int n = order.length;
        int[] stack = new int[n];  
        int top = -1;
        int idx = 0;              

        for (int box = 1; box <= n; box++) {
            if (box == order[idx]) {
                idx++;
            } else {
                stack[++top] = box;
            }

            while (top >= 0 && idx < n && stack[top] == order[idx]) {
                top--;
                idx++;
            }
        }
        return idx;
    }
}