import java.util.Scanner;

public class EP04VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);
        if (Character.isDigit(ch)){
            System.out.println("digit");
        }else if (isVowel(ch)){
            System.out.println("vowel");
        }else{
            System.out.println("other");
        }


    }

    static boolean isVowel(char ch){
        if (ch== 'a' ||
                ch== 'o' ||
                ch== 'u' ||
                ch== 'e' ||
                ch== 'i'
                ){
            return true;
        }else{
            return false;
        }
    }
}
