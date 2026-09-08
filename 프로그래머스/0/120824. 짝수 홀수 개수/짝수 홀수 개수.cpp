#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    int even_count = 0;
    int odd_count = 0;
    
    for (int i = 0; i < num_list.size(); i++) {
        if (num_list[i] % 2 == 0) {
            even_count++;
        } else {
            odd_count++;
        }
    }
    return {even_count, odd_count};
}