public class Implementstr {
    public static void main(String[] args) {
        class Solution {
            public int strStr(String haystack, String needle) {

                if(haystack.equals("") && needle.equals("")){               //if both haystack and needle is empty then return 0
                    return 0;
                }else if
                (needle.equals("")){
                    return 0;
                }else{
                    return haystack.indexOf(needle);
                }
            }

        }

    }
}
