#include <string>
#include <vector>
#include <cctype>

using namespace std;

string solution(string my_string) {
    string answer = "";
    for(char c : my_string) {
        if (islower(c)) {
            answer += toupper(c);
        } else {
            answer += tolower(c);
        }
    }
    return answer;
}