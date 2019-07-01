import java.util.Scanner;

public class EP14FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.length() >= 20){
            System.out.println(input.substring(0, 20));
        }else{
            System.out.print(input);
            int count = 20 - input.length();
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
        }

    }
}
