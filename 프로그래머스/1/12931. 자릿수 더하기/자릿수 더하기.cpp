#include <iostream>
#include <algorithm>

using namespace std;
int solution(int n)
{
    int answer = 0;
    string str = to_string(n);
    for (int i = 0; i < str.size(); i++) {
        answer += n % 10;
        n = (int) n / 10;
    }
    return answer;
}