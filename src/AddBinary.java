public class AddBinary {
    public static void main(String[] args) {
        class Solution {
            public String addBinary(String a, String b) {

                StringBuilder str = new StringBuilder();      //Create a stringbuilder

                int i = a.length()-1;               //the I iterates from back of the string
                int j = b.length()-1;               //the I iterates from back of the string

                int carry = 0;                      //make a carry var

                while (i >=0 || j >=0){             //while i,j equal or is bigger than 0
                    int sum = carry;                //then we carry the number

                    if (i >= 0) sum += a.charAt(i--)-'0';
                    if (i >= 0) sum += a.charAt(i--)-'0';
                    carry = sum > 1 ? 1: 0;
                    str.append(sum%2);
                }

                if (carry) str.append(carry);
                return str.reverse().toString();
            }
        }
    }
}
