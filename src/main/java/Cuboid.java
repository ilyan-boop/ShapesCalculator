class Cuboid {
    //DATA FIELD
    private double length;
    private double width;
    private double height;
    //CONSTRUCTORS
    Cuboid() {
        setLength(2.0);
        setWidth(3.0);
        setHeight(2.0);
    }

    Cuboid(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    //GETTERS
    double getLength() {
        return length;
    }
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    //SETTERS
    void setLength(double length) {
        this.length = length;
    }
    void setWidth(double width) {
        this.width = width;
    }
    void setHeight(double height) {
        this.height = height;
    }
    //METHODS
    double calculateSurfaceArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }

    double calculateVolume() {
        return length * width * height;
    }
}