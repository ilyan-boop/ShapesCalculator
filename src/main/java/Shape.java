public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }
}
