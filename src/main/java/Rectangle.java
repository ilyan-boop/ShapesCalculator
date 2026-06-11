class Rectangle {
    //DATA FIELD (ATTRIBUTE)
    private double length;
    private double width;
    private boolean filled;

    //CONSTRUCTORS
    //UNDERSTAND: These are the default values when no parameters are provided
    //DECISION: Use setter methods to reduce code length and make it easier to return to
    Rectangle(){
        setLength(4.0);
        setWidth(2.0);
        setFilled(true);
    }

    Rectangle(double length, double width, boolean filled){
        setLength(length);
        setWidth(width);
        setFilled(filled);
    }

    //GETTER METHODS
    //DECISION: Following SRP, two methods were made for length and width respectively
    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    boolean isFilled(){
        return filled;
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
            IO.println("Width remains: " + this.width);
            return;
        }
        this.width = width;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
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

    void printRectangle(){
        int w = (int) this.width;
        int l = (int) this.length;

        for(int y = 0; y < l; y++){
            for(int x = 0; x < w; x++){
                if (this.isFilled() ||  y == 0 || y == l -1 || x == 0 || x == w - 1){
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
        IO.println();
    }
}