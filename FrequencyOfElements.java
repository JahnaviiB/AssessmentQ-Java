import java.util.*;

public class FrequencyOfElements {
    public static Map<Integer,Integer> sortelementfrequency(int[] inputfreq){
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num :inputfreq){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<Integer,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    public static void main(String[] args){
        int[] input = {2,3,3,4,5,6,6,};
        Map<Integer,Integer> output = sortelementfrequency(input);
        System.out.println(output);
    }
}
