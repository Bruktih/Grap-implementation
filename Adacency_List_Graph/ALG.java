import java.util.*;

public class ALG {
    public int vertices;

    private Map<Integer, ArrayList<Integer>> adjListsMap;

    public ALG(int vertices) {
        adjListsMap = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 1; i <= vertices; i++) {
            ArrayList<Integer> neighbours = new ArrayList<Integer>();
            adjListsMap.put(i, neighbours);
        }
    }

    public void addEdge(int v, int w) {
        if (v > adjListsMap.size() || w > adjListsMap.size()) {
            return;

        }
        (adjListsMap.get(v)).add(w);
        (adjListsMap.get(w)).add(v);

    }

    public ArrayList<Integer> getNeighbours(int v) {
        if (v > adjListsMap.size()) {
            return null;
        }
        return new ArrayList<Integer>(adjListsMap.get(v));
    }

}