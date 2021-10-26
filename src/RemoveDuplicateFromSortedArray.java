public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
                    class Solution {
                        public int removeDuplicates(int[] nums) {

                            int newNums =1;

                            for (int i = 0; i < nums.length-1; i++)

                                if( nums[i] != nums[i+1]) {    //compare to see if the next index is equal or not
                                    nums [newNums ++] = nums [i + 1];  //if not we increment newNums to store that value
                                }

                            return newNums;

            }
        }
        }
    }

