import java.util.ArrayList;

public class NearestNeighbour {
	
	private ArrayList<Node> nodes;
	
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
			currentNode = nextNode;
			unvisitedNodes.remove(currentNode);
		}
		System.out.println(totalDistance);
		
		
	}
}
