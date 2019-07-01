import java.util.Scanner;

public class LabP05SymmetricNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        first:
        for (int i = 1 ; i <= n; i++) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length() / 2; j++) {
                char left = str.charAt(j);
                char right = str.charAt(str.length() - 1 - j);
                if ( left != right ) {
                    continue first;
                }
            }
            System.out.print (i+ " ");

        }

    }
}
