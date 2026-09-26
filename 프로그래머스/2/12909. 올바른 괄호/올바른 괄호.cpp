#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{
    stack<int> st;
    
    if (s[0] == ')') {
        return false; 
    }
    
    st.push(s[0]);
    
    for (int i = 1; i < s.size(); i++) {
        if (s[i] == ')') {
            if (st.empty()) {
                return false;
            }
            st.pop();
        } else {
            st.push(s[i]);
        }
    }
    return (st.empty())? true: false;
}