//UNDERSTAND: This class contains the attributes and methods for a SQUARE
public class Square extends Rectangle {
    //DATA FIELD (ATTRIBUTE)
    private boolean filled;

    //CONSTRUCTORS

    //UNDERSTAND: Called whenever a new Square object is created and initializes the object's state
    //DECISION: Uses setter method for validation
    public Square(double side, boolean filled, String color) {
        super(side, side, filled, color);
    }


    void printSquare(){
        //UNDERSTAND: Typecast into integer for the loop counter
        int s = (int)super.getWidth();

        //UNDERSTAND: Count from 0 to the side value for x and y
        for (int y = 0; y < s; y++){
            for (int x = 0; x < s; x++){
                //UNDERSTAND: Check if is filled is true and at the edge
                if (this.isFilled() ||  y == 0 || y == s -1 || x == 0 || x == s - 1){
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
        IO.println();
    }

    @Override
    public String toString() {
        // super.getColor() calls the getColor method inherited from Shape
        return "Square [Color = " + super.getColor() + ", Side = " + super.getWidth() + ", Filled = " + super.isFilled() + "]";
    }
}


