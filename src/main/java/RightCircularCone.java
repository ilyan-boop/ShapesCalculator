class RightCircularCone {
    //DATA FIELD
    private double radius;
    private double height;
    //CONSTRUCTORS
    RightCircularCone() {
        setRadius(4.0);
        setHeight(4.0);
    }

    RightCircularCone(double radius, double height) {
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
    double calculateSlantHeight() {
        return Math.sqrt((radius * radius) + (height * height));
    }

    double calculateSurfaceArea() {
        double slantHeight = calculateSlantHeight();
        return (Math.PI * radius) + (Math.PI * radius * slantHeight);
    }

    double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}