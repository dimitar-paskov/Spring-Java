import java.util.HashMap;
import java.util.Scanner;

public class EP18Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine().trim()) .equals( "END")){
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String name = tokens[1];


            switch (command){
                case "A":{
                    String phoneNumber = tokens[2];
                    phonebook.put(name, phoneNumber);
                    break;
                }
                case "S":{
                    if (phonebook.containsKey(name)){
                        System.out.println(name + " -> " + phonebook.get(name));
                    }else{
                        System.out.println("Contact " + name +" does not exist.");
                    }
                }
            }

        }
    }
}
