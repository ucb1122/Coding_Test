#include <vector>
#include <queue>
#include <set>
#include <algorithm>

using namespace std;

int dx[4] = {-1, 1, 0, 0};
int dy[4] = {0, 0, -1, 1};

int solution(vector<vector<int>> land) {
    int row = land.size();
    int col = land[0].size();

    vector<vector<bool>> visited(row, vector<bool>(col, false));
    vector<int> oil_per_cols(col, 0);

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (land[i][j] == 1 && !visited[i][j]) {
                int size = 0;
                set<int> visited_cols;
                queue<pair<int, int>> q;

                visited[i][j] = true;
                q.push({i, j});

                while (!q.empty()) {
                    auto [x, y] = q.front();
                    q.pop();

                    size++;
                    visited_cols.insert(y);

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if (nx >= 0 && nx < row && ny >= 0 && ny < col) {
                            if (land[nx][ny] == 1 && !visited[nx][ny]) {
                                visited[nx][ny] = true;
                                q.push({nx, ny});
                            }
                        }
                    }
                }

                for (int c : visited_cols) {
                    oil_per_cols[c] += size;
                }
            }
        }
    }

    int answer = *max_element(oil_per_cols.begin(), oil_per_cols.end());
    return answer;
}