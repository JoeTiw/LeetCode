public class RemoveDuplicatesLinked {

    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */
        class Solution {
            public ListNode deleteDuplicates(ListNode head) {
                if (head == null || head.next == null){       //if the head or next head is empty then return head and end;
                    return head;
                }

                ListNode saveVal = head;                      //declare saveVal var so you can save the outputs

                while(head != null && head.next != null){     //while head or next head is not null
                    if(head.val == head.next.val){              //if head val is equal to next val
                        head.next = head.next.next;             //jump ahead 2 nodes skipping the same val
                    }else{
                        head = head.next;                    //else just go one next node
                    }
                }
                return saveVal ;                        //now return the val
            }
        }
    }
}
