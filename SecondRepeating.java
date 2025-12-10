import java.util.HashMap;
import java.util.Map;

public class SecondRepeating {
    public static String secondnonrepeating(String s){
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.get(c) == 1) {
                count++;
                if (count == 2) {
                    return s.valueOf(c);
                }
            }
        }
        return "Non second non - repeating character";
    }
    public static void main(String[] args){
        String input = "swiss";
        String output = secondnonrepeating(input);
        System.out.println(output);
    }
}
