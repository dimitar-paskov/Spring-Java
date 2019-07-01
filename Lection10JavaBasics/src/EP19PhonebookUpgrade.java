import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EP19PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, String> phonebook = new TreeMap<>();

        String input;
        while (!(input = scanner.nextLine().trim()) .equals( "END")){
            String[] tokens = input.split(" ");
            String command = tokens[0];



            switch (command){
                case "A":{
                    String name = tokens[1];
                    String phoneNumber = tokens[2];
                    phonebook.put(name, phoneNumber);
                    break;
                }
                case "S":{
                    String name = tokens[1];
                    if (phonebook.containsKey(name)){
                        System.out.println(name + " -> " + phonebook.get(name));
                    }else{
                        System.out.println("Contact " + name +" does not exist.");
                    }
                    break;
                }
                case "ListAll":{
                    for (Map.Entry<String, String> entry :phonebook.entrySet()
                         ) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }

                }
            }

        }
    }
}
