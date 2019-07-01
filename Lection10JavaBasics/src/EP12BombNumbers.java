import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EP12BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrint = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrint.length; i++) {
            arr.add(Integer.valueOf(arrint[i]));
        }

        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = tokens[0];
        int range = tokens[1];

        while (Detonate (arr, target, range) != -1) {
        }
        System.out.println(arr.stream()
                .mapToInt(Integer::intValue)
                .sum());





    }

    static int Detonate (ArrayList<Integer> arr, int target, int range)
    {
        int indexOfTarget = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                indexOfTarget = i;
                break;
            }
        }
        if (indexOfTarget != -1) {



            for (int i = arr.size()-1; i >= 0; i--) {

                if ((indexOfTarget - range <= i) && (i <= indexOfTarget + range)) {
                    arr.remove(i);

                }

            }


        }
        return indexOfTarget;
    }

}
