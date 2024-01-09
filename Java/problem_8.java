class Solution {
    public int maxSubArray(int[] nums) {
        int currMax=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
    if(currMax+nums[i]>=nums[i]){
        currMax+=nums[i];
      }else{
          currMax=nums[i];
         }
        if(currMax>=max)
            max=currMax;
        }
        return max;
    }
}