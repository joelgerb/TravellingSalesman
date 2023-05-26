import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean run = true;
    static InputParser parser = new InputParser();

    public static ArrayList < Node > nodes = new ArrayList < Node > ();

    public static void main(String args[]) {

        //Hard coded nodes for testing
        nodes.add(new Node("a", 0.0, 0.0));
        nodes.add(new Node("b", 1.0, 1.0));
        nodes.add(new Node("e", 3, -0.5));
        nodes.add(new Node("c", 1.5, 1.5));
        nodes.add(new Node("d", 2, 0.5));
        nodes.add(new Node("f", 10, 0.5));
        
        nodes.add(new Node("g", 14, 0.0));
        nodes.add(new Node("h", 13.42, 1.3));
        nodes.add(new Node("i", 3.7, -2.5));
        nodes.add(new Node("j", 1.6, 1.5));
        nodes.add(new Node("k", -2, 0.5));
        nodes.add(new Node("l", -10, 0.5));
        
//       nodes.add(new Node("m", 140, 0.0));
//        nodes.add(new Node("n", 17.413, 1.3));
//        nodes.add(new Node("o", 3.7, -9.4));
//        nodes.add(new Node("p", 1.6, 16));
//        nodes.add(new Node("q", -2, 12.55));
//        nodes.add(new Node("r", -10, -0.5));



        System.out.println("Use the command -h if you need help");
        Scanner inputReader = new Scanner(System.in);

        while (run) {
            System.out.print("->");
            String userInput = inputReader.nextLine();

            parser.parseInput(userInput);

        }

        inputReader.close();
    }
}