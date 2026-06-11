class Ellipse {
    //DATA FIELD (ATTRIBUTE)
    private double semiMajorAxis;
    private double semiMinorAxis;
    private boolean filled;

    //CONSTRUCTORS
    //UNDERSTAND: These are the default values when no parameters are provided
    //DECISION: Use setter methods to reduce code length and make it easier to return to
    Ellipse(){
        setSemiMajorAxis(5.0);
        setSemiMinorAxis(2.0);
        setFilled(false);
    }

    Ellipse(double semiMajorAxis, double semiMinorAxis, boolean filled) {
        setSemiMajorAxis(semiMajorAxis);
        setSemiMinorAxis(semiMinorAxis);
        setFilled(filled);
    }

    //GETTER METHODS
    double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    boolean isFilled() {
        return filled;
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

    void setFilled(boolean filled) {
        this.filled = filled;
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

    void printEllipse(){
        int a = (int) this.semiMajorAxis;
        int b = (int) this.semiMinorAxis;

        //UNDERSTAND: Similar to circle, the y-axis and x-axis is the negative and positive of the
        //minor and major axis respectively
        for (int y = -b; y <= b; y++) {
            for (int x = -a; x <= a; x++) {

                //UNDERSTAND: Standard ellipse formula
                double normX = (double) x / a;
                double normY = (double) y / b;
                double ellipseValue = (normX * normX) + (normY * normY);

                if (this.isFilled()) {
                    if (ellipseValue <= 1.05) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                } else {
                    //UNDERSTAND: Similar to the circle, it will print at the middle peaks of the ellipse
                    if (Math.abs(y) == b && x == 0) {
                        IO.print("* ");
                    }
                    //UNDERSTAND: These are the cutoff values to ensure the ellipse is hollow.
                    else if (ellipseValue <= 1.1 && ellipseValue >= 0.65) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                }
            }
            IO.println();
        }
        IO.println();
    }
}
