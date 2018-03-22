public class Turtle {
    private int coordX;
    private int coordY;
    private Pen penState;
    private String penColour;
    private int orientation;

    public Turtle(int coordX, int coordY, Pen penState, String color){
        this.coordX = coordX;
        this.coordY = coordY;
        this.penState = penState;
        this.penColour = color;
        this.orientation = 0;
    }

    public void setCoordinates(int coordX, int coordY){
        this.coordX = coordX;
        this.coordY = coordY;
        this.orientation = 0;
    }

    public void setPenState(Pen penState) {
        this.penState = penState;
    }

    public void setPenColour(String penColour) {
        this.penColour = penColour;
    }



    public String move(int numberSteps){
        double angleInRadians = orientation * (Math.PI / 180);
        double sinOfAngle = Math.sin(angleInRadians);
        double cosOfAngle = Math.cos(angleInRadians);
        double deltaX = numberSteps * sinOfAngle; // change on X-axis
        double deltaY = - numberSteps * cosOfAngle; // change on Y-axis
        int newX = (int) Math.round(coordX + deltaX);
        int newY = (int) Math.round(coordY + deltaY);
        String out =  "<line x1=" + '"' + coordX + '"' +
                " y1=" + '"' + coordY + '"' +
                " x2=" + '"' + newX + '"' +
                " y2=" + '"' + newY + '"' +
                " style=" + '"' + "stroke:" + penColour +
                "; stroke-width:2" + '"' + " />" + '\n';
        coordX = newX;
        coordY = newY;
        return out;
    }

    // Rotating the turtle with specified number of degrees to the right
    public void rotateRight(int degrees){
        orientation = (orientation + degrees) % 360;

    }

    // Rotating the turtle with specified number of degrees to the left
    public void rotateLeft(int degrees){
        orientation = (orientation + 360 - degrees) % 360;
    }
}
