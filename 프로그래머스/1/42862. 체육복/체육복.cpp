#include <vector>
#include <unordered_set>
#include <algorithm>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    unordered_set<int> reserve_set(reserve.begin(), reserve.end());

    vector<int> real_lost;
    for (int l : lost) {
        if (reserve_set.count(l)) {
            reserve_set.erase(l);
        } else {
            real_lost.push_back(l);
        }
    }

    sort(real_lost.begin(), real_lost.end());

    for (int l : real_lost) {
        if (reserve_set.count(l - 1)) {
            reserve_set.erase(l - 1);
        } else if (reserve_set.count(l + 1)) {
            reserve_set.erase(l + 1);
        } else {
            n--;
        }
    }
    return n;
}