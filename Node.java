import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Node {
    int[] state = new int[9];
    int cost;
    Node parent = null;
    List<Node> successors = new ArrayList<>();

    public Node(int[] s, Node parent) {
        this.parent = parent;
        for (int i = 0; i < 9; i++) {
            state[i] = s[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            s.append(state[i]).append(" ");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node other = (Node) obj;
        return Arrays.equals(state, other.state);
    }

    public List<Node> getPath() {
        return getPath(new ArrayList<>());
    }

    private List<Node> getPath(List<Node> v) {
        v.add(this);
        if (parent != null) {
            v = parent.getPath(v);
        }
        return v;
    }
}
