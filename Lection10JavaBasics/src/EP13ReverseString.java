import java.util.Scanner;

public class EP13ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = input.length()-1; i >= 0; i--) {
            System.out.printf("%c", input.charAt(i));
        }
    }
}
