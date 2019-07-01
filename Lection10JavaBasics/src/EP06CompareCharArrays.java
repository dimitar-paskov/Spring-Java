import java.util.Arrays;
import java.util.Scanner;

public class EP06CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        char[] arr1 = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            arr1[i]=input[i].charAt(0);
        }

        input = scanner.nextLine().split(" ");
        char[] arr2 = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            arr2[i]=input[i].charAt(0);
        }

        for (int i = 0; i <Math.min(arr1.length, arr2.length) ; i++) {
            if (arr1[i]<arr2[i]){
                System.out.println(arr1);
                System.out.println(arr2);
                return;
            }else if (arr1[i]>arr2[i]){
                System.out.println(arr2);
                System.out.println(arr1);
                return;
            }

        }

        if (arr1.length > arr2.length){
            System.out.println(arr2);
            System.out.println(arr1);
        }else {
            System.out.println(arr1);
            System.out.println(arr2);
        }

    }

}
