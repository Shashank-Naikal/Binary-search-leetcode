class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1;
        int idx=-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                idx = low;
                low = mid+1;
            }
        }
        return high+1;
    }
}