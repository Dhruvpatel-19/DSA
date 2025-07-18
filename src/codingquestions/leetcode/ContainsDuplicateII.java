package codingquestions.leetcode;
/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

//Code:

import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(nums[i])){
                if(i-s.get(nums[i])<=k){
                    return true;
                }
            }
            s.put(nums[i],i);
        }
        return false;
    }
}

/* Explanation:
Intuition
We need to find if there are any two identical numbers in the array whose indices differ by at most k.
A direct comparison of all pairs would be too slow.
Instead, we can remember the last seen index of each number as we scan through the array.
If we see the same number again and the index difference is ≤ k, we can return true.

Approach
Use a HashMap<Integer, Integer> to map each number to its most recent index.

Iterate over the array:

If the current number already exists in the map, check if the distance between the current index and the last index is ≤ k.

If yes, return true.

Otherwise (or if the distance > k), update the map with the current index.

If we complete the loop without finding such a pair, return false.

Complexity
Time complexity:
O(n) — each number is processed once.

Space complexity:
O(n) — in the worst case, we may store all elements in the HashMap.
*/
