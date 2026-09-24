#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    vector<int> first = {1, 2, 3, 4, 5};
    vector<int> second = {2, 1, 2, 3, 2, 4, 2, 5};
    vector<int> third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int fCount = 0; 
    int sCount = 0;
    int tCount = 0; 

    for (int i = 0; i < answers.size(); i++) {
        if (answers[i] == first[i % first.size()]) {
            fCount++;
        }
        
        if (answers[i] == second[i % second.size()]) {
            sCount++;
        }
        
        if (answers[i] == third[i % third.size()]) {
            tCount++;
        }
        
    }
    int maxScore = max({fCount, sCount, tCount});  
        
    if (fCount == maxScore) answer.push_back(1);
    if (sCount == maxScore) answer.push_back(2);
    if (tCount == maxScore) answer.push_back(3);

    return answer;
}