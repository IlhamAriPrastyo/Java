//ILHAM ARI PRASTYO
//5311421014
//MODUL 5 Soal 2

import java.util.ArrayList;
import java.util.List;

public class EightPuzzleSearch2 {
    EightPuzzleSpace2 space = new EightPuzzleSpace2();
    List<Node> open = new ArrayList<>();
    List<Node> closed = new ArrayList<>();

    public int h1Cost(Node node) {
        int cost = 0;
        for (int i = 0; i < node.state.length; i++) {
            if (node.state[i] != i)
                cost++;
        }
        return cost;
    }

    public int h2Cost(Node node) {
        int cost = 0;
        int[] state = node.state;
        for (int i = 0; i < state.length; i++) {
            int v0 = i, v1 = state[i];
            // Tidak menghitung ubin yang kosong
            if (v1 == 0)
                continue;
            int row0 = v0 / 3, col0 = v0 % 3, row1 = v1 / 3, col1 = v1 % 3;
            int c = (Math.abs(row0 - row1) + Math.abs(col0 - col1));
            cost += c;
        }
        return cost;
    }

    public int hCost(Node node) {
        return h2Cost(node); // Boleh diubah dengan memakai heuristic h1 atau h2
    }

    public Node getBestNode(List<Node> nodes) {
        int index = 0, minCost = Integer.MAX_VALUE;
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            if (node.cost < minCost) {
                minCost = node.cost;
                index = i;
            }
        }
        Node bestNode = nodes.remove(index);
        return bestNode;
    }

    public int getPreviousCost(Node node) {
        int cost = Integer.MAX_VALUE;
        int i = open.indexOf(node);
        if (i != -1) {
            cost = open.get(i).cost;
        } else {
            i = closed.indexOf(node);
            if (i != -1) {
                cost = closed.get(i).cost;
            }
        }
        return cost;
    }

    public void printPath(List<Node> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.println(" " + path.get(i));
        }
    }

    public void run() {
        Node root = space.getRoot();
        Node goal = space.getGoal();
        Node solution = null;
        open.add(root);
        System.out.println("\nRoot: " + root + "\n");

        while (!open.isEmpty()) {
            Node node = getBestNode(open);
            int pathLength = node.getPath().size();
            closed.add(node);

            if (node.equals(goal)) {
                solution = node;
                break;
            }

            List<Node> successors = space.getSuccessors(node);
            for (int i = 0; i < successors.size(); i++) {
                Node successor = successors.get(i);
                int cost = hCost(successor) + pathLength + 1;
                int previousCost = getPreviousCost(successor);
                boolean inClosed = closed.contains(successor);
                boolean inOpen = open.contains(successor);

                if (!(inClosed || inOpen) || cost < previousCost) {
                    if (inClosed) {
                        closed.remove(successor);
                    }
                    if (!inOpen) {
                        open.add(successor);
                    }
                    successor.cost = cost;
                    successor.parent = node;
                }
            }
        }

        if (solution != null) {
            List<Node> path = solution.getPath();
            System.out.println("\nSolution found\n");
            printPath(path);
        }
    }

    public static void main(String[] args) {
        // Melakukan pencarian
        new EightPuzzleSearch2().run();
    }
}
