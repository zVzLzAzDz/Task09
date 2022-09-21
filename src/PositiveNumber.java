import java.util.Scanner;

public class PositiveNumber {

    public static int inputPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Input positive number: ");
            number = scanner.nextInt();
            if (number > 0) {
                break;
            }

        }
        return number;
    }

    public static void main(String[] args) {

        System.out.println(inputPositiveNumber());
    }
}


