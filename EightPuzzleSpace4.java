import java.util.Vector;

public class EightPuzzleSpace4 {
    Node getRoot() {
        int ex[] = {4, 2, 5, 1, 6, 7, 8, 3, 0};
        int rn[] = {7, 2, 4, 5, 0, 6, 8, 3, 1};
        return new Node(ex, null);
    }
    
    Node getGoal() {
        int state[] = {1, 8, 7, 2, 0, 6, 3, 4, 5};
        return new Node(state, null);
    }

    Vector<Node> getSuccessors(Node parent) {
        Vector<Node> successors = new Vector<Node>();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (parent.state[(r * 3) + c] == 0) {
                    if (r > 0) {
                        successors.add(transformState(r - 1, c, r, c, parent));
                    }
                    if (r < 2) {
                        successors.add(transformState(r + 1, c, r, c, parent));
                    }
                    if (c > 0) {
                        successors.add(transformState(r, c - 1, r, c, parent));
                    }
                    if (c < 2) {
                        successors.add(transformState(r, c + 1, r, c, parent));
                    }
                }
            }
        }
        parent.successors = successors;
        return successors;
    }

    Node transformState(int r0, int c0, int r1, int c1, Node parent) {
        int[] s = parent.state;
        int[] newState = {s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8]};
        newState[(r1 * 3) + c1] = s[(r0 * 3) + c0];
        newState[(r0 * 3) + c0] = 0;
        return new Node(newState, parent);
    }
}
