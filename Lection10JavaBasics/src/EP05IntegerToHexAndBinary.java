import java.util.Scanner;

public class EP05IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s%n", Integer.toHexString(n).toUpperCase());
        System.out.printf("%s", Integer.toBinaryString(n));
    }
}
