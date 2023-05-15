
public class Node {
	private String name;
	private double xPosition;
	private double yPosition;
	
	
	public Node (String name, double xPosition, double yPosition) {
		this.name = name;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public double getXPosition() {
		return this.xPosition;
	}
	
	public double getYPosition() {
		return this.yPosition;
	}
} 
