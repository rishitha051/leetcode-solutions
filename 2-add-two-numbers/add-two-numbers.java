   /**
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
   */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode extra = new ListNode(0);
        ListNode present = extra;
        int ADDsum = 0;

        // using while loop because we dont know whats the initialize values it is not fixed so while loop would be better 
        while(l1 != null || l2 != null || ADDsum != 0){ 
             int sum = ADDsum ;
             if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
             }
             if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
             }

             ADDsum = sum / 10;
             present.next = new ListNode(sum % 10);
             present = present.next;
            

        }

       return extra.next;

    }
}