class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = new int[2];
        a[0] = findFirst(nums, target);
        a[1] = findLast(nums, target);

        return a;
    }
    public static int findFirst(int a[], int x){
        int n = a.length;
        int i=-1;
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] == x){
                i=mid;
                high = mid-1;
            }
            else if(a[mid] > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return i;
    }

    public static int findLast(int a[] , int x){
        int n = a.length;
        int i=-1;
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] == x){
                i=mid;
                low = mid+1;
            }
            else if(a[mid] > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return i;
    }
}