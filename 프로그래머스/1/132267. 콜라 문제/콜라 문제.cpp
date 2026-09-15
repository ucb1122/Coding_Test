#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int n) {
    int answer = 0;
    
    while (n >= a) {
        int new_coke = (n / a) * b;
        int rest = n % a;           
        
        answer += new_coke;        
        n = new_coke + rest;       
    }
    
    return answer;
}