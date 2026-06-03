public class ShapesCalculator {

    static void main(String[] args) {
        IO.println("Welcome to the 2D Shapes Calculator App!");

        int choice = 0;

        // Loop until user chooses option 6 (Exit)
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

            // Convert input string to an integer choice
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

            if (choice < 1 || choice > 6) {
                IO.println("Invalid choice! Please pick a number from 1 to 6.");
                continue;
            }

        }
    }
}