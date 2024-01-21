class Solution
{
public:
    int trap(vector<int> &height)
    {

        int maxLeft = 0, maxRight = 0, total = 0;

        for (int i = 0, j = height.size() - 1; i < j;)
        {

            if (height[i] <= height[j])
            {
                maxLeft = max(maxLeft, height[i]);
                total += maxLeft - height[i];
                i++;
            }
            else
            {
                maxRight = max(maxRight, height[j]);
                total += maxRight - height[j];
                j--;
            }
        }
        return total;
    }
};