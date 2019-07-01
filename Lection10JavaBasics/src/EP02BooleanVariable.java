import java.util.Scanner;

public class EP02BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isTrue = Boolean.parseBoolean(input);

        if (isTrue) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
