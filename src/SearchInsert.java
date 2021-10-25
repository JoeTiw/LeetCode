public class SearchInsert {


    public static void main(String[] args) {

        class Solution{

            public int searchInsert ( int[] nums, int target){

                int j = 0;

                for (int i = 0; i < nums.length; i++) {

                    if (target == nums[i]) {         //check to see if the target number is in the array list
                        return i;                   //if so, return the index as output

                    } else if (target >= nums[i]) {  //OR if the target doesnot match the array list then store it in J and return
                        nums[j++] = nums[i];
                    }
                }
                return j;
            }
        }
    }
}
