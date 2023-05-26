import java.util.*;

public class Recursive {
	final long startTime = System.nanoTime();
	
    static ArrayList < Node > bestPath = new ArrayList < Node > ();
    static Double bestLength = Double.POSITIVE_INFINITY;
    public static int pathsTried = 0;
    
    public static ArrayList < Node > Generate(ArrayList < Node > permutation, ArrayList < Node > elements, Boolean[] positions) {
    	pathsTried ++;
    	
        ArrayList < Node > path = new ArrayList < Node > ();

        if (permutation.size() == elements.size()) {

            for (int i = 0; i < elements.size(); i++)
                path.add(permutation.get(i));
            path.add(path.get(0));
            Double pathLength = Utilities.pathLength(path);

            if (pathLength < bestLength) {

                System.out.println("New best path");
                System.out.println(pathsTried + " attempted");
                bestPath = path;
                bestLength = pathLength;
                Utilities.printSolution(bestPath, pathLength);
                
            }

        } else {
            for (int i = 0; i < elements.size(); i++) {
                if (positions[i]) continue;

                positions[i] = Boolean.TRUE;
                permutation.add(elements.get(i));

                Generate(permutation, elements, positions);

                permutation.remove(permutation.size() - 1);
                positions[i] = Boolean.FALSE;
            }
        }
        return bestPath;
    }
    public static void solve() {

    	if (!(Main.nodes.isEmpty())) {
    		ArrayList < Node > permutation = new ArrayList < Node > ();
            ArrayList < Node > elements = new ArrayList < Node > (Main.nodes);
            Boolean[] positions = new Boolean[Main.nodes.size()];

            Arrays.fill(positions, Boolean.FALSE);
            
            final long startTime = System.nanoTime();
            
            Generate(permutation, elements, positions);
            
            final long duration = System.nanoTime() - startTime;
            
            System.out.println("Runtime: " + duration/1000000000.0 + "s");
    	}
        
    }

}