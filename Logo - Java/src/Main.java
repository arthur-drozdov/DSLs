import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Creating an input file, brought from the path specified in the brackets
        File input = new File("C:\\Users\\mirunairusu\\Desktop\\read.txt");

        // Creating an output file, brought from the path specificed in the brackets
        File output = new File("C:\\Users\\mirunairusu\\Desktop\\myturtle.html");

        // A scanner for parsing through the input
        Scanner in = new Scanner(input);

        // A PrintStream used for printing the output
        PrintStream out = new PrintStream(output);

        // Creating a new TurtleInterpreter, that will actually analyze and execute the
        // LOGO commands provided in the input file
        TurtleInterpreter turtleInterpreter = new TurtleInterpreter(in, out);

        // Starting the tokenizing function, which analyzes and executes the LOGO
        turtleInterpreter.tokenize();
    }
}





