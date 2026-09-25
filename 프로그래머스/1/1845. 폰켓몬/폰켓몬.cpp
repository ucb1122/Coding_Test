#include <vector>
#include <unordered_set>

using namespace std;

int solution(vector<int> nums)
{
    unordered_set<int> hash_set; 
    
    for (int n : nums) {
        hash_set.insert(n);
    }
    
    int select = nums.size() / 2;
    int count = hash_set.size();
        
    return (select > count)? count : select;
}