class Rectangle {
    //DATA FIELD (ATTRIBUTE)
    private double length;
    private double width;

    //CONSTRUCTORS
    //UNDERSTAND: These are the default values when no parameters are provided
    //DECISION: Use setter methods to reduce code length and make it easier to return to
    Rectangle(){
        setLength(4.0);
        setWidth(2.0);
    }

    Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    //GETTER METHODS
    //DECISION: Following SRP, two methods were made for length and width respectively
    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    //SETTER METHODS
    //UNDERSTAND: Setter methods are similar to square class
    //DECISION: Two methods were made following SRP
    void setLength(double length) {
        if (length <= 0){
            IO.println("Error! Length must be positive!");
            IO.println("Length remains: " + this.length);
            return;
        }
        this.length = length;
    }

    void setWidth(double width) {
        if (width <= 0){
            IO.println("Error! Width must be positive!");
            IO.println("Length remains: " + this.width);
            return;
        }
        this.width = width;
    }

    //CALCULATE AREA METHOD
    //UNDERSTAND: Returns the area of the rectangle
    double CalculateArea(){
        return length * width;
    }

    //CALCULATE PERIMETER METHOD
    //UNDERSTAND: Returns the perimeter of the rectangle
    double CalculatePerimeter(){
        return 2 * (length + width);
    }
}
