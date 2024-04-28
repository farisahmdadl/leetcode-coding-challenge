import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temporaryData = new ListNode(0);
        ListNode currentData = temporaryData;
        while(list1 != null && list2!=null){
            if(list1.val <= list2.val){
                currentData.next = list1;
                list1 = list1.next;
            } else {
                currentData.next = list2;
                list2 = list2.next;
            }
            currentData = currentData.next;
        }
        currentData.next = list1 != null ? list1 : list2;
        return temporaryData.next;
    }
    public static void main(String[] args) {
        Main main = new Main();

        Main.ListNode list1 = main.new ListNode(1);
        list1.next = main.new ListNode(2);
        list1.next.next = main.new ListNode(4);

        Main.ListNode list2 = main.new ListNode(1);
        list2.next = main.new ListNode(3);
        list2.next.next = main.new ListNode(4);

        Main.ListNode mergedList = main.mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}