import java.util.HashMap;
import java.util.HashSet;

public class MaxUniqueBetweenPairs {
    public static int MaxAdjacentTwoDigit(String a) {
        HashMap<Character, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            lastIndexMap.put(a.charAt(i), i);
        }
        int maxunique = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int lastindex = lastIndexMap.get(ch);
            if (lastindex > i + 1) {
                HashSet<Character> uniquechars = new HashSet<>();
                for (int j = i + 1; j < lastindex; j++) {
                    uniquechars.add(a.charAt(j));
                }
                maxunique = Math.max(maxunique, uniquechars.size());
            }
        }
        return maxunique;
    }
    public static void main(String[] args) {
        String input = "abcaakkl";
        int result = MaxAdjacentTwoDigit(input);
        System.out.println(result);
    }
}
