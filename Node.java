public class Node {
    public int z;
    public Node p;
    public Node[] ns;

    public Node(int zone, Node previous, Node[] nextNodes) {
        this.z = zone;
        this.p = previous;
        this.ns = nextNodes;
    }
}
