class Circle {
    //DATA FIELD (ATTRIBUTE)
    private double radius;

    //CONSTRUCTORS
    //UNDERSTAND: These are the default values when no parameters are provided
    //DECISION: Use setter methods to reduce code length and make it easier to return to
    Circle(){
        setRadius(2.0);;
    }

    Circle(double radius){
        setRadius(radius);;
    }

    //GETTER METHODS
    //DECISION: Following SRP, two methods were made for length and width respectively
    double getRadius() {
        return radius;
    }


    //SETTER METHODS
    //UNDERSTAND: Setter methods are similar to square class
    //DECISION: Two methods were made following SRP
    void setRadius(double radius) {
        if (radius <= 0){
            IO.println("Error! Radius must be positive!");
            IO.println("Radius remains: " + this.radius);
            return;
        }
        this.radius = radius;
    }

    //CALCULATE AREA METHOD
    //UNDERSTAND: Returns the area of the rectangle
    double CalculateArea(){
        return Math.PI * radius * radius;
    }

    //CALCULATE PERIMETER METHOD
    //UNDERSTAND: Returns the perimeter of the rectangle
    double CalculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
