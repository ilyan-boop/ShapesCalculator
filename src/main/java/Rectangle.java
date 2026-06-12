public class Rectangle extends Shape implements Measurable2D {
    //DATA FIELD (ATTRIBUTE)
    private double length;
    private double width;
    private boolean filled;

    //CONSTRUCTORS
  public Rectangle(double length, double width, boolean filled, String color) {
      this.length = length;
      this.width = width;
      this.filled = filled;
      super(color);
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
    @Override
    public double calculateArea(){
        return length * width;
    }

    //CALCULATE PERIMETER METHOD
    //UNDERSTAND: Returns the perimeter of the rectangle
    @Override
    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    void printRectangle() {
        int w = (int) this.width;
        int l = (int) this.length;

        for (int y = 0; y < l; y++) {
            for (int x = 0; x < w; x++) {
                if (this.isFilled() || y == 0 || y == l - 1 || x == 0 || x == w - 1) {
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
        IO.println();
    }
    @Override
    public String toString() {
        //UNDERSTAND: super.getColor() calls the getColor method inherited from Shape
        return "Color = " + super.getColor() + ", Width = " + width + ", Length = " +  length + ", Filled = " + filled + "\n"
                +  "Perimeter = " + calculatePerimeter() +  ", Area = " + calculateArea();
    }
}

