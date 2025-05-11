public class MaxAdjacentTwoDigit {
    public static String MaxAdjacentTwoDigit(String s){
        int max = 0;
        for(int i=0;i<s.length()-1;i++){
            String pair = s.substring(i,i+2);
            int value = Integer.parseInt(pair);
            if(value > max){
                max = value;
            }
        }
        return String.valueOf(max);
    }
    public static void main(String[] args){
        String input = "8791234";
        String result = MaxAdjacentTwoDigit(input);
        System.out.println(result);
    }
}
