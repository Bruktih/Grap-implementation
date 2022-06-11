import java.util.*;

public class Test {
    public static void main(String[] args) {
        int count = 1, source, dest;

        System.out.print("Enter the number of vertices");
        Scanner vertices = new Scanner(System.in);
        int number_vertices = vertices.nextInt();
        System.out.print("Enter the number of vertices");
        Scanner edges = new Scanner(System.in);
        int number_edges = edges.nextInt();
        ALG adjacencyList = new ALG(number_vertices);
        System.out.println("Enter edges in format <source> <destination>");
        while (count <= number_edges) {
            source = vertices.nextInt();
            dest = edges.nextInt();
            adjacencyList.addEdge(source, dest);
            count++;
        }
        System.out.println("The given adjacency List for the graph\n");
        for (int i = 1; i <= number_vertices; i++) {
            System.out.print(i + "->");
            ArrayList<Integer> edgeList = adjacencyList.getNeighbours(i);
            for (int j = 1;; j++) {
                if (j != edgeList.size()) {
                    System.out.print(edgeList.get(j - 1) + " -> ");
                } else {
                    System.out.print(edgeList.get(j - 1));
                    break;
                }
            }
            System.out.println();

        }

    }

}