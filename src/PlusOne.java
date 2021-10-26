public class PlusOne {
    public static void main(String[] args) {
        class Solution {
            public int[] plusOne(int[] digits) {

                int a = digits.length;

                for (int i = a-1; i >=0; i--){     //check all the array numbers from backwards..so [1,2,3]  -> [3,2,1]

                    if (digits[i] < 9){         //if  digit is less than 9
                        digits[i]++;            // increment it by 1, so [1,2,3] -> [1,2,4]
                        return digits;          //eturn the new array
                    }

                    digits[i] = 0;    //else, if you see 9 then turn it to 0
                }


                int [] new_digits = new int [a+1]; //if the array is [9,9,9] we need to increment the array to hold 4 value [1,0,0,0]
                new_digits[0] = 1;   //the first digits will always be 1
                return new_digits;  //return the new array
            }
        }
    }
}
