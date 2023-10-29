import java.util.Vector;

public class EightPuzzleSpace4 {
    // Define constant values for the puzzle pieces
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final int D = 4;
    private static final int E = 5;
    private static final int F = 6;
    private static final int G = 7;
    private static final int H = 8;
    private static final int O = 0;

    public Node getRoot() {
        int ex[] = {D, B, E, A, F, G, H, C, O};
        return new Node(ex, null);
    }

    public Node getGoal() {
        int state[] = {A, H, G, B, O, F, C, D, E};
        return new Node(state, null);
    }

    public Vector<Node> getSuccessors(Node parent) {
        Vector<Node> successors = new Vector<Node>();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (parent.state[(r * 3) + c] == O) {
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

    private Node transformState(int r0, int c0, int r1, int c1, Node parent) {
        int[] s = parent.state;
        int[] newState = new int[s.length];
        System.arraycopy(s, 0, newState, 0, s.length);
        newState[(r1 * 3) + c1] = s[(r0 * 3) + c0];
        newState[(r0 * 3) + c0] = O;
        return new Node(newState, parent);
    }
}
