class Solution {
public:

    vector<int> twoSum(vector<int>& nums, int target) {
        
        int n = nums.size();

        vector < pair <int,int> > v(n);    
        // .first  ==> value nums[i]
        // .second ==> index i 

        for(int i = 0 ; i < n ; i++) {
            v[i] = { nums[i] , i };
        }

        sort(v.begin() , v.end());  // N log N 

        int i = 0 ;
        int j = n - 1;

        // i ==> 
        //              <== j

        vector <int> ans;

        while(i < j) {
            int cur_sum = v[i].first + v[j].first ; 

            if (cur_sum == target) {
                ans.push_back(v[i].second);
                ans.push_back(v[j].second);
                break;
            }
            else if (cur_sum < target) {
                i++;
            }
            else { // cur_sum > target 
                j--;
            }
        }

        return ans;
      
    }
};
