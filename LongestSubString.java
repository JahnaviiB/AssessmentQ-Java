import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {
    public static String LongestSubString(String s){
        String longest = "";
        int left = 0;
        HashSet<Character> visited = new HashSet<>();
        int n = s.length();
        for(int i=0; i< n; i++){
            while ((visited.contains(s.charAt(i)))){
                visited.remove(s.charAt(left));
                left++;
            }
            visited.add(s.charAt(i));
            if(i-left + 1 > longest.length()){
                longest = s.substring(left,i+1);
            }
        }
        return longest;
    }

    public static void main(String[] args){
        String intput = "Jahnavi";
        String output = LongestSubString(intput);
        System.out.println(output);
    }
}