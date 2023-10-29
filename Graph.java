import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    // Representasi graf menggunakan daftar ketetanggaan
    private Map<Integer, List<Integer>> adjList;

    // Konstruktor
    public Graph() {
        adjList = new HashMap<>();
    }

    // Metode untuk menambahkan edge antara dua simpul
    public void addEdge(int source, int destination) {
        // Membuat daftar ketetanggaan jika belum ada, lalu menambahkan simpul tujuan
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
    }

    // Metode untuk mencetak graf
    public void printGraph() {
        for (Integer vertex : adjList.keySet()) {
            System.out.print("Simpul " + vertex + " terhubung ke: ");
            List<Integer> neighbors = adjList.get(vertex);
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Membuat objek graf
        Graph graph = new Graph();

        // Menambahkan edge-edge sesuai dengan penjelasan
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        // Mencetak graf
        graph.printGraph();
    }
}