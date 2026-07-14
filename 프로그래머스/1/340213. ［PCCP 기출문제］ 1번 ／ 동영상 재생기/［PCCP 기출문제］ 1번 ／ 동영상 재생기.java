class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int totalLen = toSeconds(video_len);
        int current = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);

        for (String command : commands) {
            if (current >= opStart && current <= opEnd) {
                current = opEnd;
            }

            if (command.equals("prev")) {
                current -= 10;
                if (current < 0) current = 0;
            } else if (command.equals("next")) {
                current += 10;
                if (current > totalLen) current = totalLen;
            }
        }

        if (current >= opStart && current <= opEnd) {
            current = opEnd;
        }

        return toTimeString(current);
    }

    private int toSeconds(String timeStr) {
        String[] parts = timeStr.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return (minutes * 60) + seconds;
    }

    private String toTimeString(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}