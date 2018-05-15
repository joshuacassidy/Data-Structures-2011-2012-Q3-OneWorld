public class BinarySearchTree<T extends Comparable<T>> implements ITree {

    private Node root;

    @Override
    public void insert(Airline data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            insert(root, data);
        }
    }

    @Override
    public Node insert(Node node, Airline data) {
        if(node.compareTo(data) > 0){
            if (node.getLeft() == null) {
                node.setLeft(new Node(data));
                return node.getLeft();
            } else {
                return insert(node.getLeft(), data);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(data));
                return node.getRight();
            } else {
                return insert(node.getRight(), data);
            }
        }
    }

    @Override
    public void search(Airline data) {
        if (isEmpty()) {
            throw new BinaryTreeIsEmptyException("ITree is empty");
        } else {
            search(root, data);
        }
    }

    @Override
    public Node search(Node node, Airline data) {
        if (node != null) {
            if (node.compareTo(data) > 0) {
                return insert(node.getLeft(), data);
            } else if(node.compareTo(data) < 0) {
                return insert(node.getRight(), data);
            } else {
                return node;
            }
        } else {
            return null;
        }
    }

    @Override
    public void delete(Airline data) {

        if (isEmpty()) {
            throw new BinaryTreeIsEmptyException("ITree is empty");
        } else {
            delete(root, data);
        }

    }

    @Override
    public Node delete(Node node, Airline data) {
        if (node == null) {
            return null;
        } else {
            if (node.compareTo(data) > 0) {
                node.setLeft(delete(node.getLeft(), data));
            } else if (node.compareTo(data) < 0) {
                node.setRight(delete(node.getRight(), data));
            } else {
                if (node.getLeft() == null && node.getRight() == null) {
                    return null;
                } else if (node.getLeft() == null) {
                    Node temp = node.getRight();
                    node = null;
                    return temp;
                } else if (node.getRight() == null) {
                    Node temp = node.getLeft();
                    node = null;
                    return temp;
                } else {
                    Node temp = getPredecessor(node.getLeft());
                    node.setData(temp.getData());
                    node.setLeft(delete(node.getLeft(),temp.getData()));
                }
            }
        }
        return node;
    }

    public Node getPredecessor(Node node) {
        if (node.getRight() != null) {
            return getPredecessor(node.getRight());
        } else {
            return node;
        }
    }

    @Override
    public void inorderTraversal() {
        if (isEmpty()) {
            throw new BinaryTreeIsEmptyException("ITree is empty");
        } else {
            inorderTraversal(root);
        }
    }

    @Override
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.println(node + " ");
            inorderTraversal(node.getRight());
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}