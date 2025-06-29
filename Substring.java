import javax.annotation.processing.SupportedSourceVersion;

public class Substring {
    public static boolean Substring(String s1,String s2){
        if(s2.length() == 0) return true;
        if(s1.length() < s2.length()) return false;
        for(int i=0;i <= s1.length() - s2.length();i++){
            int j = 0;
            while(j < s2.length() && s1.charAt(i+j) == s2.charAt(j)){
                j++;
            }
            if(j == s2.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String string1 = "Jahnavi";
        String string2 = "Jahn";
        Boolean result = Substring(string1,string2);
        System.out.println(result + " given string is a substring of another string");
    }
}
