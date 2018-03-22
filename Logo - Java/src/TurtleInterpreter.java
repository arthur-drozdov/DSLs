import java.awt.*;
import java.io.PrintStream;
import java.util.Scanner;

public class TurtleInterpreter {

    private Scanner input;
    private PrintStream output;
    private String htmlFile;



    public TurtleInterpreter(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
        this.htmlFile = "<!DOCTYPE html>" + '\n' + "<html>" +
                '\n' + "<body>" + '\n';
    }

    void tokenize(){
        // Creating our turtle and initializing its position in the TOP-LEFT corner
        // with the pen DOWN and the pen colour black
        Turtle turtle = new Turtle(0,0,Pen.DOWN, "black");
        while(input.hasNext()){
            String command = input.next();
            switch(command){
                /**
                If the read command is PAPER, then
                we are reading its height, weight and colour
                and add it as a rectangle in SVG code to the htmlFile
                 */
                case "PAPER":
                    int height = input.nextInt();
                    int width = input.nextInt();
                    String colour = '"' + "fill:";
                    colour += input.next();
                    colour += '"';
                    htmlFile += "<svg height=" + height +
                                " width=" + width + ">" +
                            "<rect width=" + width + " height=" +
                            height + " style=" + colour + "/>" + '\n';
                    break;

                /**
                If it is a TURTLE, then we get its coordinates and setladla,skadmk
                 them to the existent turtle.
                 */
                case "TURTLE":
                    int coordX = input.nextInt();
                    int coordY = input.nextInt();
                    turtle.setCoordinates(coordX, coordY);
                    break;

                /**
                 In case of a PENSTATE, we check if it is UP or DOWN
                 and set it to the existent turtle.
                 */
                case "PENSTATE":
                    String state = input.next();
                    if(state == "UP"){
                        turtle.setPenState(Pen.UP);
                    } else if (state == "DOWN"){
                        turtle.setPenState(Pen.DOWN);
                    }
                    break;

                /**
                 In case of a PENCOLOUR, we read the colour and set it
                 to the existent turtle
                 */
                case "PENCOLOUR":
                    String penColour = input.next();
                    turtle.setPenColour(penColour);
                    break;

                /**
                 In case of a MOVE command, we read the number of steps
                 that need to be performed, call the move function from the
                 turtle class (Which, remember, returns a String) and
                 concatenate the result to the htmlFile
                 */
                case "MOVE":
                    int numberSteps = input.nextInt();
                    htmlFile += turtle.move(numberSteps);
                    break;

                /**
                 In case of a RIGHT command, we rotate the turtle right
                 with the specified angle.
                 */
                case "RIGHT":
                    int degreesRight = input.nextInt();
                    turtle.rotateRight(degreesRight);
                    break;

                /**
                 In case of a LEFT command, we rotate the turtle left
                 with the specified angle.
                 */
                case "LEFT":
                    int degreesLeft = input.nextInt();
                    turtle.rotateLeft(degreesLeft);
                    break;

            }
        }
        /**
         When the Scanner has finished iterating through the .txt file
         with the LOGO commands, we add the ending of the htmlFile and
         print it to the output file.
         */
        htmlFile += "</body> </html>";
        output.print(htmlFile);
    }
}
