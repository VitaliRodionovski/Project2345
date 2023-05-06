public class HandMadeLinkedList<E> {
    Node1<E> first;
    int size = 0;

    public HandMadeLinkedList() {
        first = null;
    }

    public void InsertFirst(E data) {
        Node1<E> newNode = new Node1<>(data);
        newNode.next = first;
        first = newNode;
        size++;
    }

    public void DeleteFirst() {
        first = first.next;
        size--;
    }

    void InsertLast(E data) {
        if (first == null) {
            InsertFirst(data);
        } else {
            Node1<E> current = first;
            while (current.next != null) {
                current = current.next;
            }
            Node1<E> newNode1 = new Node1<>(data);
            current.next = newNode1;
            size++;
        }
    }

    void DeleteAfter(Node1<E> after) {
        Node1<E> current = first;
        while (current.data != after.data) {
            current = current.next;
        }
    }
}
