public class LongestCommonPrefix {
    public static void main(String[] args) {
        class Solution {
            public String longestCommonPrefix(String[] strs) {
                if(strs.length == 0)
                    return "";

                String prefix = strs[0];    //prefix = the first string

                for (int i = 1; i < strs.length; i++){    //loop
                    while(strs[i].indexOf(prefix)!=0){      //if first string index does not match with the second
                        prefix = prefix.substring(0, prefix.length()-1); //the prefix length will decline each time
                    }

                }

                return prefix;
            }
        }
    }
}
