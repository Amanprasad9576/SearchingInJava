class Solution {     // leetcode problem 35
    public int searchInsert(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;
      int temp = nums.length;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]<target){
            start=mid+1;
        }
        else{
           temp=mid;
           end = mid-1;
        }
      }
      return temp; 

    }
}
