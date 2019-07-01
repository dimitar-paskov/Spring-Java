import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LAbP07SumsByTown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> towns = new TreeMap<>();

        for (int i = 1 ; i <= n; i++) {
            String[] tokens = scanner.nextLine().split("[| ]+");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());
            if (!towns.containsKey(town)){
                towns.put(town, new Double(0));
            }

            towns.put(town, towns.get(town)+ income);
        }

        for (String town:towns.keySet()
             ) {
            System.out.println(town + " -> " + towns.get(town));
        }

    }
}
