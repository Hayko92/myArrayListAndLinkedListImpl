

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public void add(T t) {
        Node<T> current = new Node<>(t);
        if (head == null) head = current;
        else {
            Node<T> pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = current;
        }
        size++;
    }

    public void add(int index, T t) {
        Node<T> current = new Node<>(t);
        Node<T> pointer = head;
        if (index == 0) {
            current.next = pointer;
            head = current;
            return;
        }
        if (index >= 0 && index <= size) {
            pointer = head;
            for (int i = 0; i < index - 1; i++) {
                pointer = pointer.next;
            }

            current.next = pointer.next;
            pointer.next = current;

        }
    }

    public T getFirst() {
        T res = null;
        if (head != null) res = head.element;
        return res;
    }

    public T getLast() {
        T res = null;
        if (head != null) {
            Node<T> pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            res = pointer.element;
        }
        return res;
    }

    public T get(int index) {
        T res = null;
        Node<T> pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer.element;
    }

    public int size() {
        return size;
    }

    public boolean contains(T t) {
        Node<T> pointer = head;
        while (pointer.next != null) {
            if (pointer.element.equals(t)) return true;
            pointer = pointer.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Node<T> pointer = head;
        StringBuilder res = new StringBuilder();
        while (pointer.next != null) {
            res.append(pointer.element).append(",");
            pointer = pointer.next;
        }
        res.append(pointer.element);
        return res.toString();
    }


    public void remove(int index) {
        Node<T> pointer = head;
        if (index == 0) {
            head = head.next;
            size--;

        } else {
            for (int i = 0; i < index - 1; i++) {
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
            size--;
        }
    }


    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

}
