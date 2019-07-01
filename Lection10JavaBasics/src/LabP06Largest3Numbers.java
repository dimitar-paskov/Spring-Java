import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LabP06Largest3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Integer[] numsasIntegers = Arrays.stream(nums).boxed().toArray( Integer[]::new );


        Arrays.sort(numsasIntegers, Collections.reverseOrder());


        for (int i = 0; i < numsasIntegers.length ; i++) {
            if (i == 3){
                break;
            }
            System.out.println(numsasIntegers[i]);

        }

    }
}
