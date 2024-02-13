import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data: ");
        String input = scanner.nextLine();
        System.out.println("You entered : " + input);
    }
}