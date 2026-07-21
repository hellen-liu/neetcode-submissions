class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean has = false;
        HashSet<Integer>h = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!h.contains(nums[i])){
                h.add(nums[i]);
            }else{
                return true;
            }
            
        }
        return false;

    }
}