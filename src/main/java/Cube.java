class Cube {
    //DATA FIELD
    private double side;
    //CONSTRUCTORS
    Cube() {
        setSide(1.0);
    }

    Cube(double side) {
        setSide(side);
    }
    //GETTER
    double getSide() { return side; }

    void setSide(double side) {
        if (side <= 0) {
            IO.println("Error! Side must be positive.");
            return;
        }
        this.side = side;
    }
    //METHODS
    double calculateSurfaceArea() {
        return 6 * side * side;
    }

    double calculateVolume() {
        return side*side*side;
    }

}
