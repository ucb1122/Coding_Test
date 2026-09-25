#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int max_count = 0; 
bool visited[8];

void dfs(int current_k, int count, const vector<vector<int>>& dungeons) {
    max_count = max(max_count, count);

    for (int i = 0; i < dungeons.size(); i++) {
        if (!visited[i] && current_k >= dungeons[i][0]) {
            visited[i] = true;
            
            dfs(current_k - dungeons[i][1], count + 1, dungeons);
            
            visited[i] = false;
        }
    }
}

int solution(int k, vector<vector<int>> dungeons) {
    max_count = 0;
    
    dfs(k, 0, dungeons);

    return max_count;
}