import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of vertices");
        int V = s.nextInt();
        AdjMatrixGraph amg = new AdjMatrixGraph(V);
        System.out.print("Enter the number of edges");
        int E = s.nextInt();
        for (int i = 0; i < E; i++) {
            System.out.print("Enter the source vertex");
            int a = s.nextInt();
            System.out.print("Enter the destination vertex");
            int b = s.nextInt();
            amg.addEdge(a, b);

        }
        amg.printGraph();

    }

}
