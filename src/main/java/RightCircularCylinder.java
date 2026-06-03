class RightCircularCylinder {
    //DATA FIELD
    private double radius;
    private double height;
    //CONSTRUCTORS
    RightCircularCylinder() {
        setRadius(5.0);
        setHeight(5.0);
    }

    RightCircularCylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }
    //GETTERS
    double getRadius()
    { return radius;
    }
    double getHeight() {
        return height;
    }
    //SETTERS
    void setRadius(double radius) {
        if (radius <= 0) {
            IO.println("Error! Radius must be positive.");
            return;
        }
        this.radius = radius;
    }

    void setHeight(double height) {
        if (height <= 0) {
            IO.println("Error! Height must be positive.");
            return;
        }
        this.height = height;
    }
    //METHODS
    double calculateSurfaceArea() {
        return (2*Math.PI * radius) * (radius * height);
    }

    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}