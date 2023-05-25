import java.util.ArrayList;

public class Node {
    private String name;
    private double xPosition;
    private double yPosition;
    private boolean visited;

    public Node(double xposition, double yposition) {
        this("null", xposition, yposition);
    }

    public Node(String name, double xPosition, double yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.visited = false;
    }

    public Node getClosestNode(ArrayList < Node > nodes) {
        double closestDistance = Double.POSITIVE_INFINITY;
        Node closestNode = null;

        for (Node node: nodes) {
            double distance = Utilities.distance(this.xPosition, this.yPosition, node.getXPosition(), node.getYPosition());
            if (distance < closestDistance && distance != 0) {
                closestNode = node;
                closestDistance = distance;
            }
        }

        return closestNode;
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

    public boolean getVisited() {
        return this.visited;
    }

    public void setVisited(boolean value) {
        this.visited = value;
    }
}