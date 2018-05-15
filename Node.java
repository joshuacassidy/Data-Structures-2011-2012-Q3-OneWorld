public class Node implements Comparable<Airline> {

    private Node left, right;
    private Airline data;

    public Node(Airline data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Airline getData() {
        return data;
    }

    public void setData(Airline data) {
        this.data = data;
    }

    @Override
    public int compareTo(Airline o) {
        return data.compareTo(o);
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
