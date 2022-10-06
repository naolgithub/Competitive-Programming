/*
https://leetcode.com/problems/merge-sorted-array/discuss/2656760/Java-Solution-or-3-Approach
*/
// Algorithm -
/*
1. Initialize i, j & k
2. Check, If nums1[i] is greater than nums2[j], nums1[i] value is stored in nums1[k]
   & both i & k are decrement by 1
3. Else nums2[j] value is stored in nums1[k] & both j & k are decrement by 1
4. While nums1[i] elements are remaining, nums1[i] value is stored in nums1[k] & both i & k    are decrement by 1
5. While nums2[j] elements are remaining, nums2[j] value is stored in nums1[k]
   & both j & k are decrement by 1
*/

// Time & Space Complexity -
/*
Time - O(m+n)
Space - O(1)
*/
class Solution {
    // Merge Sorted Array Function
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize i with nums1 length - 1
        int i = m-1;
        // Initialize j with nums2 length - 1
        int j = n-1;
        // Initialize k with (nums1 + nums2) length - 1
        int k = (m + n)-1;

        // While i is greater than or equal to 0 &&
        // j is greater than or equal to 0
        while(i >= 0 && j >= 0) {
            // If nums1[i] is greater than nums2[j]
            if(nums1[i] > nums2[j]) {
                // nums1[i] value is stored in nums1[k]
                // & both i & k are decrement by 1
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            // ELse
            else {
                // nums2[j] value is stored in nums1[k]
                // & both j & k are decrement by 1
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        // while i is greater than or equal to zero means
        // nums1[i] elements are remaining
        while(i >=0) {
            // nums1[i] value is stored in nums1[k]
            // & both i & k are decrement by 1
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        // while j is greater than or equal to zero means
        // nums2[j] elements are remaining
        while(j >= 0) {
            // nums2[j] value is stored in nums1[k]
            // & both j & k are decrement by 1
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
