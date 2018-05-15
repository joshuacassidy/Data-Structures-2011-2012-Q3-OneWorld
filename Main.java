public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Airline> searchTree = new BinarySearchTree<>();
        searchTree.insert(new Airline("OceanicAir", "Brazil"));
        searchTree.insert(new Airline("Aerlingus", "Ireland"));
        searchTree.insert(new Airline("MongolianAir", "Mongolia"));
        searchTree.insert(new Airline("GoAir", "UK"));
        searchTree.insert(new Airline("SingaporeAir", "Singapore"));
        searchTree.inorderTraversal();
    }
}
