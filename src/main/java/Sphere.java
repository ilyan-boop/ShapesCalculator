public class Sphere extends Shape implements Measurable3D {
    //DATA FIELD
    private double radius;
    //CONSTRUCTORS
    Sphere(double radius, String color){
        this.radius = radius;
        super(color);
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
    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    @Override
    public String toString(){
        return "Color = " + super.getColor() + ", Radius = " + radius +  "\n"
                + "Surface Area = " + calculateSurfaceArea() +  ", Volume = " + calculateVolume();
    }
}
