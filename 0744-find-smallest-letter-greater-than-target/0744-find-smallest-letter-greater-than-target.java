class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length, low = 0, high = n-1;
        int idx = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(letters[mid] > target){
                idx = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return letters[idx];
    }
}