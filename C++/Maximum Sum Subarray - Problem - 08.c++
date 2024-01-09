class Solution
{
public:
    int maxSubArray(vector<int> &nums)
    {

        int maxm = INT_MIN, curr_sum = 0, n = nums.size();

        for (int i = 0; i < n; i++)
        {

            curr_sum += nums[i];

            if (curr_sum > maxm)
            {
                maxm = curr_sum;
            }

            if (curr_sum < 0)
            {
                curr_sum = 0;
            }
        }

        return maxm;
    }
};

// TC:O(n)
// SC:O(1)