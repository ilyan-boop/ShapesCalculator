class Ellipse {
    //DATA FIELD (ATTRIBUTE)
    private double semiMajorAxis;
    private double semiMinorAxis;

    //CONSTRUCTORS
    //UNDERSTAND: These are the default values when no parameters are provided
    //DECISION: Use setter methods to reduce code length and make it easier to return to
    Ellipse(){
        setSemiMajorAxis(5.0);
        setSemiMinorAxis(2.0);
    }

    Ellipse(double semiMajorAxis, double semiMinorAxis){
        setSemiMajorAxis(semiMajorAxis);
        setSemiMinorAxis(semiMinorAxis);
    }

    //GETTER METHODS
    double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    //SETTER METHODS
    //UNDERSTAND: Setter methods are similar to square class
    void setSemiMajorAxis(double semiMajorAxis) {
        if (semiMajorAxis <= 0){
            IO.println("Error! Semi Major Axis must be positive!");
            IO.println("Semi Major Axis remains: " + this.semiMajorAxis);
            return;
        }
        this.semiMajorAxis = semiMajorAxis;
    }

    void setSemiMinorAxis(double semiMinorAxis) {
        if (semiMinorAxis <= 0){
            IO.println("Error! Semi Minor Axis must be positive!");
            IO.println("Semi Minor Axis remains: " + this.semiMinorAxis);
            return;
        }
        this.semiMinorAxis = semiMinorAxis;
    }

    //CALCULATE AREA METHOD
    //UNDERSTAND: Returns the area of the ellipse
    double CalculateArea(){
        double a = semiMajorAxis;
        double b = semiMinorAxis;
        return Math.PI * a * b;
    }

    //CALCULATE PERIMETER METHOD
    //UNDERSTAND: Returns the perimeter of the ellipse
    double CalculatePerimeter(){
        double a = semiMajorAxis;
        double b = semiMinorAxis;
        double h = ((a-b)*(a-b))/((a+b)*(a+b));
        return Math.PI * (a+b) * ((1+(3*h)/(10+Math.sqrt(4-3*h))));
    }
}
