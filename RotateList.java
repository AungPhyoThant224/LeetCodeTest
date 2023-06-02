public class RotateList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k < 1){
            return head;
        }

        ListNode newList = new ListNode();
        ListNode current = head;
        int size = 0;
        while(current.next != null){
            size++;
            current = current.next;
        }

        if(k > size){
            k = k % (size + 1);
        }
        
        System.out.print(k);
        for(int j = 0; j < k; j++){
            current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = head;

            ListNode newcur = current;
            int i = 0;
            while(i < size){
                newcur = newcur.next;
                i++;
            }

            newcur.next = null;
            head = current;
        }

        return head;
    }
}
