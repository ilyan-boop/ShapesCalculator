public class ShapesCalculator {
    static void main(String[] args) {
        IO.println("Welcome to the Geometry Shapes Calculator!");

        int mainMenuChoice = 0;

        while (mainMenuChoice != 3) {
            IO.println("\n=========================================");
            IO.println("               MAIN MENU                 ");
            IO.println("=========================================");
            IO.println("1. 2D Shapes Calculator");
            IO.println("2. 3D Shapes Calculator");
            IO.println("3. Exit");
            IO.println("=========================================");
            IO.print("Enter your choice (1-3): ");

            try {
                mainMenuChoice = Integer.parseInt(IO.readln().trim());
            } catch (NumberFormatException e) {
                IO.println("Invalid input! Please enter a valid number.");
                continue;
            }
            if (mainMenuChoice == 3) {
                IO.println("Exiting program. Goodbye!");
                break;
            }
            if (mainMenuChoice < 1 || mainMenuChoice > 3) {
                IO.println("Invalid input! Please enter a number from 1-3.");
                continue;
            }

            if (mainMenuChoice == 1) {
                run2DMenu();
            } else if (mainMenuChoice == 2) {
                run3DMenu();
            }
        }
    }

    private static void run2DMenu(){
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

            if (choice == 6) {;
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
            IO.print("Color of the shape?: ");
            String color = IO.readln().trim();

            switch (choice) {
                case 1: //UNDERSTAND: This is for the Square class
                    IO.print("Enter the side of the square: ");
                    double side = Double.parseDouble(IO.readln().trim());

                    Square square = new Square(side, filled, color);

                    IO.println("\n--- SQUARE RESULTS ---");
                    IO.println(square);
                    square.printSquare();
                    break;

                case 2://UNDERSTAND: This is for the Rectangle class
                    IO.print("Enter length: ");
                    double length = Double.parseDouble(IO.readln().trim());
                    IO.println("Enter width: ");
                    double width = Double.parseDouble(IO.readln().trim());

                    IO.println("\n--- RECTANGLE RESULTS ---");
                    Rectangle rectangle = new Rectangle(length, width, filled, color);
                    IO.println(rectangle);
                    rectangle.printRectangle();
                    break;

                case 3://UNDERSTAND: This is for the Circle class
                    IO.print("Enter radius: ");
                    int radius = Integer.parseInt(IO.readln().trim());

                    Circle circle = new Circle(radius, filled, color);

                    IO.println("\n--- CIRCLE RESULTS ---");
                    IO.println(circle);
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

                    Triangle triangle = new Triangle(base, triHeight, filled);

                    IO.println("\n--- TRIANGLE RESULTS ---");
                    IO.println("Base: " + String.format("%.2f",triangle.getBase()));
                    IO.println("Height: " + String.format("%.2f",triangle.getHeight()));
                    IO.println("Area: " + String.format("%.2f",triangle.calculateArea()));
                    IO.println("Perimeter: " + String.format("%.2f",triangle.calculatePerimeter()));
                    triangle.printTriangle();
                    break;
            }
        }
    }

    private static void run3DMenu(){
            int choice = 0;
            while (choice != 6) {
                IO.println("\n=========================================");
                IO.println("           3D SHAPES CALCULATOR          ");
                IO.println("=========================================");
                IO.println("1. Cube");
                IO.println("2. Cuboid (Rectangular Parallelepiped)");
                IO.println("3. Sphere");
                IO.println("4. Right Circular Cone");
                IO.println("5. Right Circular Cylinder");
                IO.println("6. Back to Main Menu");
                IO.println("=========================================");
                IO.print("Enter your choice (1-6): ");

                try {
                    choice = Integer.parseInt(IO.readln().trim());
                } catch (NumberFormatException e) {
                    IO.println("Invalid input! Please enter a valid number.");
                    continue;
                }

                if (choice == 6) {
                    break;
                }

                if (choice < 1 || choice > 6) {
                    IO.println("Invalid choice! Please pick a number from 1 to 6.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        IO.print("Enter side length of the cube: ");
                        double side = Double.parseDouble(IO.readln().trim());
                        Cube cube = new Cube(side);
                        IO.println("\n--- CUBE RESULTS ---");
                        IO.println("Side: " + String.format("%.2f", cube.getSide()));
                        IO.println("Surface Area: " + String.format("%.2f", cube.calculateSurfaceArea()));
                        IO.println("Volume: " + String.format("%.2f", cube.calculateVolume()));
                        break;

                    case 2:
                        IO.print("Enter length: ");
                        double length = Double.parseDouble(IO.readln().trim());
                        IO.print("Enter width: ");
                        double width = Double.parseDouble(IO.readln().trim());
                        IO.print("Enter height: ");
                        double height = Double.parseDouble(IO.readln().trim());
                        Cuboid cuboid = new Cuboid(length, width, height);
                        IO.println("\n--- CUBOID RESULTS ---");
                        IO.println("Surface Area: " + String.format("%.2f", cuboid.calculateSurfaceArea()));
                        IO.println("Volume: " + String.format("%.2f", cuboid.calculateVolume()));
                        break;

                    case 3:
                        IO.print("Enter radius of the sphere: ");
                        double radius = Double.parseDouble(IO.readln().trim());
                        Sphere sphere = new Sphere(radius);
                        IO.println("\n--- SPHERE RESULTS ---");

                        break;

                    case 4:
                        IO.print("Enter radius of the cone base: ");
                        double coneRadius = Double.parseDouble(IO.readln().trim());
                        IO.print("Enter height of the cone: ");
                        double coneHeight = Double.parseDouble(IO.readln().trim());
                        RightCircularCone cone = new RightCircularCone(coneRadius, coneHeight);
                        IO.println("\n--- CONE RESULTS ---");

                        break;

                    case 5:
                        IO.print("Enter radius of the cylinder base: ");
                        double cylRadius = Double.parseDouble(IO.readln().trim());
                        IO.print("Enter height of the cylinder: ");
                        double cylHeight = Double.parseDouble(IO.readln().trim());
                        RightCircularCylinder cylinder = new RightCircularCylinder(cylRadius, cylHeight);
                        IO.println("\n--- CYLINDER RESULTS ---");

                        break;
                }
            }
        }
    }