public class RightCircularCylinder extends Shape implements Measurable3D{
    //DATA FIELD
    private double radius;
    private double height;
    //CONSTRUCTORS
    RightCircularCylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        super(color);
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
    @Override
    public double calculateSurfaceArea() {
        return (2*Math.PI * radius) * (radius * height);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString(){
        return "Cylinder [Color = " + color + ", Radius = " + radius + ", Height = " + height + "]";
    }
}