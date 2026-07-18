import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int len = board.length;
        
        List<Integer>[] board_list = new ArrayList[len];
        
        for (int col = 0; col < len; col++) {
            board_list[col] = new ArrayList<>();
            for (int row = 0; row < len; row++) {
                if (board[row][col] != 0) {
                    board_list[col].add(board[row][col]);
                }
            }
        }
        
        int answer = 0;
            
        for (int i = 0; i < moves.length; i++) {
            int play = moves[i] - 1; 
                
            if (!board_list[play].isEmpty()) {
                int doll = board_list[play].remove(0); 
                
                if (!stack.isEmpty() && stack.peek() == doll) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(doll);
                }
            }
        }
        return answer;
    }
}