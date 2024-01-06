import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int k) {
      HashMap<Integer,Integer>map = new HashMap<>();
        int ans[]= new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i])){
                int j =map.get(k-nums[i]);
                ans[0]=j;
                    ans[1]=i;
                return ans;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}