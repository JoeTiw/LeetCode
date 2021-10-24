public class RemoveElement {
    public static void main(String[] args) {
        class Solution {
            public int removeElement(int[] nums, int val) {


                int j = 0; //this will be the new array list

                for (int i = 0; i < nums.length; i++){

                    if (nums [i] != val){        //check if the number in the array matches the value number or not..
                        nums [j] = nums[i];     //if not then we put that number in our new nums[j] array
                        j++;                    //increment
                    }
                }

                return j;
            }
        }
    }
}
