public class RightCircularCone extends Shape implements Measurable3D {
    //DATA FIELD
    private double radius;
    private double height;
    //CONSTRUCTORS
    RightCircularCone(double radius, double height, String color){
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
    double calculateSlantHeight() {
        return Math.sqrt((radius * radius) + (height * height));
    }

    @Override
    public double calculateSurfaceArea() {
        double slantHeight = calculateSlantHeight();
        return (Math.PI * radius) + (Math.PI * radius * slantHeight);
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString(){
        return "Cone [Color = " + super.getColor() + ", Radius = " + radius + ", Height = " +  height + "\n"
                + "Surface Area = " + calculateSurfaceArea() +  ", Volume = " + calculateVolume();
    }
}