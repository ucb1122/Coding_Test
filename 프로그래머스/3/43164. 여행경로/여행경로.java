import java.util.*;

class Solution {

    ArrayList<String> path = new ArrayList<>();
    
    String[] answer;

    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                if (a[0].equals(b[0])) {
                    return a[1].compareTo(b[1]);
                }
                return a[0].compareTo(b[0]);
            }
        });

        boolean[] isVisited = new boolean[tickets.length];

        path.add("ICN");
        dfs("ICN", 0, isVisited, tickets);

        return answer;
    }

    public boolean dfs(String cur, int count, boolean[] isVisited, String[][] tickets) {
        if (count == tickets.length) {
            answer = path.toArray(new String[0]);

            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!isVisited[i] && tickets[i][0].equals(cur)) {
                isVisited[i] = true;
                path.add(tickets[i][1]);

                if (dfs(tickets[i][1], count + 1, isVisited, tickets)) {
                    
                    return true;
                }
                path.remove(path.size() - 1);
                isVisited[i] = false;
            }
        }
        return false;
    }
}