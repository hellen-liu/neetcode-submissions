class Solution {
    public int search(int[] nums, int target) {
        int head = 0;
        int end = nums.length-1;
        int middle;
        while(head <= end){
             middle = (end + head)/2;
            if (nums[middle]<target){
                head = middle+1;
            }else if(nums[middle]>target){
                end = middle-1;
            }else{return middle;}
        }
        return -1;
    }
}
