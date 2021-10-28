public class LengthOfLastWord {
    public static void main(String[] args) {
        class Solution {
            public int lengthOfLastWord(String s) {

                int wordCount = 0;

                for (int i = s.length()-1; i >= 0; i--){   //start from the back

                    if (s.charAt(i) == ' '){   //if character contains space or count is greater than 0 then terminate the loop
                        if (wordCount > 0)
                            break;
                    }
                    else{
                        wordCount++;
                    }
                }
                return wordCount;
            }
        }
    }
}
