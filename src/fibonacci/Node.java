package fibonacci;

public class Node{

    private int numf; 
    private int ansf;
    private Node next; 

    public Node(int numf, int ansf, Node next) {
        setNumf(numf);
        setAnsf(ansf);
        setNext(next);
    }

    public int getNumf() {
        return numf;
    }

    public void setNumf(int numf) {
        this.numf = numf;
    }

    public Node getNext() {
        return next;
    }

    public int getAnsf() {
        return ansf;
    }

    public void setAnsf(int ansf) {
        this.ansf = ansf;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "numf=" + numf + ", ansf=" + ansf + ", next=>" + next;
    }
    
    
}

