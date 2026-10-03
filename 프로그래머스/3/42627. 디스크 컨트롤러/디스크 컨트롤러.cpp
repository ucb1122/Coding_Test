#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

struct Compare {
    bool operator()(const vector<int>& a, const vector<int>& b) {
        return a[1] > b[1];
    }
};

int solution(vector<vector<int>> jobs) {
    int total_turnaround_time = 0;
    int now = 0;      
    int job_idx = 0; 
    int count = 0;  
    int n = jobs.size();

    sort(jobs.begin(), jobs.end());

    priority_queue<vector<int>, vector<vector<int>>, Compare> pq;

    while (count < n) {
        while (job_idx < n && jobs[job_idx][0] <= now) {
            pq.push(jobs[job_idx]);
            job_idx++;
        }

        if (!pq.empty()) {
            vector<int> current = pq.top();
            pq.pop();

            int request_time = current[0];
            int duration = current[1];

            now += duration; 
            total_turnaround_time += (now - request_time);
            count++;
        } else {
            now = jobs[job_idx][0];
        }
    }
    return total_turnaround_time / n;
}