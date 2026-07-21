class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++){
            map.put(target-nums[i],i); //目标数，index
        }
        for(int i = 0;i<nums.length;i++){
            int j =map.getOrDefault(nums[i],0);
            if(j!=0 && i!=j){
                ans[0]=(i<j)?i:j;
                ans[1]=(i<j)?j:i;
                return ans;
            }
        }
        return ans;
    }

}
