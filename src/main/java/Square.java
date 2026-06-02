//UNDERSTAND: This class contains the attributes and methods for a SQUARE
 class Square {
    //DATA FIELD (ATTRIBUTE)
    //UNDERSTAND: Private access ensures that it cannot be tampered by other classes
    //DECISION: side is stored as a double to allow fractional measurements
    private double side;

    //CONSTRUCTORS
    //UNDERSTAND: Initializes a Square object with a default value
    //DECISION: This method is used when no parameter is provided
    Square(){
        setSide(2.0);
    }

    //UNDERSTAND: Called whenever a new Square object is created and initializes the object's state
    //DECISION: Uses setter method for validation
    Square(double side) {
        setSide(side);
    }

    //GETTER METHOD
    //UNDERSTAND: Provides access to the private field
    //DECISION: Return the unmodified value
    double getSide() {
        return side;
    }

    //SETTER METHOD
    //UNDERSTAND: Modify the private field with input validation
    void setSide(double side) {
        if (side <= 0){
            IO.println("Error! Side must be positive!");
            IO.println("Side remains: " + this.side);
            return;
        }
        this.side = side;
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
}