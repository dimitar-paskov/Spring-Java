import java.util.Arrays;
import java.util.Scanner;

public class EP11EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumToLeft = 0;
        int sumToRight = 0;
        for (int i = 1; i < arr.length; i++) {
            sumToRight += arr[i];
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sumToLeft == sumToRight){
                System.out.println(i);
                count++;
            }
            if (i+1 < arr.length){
            sumToLeft += arr[i];
            sumToRight -= arr[i+1];
            }

        }

        if (count == 0){
            System.out.println("no");
        }

    }
}
