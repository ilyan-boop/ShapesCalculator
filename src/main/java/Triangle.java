class Triangle {
    private double base;
    private double height;
    private boolean filled;

    //CONSTRUCTORS
    Triangle() {
        setBase(4.0);
        setHeight(4.0);
        setFilled(false);
    }

    Triangle(double base, double height, boolean filled) {
        setBase(base);
        setHeight(height);
        setFilled(filled);
    }

    //GETTERS
     double getBase() {
        return base;
    }

    double getHeight() {
        return height;
    }

    boolean isFilled() {
        return filled;
    }


    //SETTERS
    void setBase(double base) {
        if (base > 0) this.base = base;
    }
    void setHeight(double height) {
        if (height > 0) this.height = height;
    }
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    double calculatePerimeter() {
        // Hypotenuse = sqrt(base^2 + height^2)
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return base + height + hypotenuse;
    }

    public void printTriangle() {
        int b = (int) this.base;
        int h = (int) this.height;

        // UNDERSTAND: Loop through each row from top to bottom
        for (int y = 0; y < h; y++) {

            // UNDERSTAND: Calculate exactly how wide the triangle should be on THIS specific row
            // DECISION: Using a ratio ensures it scales perfectly even if base and height are different
            int maxStarsThisRow = (int) Math.round(((double) (y + 1) / h) * b);

            for (int x = 0; x < b; x++) {
                if (this.isFilled()) {
                    if (x < maxStarsThisRow) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                } else {
                    //UNDERSTAND: Checks if it is at the left edge, bottom edge, or the right most corner
                    if (x == 0 || y == h - 1 || x == maxStarsThisRow - 1) {
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