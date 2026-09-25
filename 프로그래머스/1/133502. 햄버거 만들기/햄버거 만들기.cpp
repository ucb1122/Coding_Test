#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ingredient) {
    int answer = 0;
    vector<int> st;
    st.reserve(ingredient.size());

    for (int x : ingredient) {
        st.push_back(x);
        int n = st.size();
        if (n >= 4 &&
            st[n-4] == 1 && st[n-3] == 2 &&
            st[n-2] == 3 && st[n-1] == 1) {
            st.pop_back();
            st.pop_back();
            st.pop_back();
            st.pop_back();
            answer++;
        }
    }
    return answer;
}