import java.text.DecimalFormat;
import java.util.Scanner;

public class LabP02SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.printf(df.format(a+b));
    }
}
