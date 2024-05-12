// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code..
public class Main {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val ){
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Main main = new Main();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode deleteDuplicates = main.deleteDuplicates(head);

        while (deleteDuplicates != null) {
            System.out.print(deleteDuplicates.val + " ");
            deleteDuplicates = deleteDuplicates.next;
        }
    }
}