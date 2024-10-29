
class Solution {
    public int removeElement(int[] nums, int val) {
        //make a available position = 0, meaning the index of the last known non-val position
        int available_position = 0;
        for(int i = 0 ; i < nums.length ; i++){
            //if the current iteration is not val, swap the value of the current position to the val of the available position
            //this will make sure that the val always get swapped to the end, and the non-val get swapped to the first
            //increment the available by 1 indicating that we now move to the next usable spot
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = 0;
                nums[available_position] = temp;
                available_position+=1;
            }
        }
        //return the amount of usable spot, meaning the total of non-val
        return available_position;
    }
}