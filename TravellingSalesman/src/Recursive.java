import java.util.*;



public class Recursive {
	   public static ArrayList<Node> Generate ( ArrayList<Node> permutation, ArrayList<Node> elements, Boolean[] positions ) {
		   ArrayList<Node> bestPath = new ArrayList<Node>();
		   Double bestDistance = Double.POSITIVE_INFINITY;
		   
	        if ( permutation.size() == elements.size() ) {

	            for ( int i = 0; i < elements.size(); i++ )
	                bestPath.add(permutation.get(i));
	            System.out.println();

	        } else {
	            for (int i = 0; i < elements.size(); i++ ) {
	                if ( positions[i] )
	                    continue;

	                positions[i] = Boolean.TRUE;
	                permutation.add(elements.get(i));

	                Generate( permutation, elements, positions );

	                permutation.remove(permutation.size()-1);
	                positions[i] = Boolean.FALSE;
	            }
	        }
	        return bestPath;
	    }
	   public static void generate(){
		    int size;

	        Scanner sc = new Scanner ( System.in );

	        System.out.print( "Size: " );
	        size = sc.nextInt();

	        ArrayList<Node> permutation = new ArrayList<Node>();
	        ArrayList<Node> elements = new ArrayList<Node>();
	        Boolean [] positions = new Boolean [size];

	        Arrays.fill(positions, Boolean.FALSE);

	        for (int i = 0; i < size ; i++ ) {
	            System.out.print( "Element " + i + " : ");
	            String name = sc.next();
	            elements.add(new Node(name, 1, 1));
	        }

	        System.out.println( "\nPermutations" );
	        Generate ( permutation, elements, positions );
	        
	   }

}



