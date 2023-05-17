import java.util.ArrayList;

public class NearestNeighbour {
	
	private ArrayList<Node> nodes;
	ArrayList<Node> bestPath = new ArrayList<Node>();
	
	public NearestNeighbour(ArrayList<Node> nodes) {
		this.nodes = nodes;
		
	}
	public void solve() {
		
		double totalDistance = 0;
		Node startingNode = nodes.get(0);
		Node currentNode = startingNode;
		Node nextNode;
		
		ArrayList<Node> unvisitedNodes = nodes;
		
		while (unvisitedNodes.size() > 0) {
			nextNode = currentNode.getClosestNode(unvisitedNodes);
			totalDistance += Utilities.distance(currentNode, nextNode);
			bestPath.add(currentNode);
			currentNode = nextNode;
			unvisitedNodes.remove(currentNode);
		}
		Utilities.printSolution(bestPath, totalDistance);
		
		//aaa
	}
}
