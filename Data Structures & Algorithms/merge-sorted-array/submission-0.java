class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: Copy nums1's valid part into temp
        int[] temp = new int[m];
        for (int x = 0; x < m; x++) {
            temp[x] = nums1[x];
        }

        int i = 0; // pointer for temp
        int j = 0; // pointer for nums2
        int k = 0; // pointer for nums1

        // Step 2: Merge into nums1
        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[k++] = temp[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

        // Step 3: Copy leftovers
        while (i < m) {
            nums1[k++] = temp[i++];
        }
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}
