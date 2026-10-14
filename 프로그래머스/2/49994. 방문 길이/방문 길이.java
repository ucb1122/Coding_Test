import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();

        int x = 0;
        int y = 0;
        int answer = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char command = dirs.charAt(i);

            int nx = x;
            int ny = y;

            switch (command) {
                case 'U': 
                    ny++; 
                    break;
                case 'D': 
                    ny--; 
                    break;
                case 'R': 
                    nx++; 
                    break;
                case 'L': 
                    nx--; 
                    break;
            }

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            String forward = x + "," + y + "->" + nx + "," + ny;
            String backward = nx + "," + ny + "->" + x + "," + y;

            if (!visited.contains(forward)) {
                answer++;

                visited.add(forward);
                visited.add(backward);
            }

            x = nx;
            y = ny;
        }
        return answer;
    }
}