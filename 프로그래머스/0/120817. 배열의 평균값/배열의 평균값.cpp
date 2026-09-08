#include <string>
#include <vector>

using namespace std;

double solution(vector<int> numbers) {
    int sum = 0;
    int count = 0; 
    for (int i = 0; i < numbers.size(); i++) {
        sum += numbers[i];
        count++;
    }
    return (double) sum / count;
}