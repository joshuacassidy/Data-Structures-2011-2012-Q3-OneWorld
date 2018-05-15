public interface ITree<T> {

    public void insert(Airline data);
    public Node insert(Node node, Airline data);
    public void search(Airline data);
    public Node search(Node node, Airline data);
    public void inorderTraversal();
    public void inorderTraversal(Node node);
    public boolean isEmpty();
    public void delete(Airline data);
    public Node delete(Node node, Airline data);

}
