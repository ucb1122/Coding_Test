import java.util.*;

class Solution
{
    public int solution(int bridge_length, int weight, int[] truck_weights)
    {
        int answer = 0;
        int currentWeight = 0;
        int idx = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++)
        {
            bridge.add(0);
        }

        while (idx < truck_weights.length)
        {
            answer++;
            currentWeight -= bridge.poll();

            if (currentWeight + truck_weights[idx] <= weight)
            {
                bridge.add(truck_weights[idx]);
                currentWeight += truck_weights[idx];
                idx++;
            }
            else
            {
                bridge.add(0);
            }
        }

        return answer + bridge_length;
    }
}