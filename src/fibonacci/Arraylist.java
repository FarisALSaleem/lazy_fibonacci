package fibonacci;

public class Arraylist {

    private Node Head;
    private int Size = 0;

    public Arraylist() {
    }

    public Node getHead() {
        return Head;
    }

    public void setHead(Node head) {
        this.Head = head;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public void addfirst(Node N) {
        if (getSize() == 0) {
            Head = N;
        } else {
            N.setNext(Head);
            Head = N;
        }
        Size++;
    }

    public boolean search(int numf) {

        if (numf == 1 || numf == 2) {
            return true;
        }

        if (Head == null) {
            return false;
        }

        Node temp = Head;
        while (temp != null) {
            if (temp.getNumf() == numf) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int get(int numf) {
        if (numf == 1 || numf == 2) {
            return 1;
        }
        if (Head == null) {
            return 0;
        }

        Node temp = Head;
        while (temp != null) {
            if (temp.getNumf() == numf) {
                return temp.getAnsf();
            }
            temp = temp.getNext();
        }
        return 0;
    }

    public int Fibo(int num, Arraylist a) {
        if (num == 1 || num == 2) {
            return 1;
        } else if (num <= 0) {
            System.out.println("invalid parameter");
            return -1;
        } else if (a.search(num)) {
            return a.get(num);
        } else {
            a.addfirst(new Node(num, Fibo(num - 1, a) + Fibo(num - 2, a), null));
            return a.getHead().getAnsf();
        }
    }

    @Override
    public String toString() {
        return Head.toString();
    }

}
