public class ShapesCalculator {

    static void main(String[] args) {
        IO.println("Welcome to the 2D Shapes Calculator App!");

        int choice = 0;

        //UNDERSTAND: While loop until user inputs 6 (exit)
        while (choice != 6) {
            IO.println("\n=========================================");
            IO.println("           2D SHAPES CALCULATOR          ");
            IO.println("=========================================");
            IO.println("1. Square");
            IO.println("2. Rectangle");
            IO.println("3. Circle");
            IO.println("4. Ellipse");
            IO.println("5. Triangle");
            IO.println("6. Exit");
            IO.println("=========================================");
            IO.print("Enter your choice (1-6): ");

            //UNDERSTAND: This block will validate the input
            try {
                choice = Integer.parseInt(IO.readln().trim());
            } catch (NumberFormatException e) {
                IO.println("Invalid input! Please enter a valid number.");
                continue;
            }

            if (choice == 6) {
                IO.println("Exiting application. Goodbye!");
                break;
            }

            //UNDERSTAND: This block will validate whether the input is 1-6
            if (choice < 1 || choice > 6) {
                IO.println("Invalid choice! Please pick a number from 1 to 6.");
                continue;
            }

            //DECISION: This was put here since it is common between all classes
            IO.print("Should the shape be filled? (true/false): ");
            boolean filled = Boolean.parseBoolean(IO.readln().trim());

            switch (choice) {
                case 1: //UNDERSTAND: This is for the Square class
                    IO.print("Enter the side of the square: ");
                    double side = Double.parseDouble(IO.readln().trim());

                    Square square = new Square(side, filled);

                    IO.println("\n--- SQUARE RESULTS ---");
                    IO.println("Side: " + String.format("%.2f",square.getSide()));
                    IO.println("Area: " + String.format("%.2f",square.CalculateArea()));
                    IO.println("Perimeter: " + String.format("%.2f",square.CalculatePerimeter()));
                    square.printSquare();
                    break;

                case 2://UNDERSTAND: This is for the Rectangle class
                    IO.print("Enter length: ");
                    double length = Double.parseDouble(IO.readln().trim());
                    IO.println("Enter width: ");
                    double width = Double.parseDouble(IO.readln().trim());

                    Rectangle rectangle = new Rectangle(length, width, filled);
                    IO.println("\n--- RECTANGLE RESULTS ---");
                    IO.println("Length: " + String.format("%.2f",rectangle.getLength()));
                    IO.println("Width: " + String.format("%.2f",rectangle.getWidth()));
                    IO.println("Area: " + String.format("%.2f",rectangle.CalculateArea()));
                    IO.println("Perimeter: " + String.format("%.2f",rectangle.CalculatePerimeter()));
                    rectangle.printRectangle();
                    break;

                case 3://UNDERSTAND: This is for the Circle class
                    IO.print("Enter radius: ");
                    int radius = Integer.parseInt(IO.readln().trim());

                    Circle circle = new Circle(radius, filled);

                    IO.println("\n--- CIRCLE RESULTS ---");
                    IO.println("Radius: " + String.format("%.2f",circle.getRadius()));
                    IO.println("Area: " + String.format("%.2f",circle.CalculateArea()));
                    IO.println("Circumference: " + String.format("%.2f",circle.CalculateCircumference()));
                    circle.printCircle();
                    break;

                case 4:
                    IO.print("Enter Semi-Major Axis (Horizontal Radius): ");
                    double semiMajor = Double.parseDouble(IO.readln().trim());
                    IO.print("Enter Semi-Minor Axis (Vertical Radius): ");
                    double semiMinor = Double.parseDouble(IO.readln().trim());

                    Ellipse ellipse = new Ellipse();
                    ellipse.setSemiMajorAxis(semiMajor);
                    ellipse.setSemiMinorAxis(semiMinor);
                    ellipse.setFilled(filled);

                    IO.println("\n--- ELLIPSE RESULTS ---");
                    IO.println("Semi-Major (a): " + String.format("%.2f",ellipse.getSemiMajorAxis()));
                    IO.println("Semi-Minor (b): " + String.format("%.2f",ellipse.getSemiMinorAxis()));
                    IO.println("Area: " + String.format("%.2f",ellipse.CalculateArea()));
                    IO.println("Perimeter (approx.): " + String.format("%.2f",ellipse.CalculatePerimeter()));
                    ellipse.printEllipse();
                    break;
                case 5:
                    IO.print("Enter base: ");
                    double base = Double.parseDouble(IO.readln().trim());
                    IO.print("Enter height: ");
                    double triHeight = Double.parseDouble(IO.readln().trim());
            }
        }
    }
}