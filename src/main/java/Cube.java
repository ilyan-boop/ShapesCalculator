class Cube {
    private double side;

    Cube() {
        setSide(1.0);
    }

    Cube(double side) {
        setSide(side);
    }

    double getSide() { return side; }

    void setSide(double side) {
        if (side <= 0) {
            IO.println("Error! Side must be positive.");
            return;
        }
        this.side = side;
    }

    double calculateSurfaceArea() {
        return 6 * side * side;
    }

    double calculateVolume() {
        return side*side*side;
    }

}
