import java.util.Arrays;
import java.util.Scanner;

public class EP08MaxSequenceIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bestStart = 0;
        int bestLenght = 1;
        int currentStart = 0;
        int currentLenght = 1;


        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>arr[i-1]){
                currentLenght++;
            }else {
                if (currentLenght > bestLenght){
                    bestStart = currentStart;
                    bestLenght = currentLenght;
                }
                currentStart = i;
                currentLenght = 1;
            }
        }
        if (currentLenght > bestLenght){
            bestStart = currentStart;
            bestLenght = currentLenght;
        }


        for (int i = bestStart; i < bestStart+bestLenght ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
