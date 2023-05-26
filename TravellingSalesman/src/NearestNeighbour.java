import java.util.ArrayList;

public class NearestNeighbour {

    private ArrayList < Node > nodes;
    ArrayList < Node > bestPath = new ArrayList < Node > ();

    public NearestNeighbour(ArrayList < Node > nodes) {
        this.nodes = nodes;

    }
    public void solve() {
    	
    	if (!(nodes.isEmpty())) {
    		final long startTime = System.nanoTime();

            double totalDistance = 0;
            Node firstNode = nodes.get(0);
            Node currentNode = nodes.get(0);
            Node nextNode;

            ArrayList < Node > unvisitedNodes = new ArrayList < Node > (nodes);
            bestPath.add(nodes.get(0));
            unvisitedNodes.remove(0);


            while (unvisitedNodes.size() != 0) {

                nextNode = currentNode.getClosestNode(unvisitedNodes);
                totalDistance += Utilities.distance(currentNode, nextNode);

                bestPath.add(nextNode);
                currentNode = nextNode;
                unvisitedNodes.remove(currentNode);
            }
            bestPath.add(firstNode);
            totalDistance += Utilities.distance(currentNode, firstNode);

            Utilities.printSolution(bestPath, totalDistance);
            
            final long duration = System.nanoTime() - startTime;
            
            System.out.println("Runtime: " + duration/1000000000.0 + "s");

    	}
    	
    }
}