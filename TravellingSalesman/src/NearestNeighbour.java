import java.util.ArrayList;

public class NearestNeighbour {
	
	private ArrayList<Node> nodes;
	private double shortestPath;
	
	public NearestNeighbour(ArrayList<Node> nodes) {
		this.nodes = nodes;
		
	}
	public void solve() {
		
		double totalDistance = 0;
		Node startingNode = nodes.get(0);
		Node currentNode = startingNode;
		
		for(int i = 0; i < nodes.size(); i++) {
			currentNode = startingNode.getClosestNode(nodes);
		}
		
		
	}
}
