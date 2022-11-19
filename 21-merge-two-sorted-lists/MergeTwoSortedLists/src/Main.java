import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();
        ListNode list1Next = new ListNode(2);
        ListNode list1 = new ListNode(1, list1Next);
        ListNode list2Next = new ListNode(5);
        ListNode list2 = new ListNode(4, list2Next);
//        System.out.println(solution.mergeTwoLists(ListNode.toString(list1,list2)));
    }
}

// https://stackoverflow.com/questions/72863614/how-to-print-the-linkedlist-from-the-middle-node-to-the-last-node

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        ListNode ll = null, head = null;
//        System.out.print("Enter the size of linked list: ");
//        int size = sc.nextInt();
//        System.out.println("Enter the elements of linked list: ");
//        for(int i =1 ; i<=size ; i++){
//            if (ll == null) {
//                ll = new ListNode(sc.nextInt());
//                head = ll;
//            } else {
//                ll.next = new ListNode(sc.nextInt())
//                ll = ll.next;
//            }
//        }
//        sc.close();
//        Solution ob = new Solution();
//        ListNode res=ob.middleNode(head);
//        System.out.println("Linked list starting from the: ");
//        while(res != null) {
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//        System.out.println();
//    }
//}