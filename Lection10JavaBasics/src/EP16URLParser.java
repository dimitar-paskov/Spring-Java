import java.util.Scanner;

public class EP16URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String protocol = "";
        String server = "";
        String resource = "";

        int index = input.indexOf("://");
        if (index != -1){
            protocol = input.split("://")[0];
            input = input.split("://")[1];
        }

        index = input.indexOf("/");
        if (index != -1){
            String[] tokens = input.split("/");
            input = tokens[0];

            for (int i = 1; i < tokens.length; i++) {
                if (i==tokens.length-1){
                    resource += tokens[i];
                }else{
                    resource += tokens[i] + "/";
                }

            }

        }

        server = input;
        System.out.println("[protocol] = \"" + protocol + "\"");
        System.out.println("[server] = \"" + server + "\"");
        System.out.println("[resource] = \"" + resource + "\"");
    }
}
