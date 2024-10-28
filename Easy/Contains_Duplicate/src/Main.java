//Source:https://leetcode.com/problems/contains-duplicate/description/
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:
//
//Input: nums = [1,2,3,1]
//
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//
//Input: nums = [1,2,3,4]
//
//Output: false
//
//Explanation:
//
//All elements are distinct.
//
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//
//Output: true
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(solution.containsDuplicate(nums1));
        System.out.println(solution.containsDuplicate(nums2));
        System.out.println(solution.containsDuplicate(nums3));
    }
}