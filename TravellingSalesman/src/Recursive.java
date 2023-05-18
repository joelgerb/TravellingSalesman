import java.util.ArrayList;


public class Recursive {
	public static void printAllRecursive(int n, ArrayList<Node> input) {
		ArrayList<Node> nodes = (ArrayList<Node>) input.clone();
		
	    if(n == 1) {
	        
	    } else {
	        for(int i = 0; i < n-1; i++) {
	            printAllRecursive(n - 1, nodes);
	            if(n % 2 == 0) {
	                swap(nodes, i, n-1);
	            } else {
	                swap(nodes, 0, n-1);
	            }
	        }
	        printAllRecursive(n - 1, nodes);
	    }
	}
	
	private static void swap(ArrayList<Node> nodes, int a, int b) {
	    Node temp = nodes.get(a);
	    nodes.set(a, nodes.get(b));
	    nodes.set(b, temp);
	}
}








//public class Recursive {
//	public void solve(ArrayList<Node> nodes) {
//		double distance = 0;
//		double bestDistance = Double.POSITIVE_INFINITY;
//		System.out.println("I'm Solving using recursion!");
//		
//		
//		for (int i = 0; i < nodes.size(); i++) {
//			
//			
//			solve(nodes, nodes.get(i), distance, bestDistance);
//			nodes.get(i).setVisited(true);
//			
//			if (distance < bestDistance) {
//				bestDistance = distance;
//			}
//			distance = 0;
//
//		
//			//im trying to figure this out
////			distance += Utilities.distance(previousNode.getX, previousNode.getY, ode.getX, node.getY)
////			solve(nodes, distance);
//		}
//		for (int i = 0; i < nodes.size(); i++) {
//			nodes.get(i).setVisited(false);
//		}
//		
//	}
//	
//	public void solve(ArrayList<Node> nodes, Node lastNode, double distance, double bestDistance) {
//		for (int i = 0; i < nodes.size(); i++) {
//			
//			if (nodes.get(i).getVisited() == false) {
//				distance += Utilities.distance(lastNode, nodes.get(i));
//				solve(nodes, nodes.get(i), distance, bestDistance);
//				nodes.get(i).setVisited(true);
//			}
//			
//			//im trying to figure this out
////			distance += Utilities.distance(previousNode.getX, previousNode.getY, ode.getX, node.getY)
////			solve(nodes, distance);
//		}
//		
//	}
//	
//	
//}
