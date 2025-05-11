import java.sql.PreparedStatement;

public class LookandSay {
    public static String LookAndSay(String s){
        StringBuilder a = new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else {
                a.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        a.append(count).append(s.charAt(s.length()-1));
        return a.toString();
    }
    public static void main(String[] args){
        String input = "1211";
        String result = LookAndSay(input);
        System.out.println(result);
    }
}
