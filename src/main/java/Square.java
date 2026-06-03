//UNDERSTAND: This class contains the attributes and methods for a SQUARE
class Square {
    //DATA FIELD (ATTRIBUTE)
    //UNDERSTAND: Private access ensures that it cannot be tampered by other classes
    //DECISION: side is stored as a double to allow fractional measurements
    private double side;
    private boolean filled;

    //CONSTRUCTORS
    //UNDERSTAND: Initializes a Square object with a default value
    //DECISION: This method is used when no parameter is provided
    Square(){
        setSide(2.0);
        setFilled(false);
    }

    //UNDERSTAND: Called whenever a new Square object is created and initializes the object's state
    //DECISION: Uses setter method for validation
    Square(double side, boolean filled) {
        setSide(side);
        setFilled(filled);
    }

    //GETTER METHODS
    //UNDERSTAND: Provides access to the private field
    //DECISION: Return the unmodified value
    double getSide() {
        return side;
    }

    //RETURN FILLED METHOD
    boolean isFilled(){
        return filled;
    }

    //SETTER METHODS
    //UNDERSTAND: Modify the private field with input validation
    void setSide(double side) {
        if (side <= 0){
            IO.println("Error! Side must be positive!");
            IO.println("Side remains: " + this.side);
            return;
        }
        this.side = side;
    }

    //SET FILLED METHOD
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    //CALCULATE AREA METHOD
    //UNDERSTAND: Returns the area of the square
    double CalculateArea(){
        return side * side;
    }

    //CALCULATE PERIMETER METHOD
    //UNDERSTAND: Returns the perimeter of the square
    //DECISION: Create a method for each output following SRP.
    double CalculatePerimeter(){
        return 4 * side;
    }

    void printSquare(){
        //UNDERSTAND: Typecast into integer for the loop counter
        int s = (int)this.side;

        //UNDERSTAND: Count from 0 to the side value for x and y
        for (int y = 0; y < s; y++){
            for (int x = 0; x < s; x++){
                //UNDERSTAND: Check if is filled is true and at the edge
                if (this.isFilled() ||  y == 0 || y == s -1 || x == 0 || x == s - 1){
                    IO.println("* ");
                } else {
                    IO.println("  ");;
                }
            }
            IO.println();;
        }
        IO.println();
    }
}

void main() {
    Square s1 = new Square(5.0, false);
    Square s2 = new Square(5.0, true);
    s1.printSquare();
    s2.printSquare();
}
