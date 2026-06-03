class Sphere {
    //DATA FIELD
    private double radius;
    //CONSTRUCTORS
    Sphere() {
        setRadius(1.0);
    }

    Sphere(double radius) {
        setRadius(radius);
    }
    //GETTERS
    double getRadius() { return radius; }
    //SETTERS
    void setRadius(double radius) {
        if (radius <= 0) {
            IO.println("Error! Radius must be positive.");
            return;
        }
        this.radius = radius;
    }

    double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
