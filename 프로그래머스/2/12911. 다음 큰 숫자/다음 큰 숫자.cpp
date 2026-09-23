#include <string>
#include <vector>
#include <bitset>

using namespace std;

int solution(int n) {
    int target_count = bitset<20>(n).count();
    
    int next_num = n + 1;
    while (true) {
        if (bitset<20>(next_num).count() == target_count) {
            return next_num;
        }
        next_num++;
    }
}