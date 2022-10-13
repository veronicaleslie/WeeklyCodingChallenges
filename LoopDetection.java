//b) Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
//        DEFINITION:
//        Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
//        EXAMPLE
//        Input: A -> B -> C -> D -> E -> C [the same C as earlier]
//        Output: C



package WeeklyCodingChallenges;

public class LoopDetection {
    public static void main(String[] args) {

        LoopDetection ld = new LoopDetection();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = e;
        g.next=c;
        System.out.println(ld.findLoopStart(a).val);
    }

    public ListNode findLoopStart(ListNode head) {
        if (head == null)
            return null;
        ListNode A = head;
        ListNode B = head;
        while (A != null && A.next != null) {
            A = A.next.next;
            B = B.next;
            if (B == A)
                break;
        }

        if (A == null || A.next == null)
            return null;

        B = head;
        while (B != A) {
            B = B.next;
            A = A.next;
        }
        return A;
    }
}
