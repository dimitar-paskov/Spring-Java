import java.util.Scanner;

public class EP03ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
        char ch = scanner.nextLine().charAt(0);
            sb.insert(0,ch);
        }

        System.out.println(sb);
    }
}
