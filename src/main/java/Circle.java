public class Circle extends Shape implements Measurable2D {
    //DATA FIELD (ATTRIBUTE)
    private double radius;
    private boolean filled;


    //CONSTRUCTORS
    //UNDERSTAND: These are the default values when no parameters are provided
    //DECISION: Use setter methods to reduce code length and make it easier to return to
    public Circle(double radius, boolean filled, String color) {
        this.radius = radius;
        this.filled = filled;
        super(color);
    }

    //GETTER METHODS
    double getRadius() {
        return radius;
    }
    boolean isFilled() {
        return filled;
    }


    //SETTER METHODS
    //UNDERSTAND: Setter methods are similar to square class
    void setRadius(double radius) {
        if (radius <= 0){
            IO.println("Error! Radius must be positive!");
            IO.println("Radius remains: " + this.radius);
            return;
        }
        this.radius = radius;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    //CALCULATE AREA METHOD
    //UNDERSTAND: Returns the area of the circle
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    //CALCULATE PERIMETER METHOD
    //UNDERSTAND: Returns the perimeter of the circle
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    void printCircle(){
        int r = (int) this.radius;

        //UNDERSTAND: Loop from negative radius to positive radius for both axis
        for (int y = -r; y <= r; y++) {
            for (int x = -r; x <= r; x++) {

                // UNDERSTAND: Circle equation is x^2 + y^2
                int distanceSquared = (x * x) + (y * y);
                int radiusSquared = r * r;

                if (this.isFilled()) {
                    //UNDERSTAND: Print whenever the position is less than the border
                    if (distanceSquared <= radiusSquared) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    //UNDERSTAND: Cut off the print when it is INSIDE the circle
                    // This checks if it is right on the border
                    int innerCutoff = (r - 1) * (r - 1);

                    //UNDERSTAND: This checks if the distance of the print is equal to radius
                    if (Math.abs(y) == r && x == 0) {
                        System.out.print("* ");
                    }
                    //UNDERSTAND: This checks if it is right on the border
                    else if (distanceSquared <= radiusSquared && distanceSquared > innerCutoff) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            IO.println();
        }
        IO.println();
    }
    @Override
    public String toString() {
        // super.getColor() calls the getColor method inherited from Shape
        return "Color = " + super.getColor() + ", Radius = " + radius + ", Filled = " + filled + "\n"
                +  "Perimeter = " + calculatePerimeter() +  ", Area = " + calculateArea();
    }
}
