import java.util.Scanner;

public class EP15CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        String username = email.split("@")[0];
        String domain = "@" + email.split("@")[1];

        String replaceUsername = "";
        for (int i = 0; i < username.length(); i++) {
            replaceUsername +="*";
        }

        String replaceEmail = replaceUsername + domain;

        text = text.replaceAll(email, replaceEmail);
        System.out.println(text);

    }
}
