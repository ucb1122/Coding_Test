#include <string>
#include <vector>

using namespace std;

vector<int> solution(int brown, int yellow) {
    int total = brown + yellow;
    
    for (int h = 3; h * h <= total; ++h) {
        if (total % h == 0) {
            int w = total / h; // 가로 길이 W
            
            if ((w - 2) * (h - 2) == yellow) {
                return {w, h};
            }
        }
    }
    
    return {};
}