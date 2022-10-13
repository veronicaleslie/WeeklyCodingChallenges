//a) Intersection: Given two (singly) linked lists,
// determine if the two lists intersect.
// Return the intersecting node.
// Note that the intersection is defined based on reference,
// not value. That is, if the kth node of the first linked
// list is the exact same node (by reference) as the jth
// node of the second linked list, then they are
// intersecting.


package WeeklyCodingChallenges;


public class IntersectingLinkedList {
    static class Node {
        int result;
        Node next;

        Node(int r) {
            result = r;
            next = null;
        }
    }

    public Node getIntersectingLinkedList(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                // if both Nodes are same
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }

        return null;
    }

    public static void main(String[] args) {
        IntersectingLinkedList list = new IntersectingLinkedList();

        Node head1, head2;



        head1 = new Node(5);
        head2 = new Node(74);

        Node newNode = new Node(8);
        head2.next = newNode;

        newNode = new Node(5);
        head2.next.next = newNode;

        newNode = new Node(18);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(24);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint
                = list.getIntersectingLinkedList(head1, head2);

        if (intersectionPoint == null) {
            System.out.print(" No Intersection \n");
        } else {
            System.out.print("Intersection at: "
                    + intersectionPoint.result);
        }
    }
}

