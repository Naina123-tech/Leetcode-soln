class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l = nums1.length + nums2.length;

        int nums3[] = new int[l];

        int i = 0, j = 0, k = 0;

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            }
            else {
                nums3[k] = nums2[j];
                j++;
            }

            k++;
        }

        while(i < nums1.length) {
            nums3[k++] = nums1[i++];
        }

        while(j < nums2.length) {
            nums3[k++] = nums2[j++];
        }

        if(l % 2 != 0) {
            return nums3[l/2];
        }
        else {
            return ((double) nums3[l/2-1] + nums3[l/2]) / 2;
        }
    }
              }
