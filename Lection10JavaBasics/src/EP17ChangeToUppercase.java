import java.util.Scanner;

public class EP17ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int startIndex;
        while ((startIndex = input.indexOf("<upcase>")) != -1) {

            int endIndex = input.indexOf("</upcase>");
            String capitalized = input.substring(startIndex + 8, endIndex).toUpperCase();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (i < startIndex || endIndex + 8 < i) {
                    sb.append(input.charAt(i));
                }
                if (i == startIndex) {
                    sb.append(capitalized);
                }
            }
            input = sb.toString();
        }
        System.out.println(input);
    }
}
