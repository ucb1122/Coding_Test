#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int count = 0;
    long l = num; 
    
    while (count < 500 && l != 1) {
        if (l % 2 == 0) {
            l = l / 2;
        } else {
            l = (l * 3) + 1;
        }
        count++;
    }
    return (l == 1)? count: -1;  
}