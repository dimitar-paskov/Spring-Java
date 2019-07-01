import java.util.*;

public class EP09MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        HashMap<Integer, Integer> counts = new HashMap<>();
        HashMap<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!counts.containsKey(arr[i])){
                counts.put(arr[i], 1);
                indexes.put(arr[i], i);
            }else{
                int count = counts.get(arr[i]);
                counts.put(arr[i], ++count);
            }
        }

        Integer maxCount = (Collections.max(counts.values()));
        ArrayList<Integer> maxCountKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue()==maxCount) {
                maxCountKeys.add(entry.getKey());
            }
        }

//        Integer maxCount = 0;
//        for (Map.Entry<Integer, Integer> count:counts.entrySet()
//             ) {
//            if (count.getValue() > maxCount){
//                maxCount = count.getValue();
//            }
//        }


        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < maxCountKeys.size(); i++) {
            if (indexes.get(maxCountKeys.get(i)) < minIndex){
                minIndex = indexes.get(maxCountKeys.get(i));
            }
        }

        System.out.println(arr[minIndex]);
//        System.out.println(counts.get(arr[minIndex]));

    }
}
