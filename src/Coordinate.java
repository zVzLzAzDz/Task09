import java.util.Scanner;

public class Coordinate {

    public static int checkCoordinate(int x, int y, int x1, int y1, int x2, int y2) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input coordinate X and Y:");

        System.out.print("X = ");
        x = scanner.nextInt();

        System.out.print("Y = ");
        y = scanner.nextInt();


        System.out.println("Input coordinate X1 and Y1: ");

        // the left vertex of the rectangle

        System.out.print("X1 = ");
        x1 = scanner.nextInt();

        System.out.print("Y1 = ");
        y1 = scanner.nextInt();


        System.out.println("Input coordinate X2 and Y2: ");

        // the right vertex of the rectangle

        System.out.print("X2 = ");
        x2 = scanner.nextInt();

        System.out.print("Y2 = ");
        y2 = scanner.nextInt();

        if (x >= x1 && x <= x2 && x >= y1 && x <= y2) {
            System.out.println("The point (x, y) lie inside the rectangle");
        } else {
            System.out.println("The point (x, y) do not lie inside the rectangle");
        }

        return checkCoordinate(0, 0, 0, 0, 0, 0);

    }

    public static void main(String[] args) {


        int result = checkCoordinate(0,0,0,0,0,0);

        System.out.println(result);


    }

}

