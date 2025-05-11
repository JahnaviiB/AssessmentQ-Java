import java.util.HashMap;

public class CountDuplicates {
    public static int CountDuplicates(int[] a){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:a){
            freq.merge(num,1,Integer::sum);
        }
        int duplicates = 0;
        for(int count:freq.values()){
            if(count>1){
                duplicates += (count - 1);
            }
        }
        return duplicates;
    }

    public static void main(String[] args){
        int[] input = {1,2,3,2,3,4,1,1};
        int result = CountDuplicates(input);
       /* for(int num:input){
            System.out.println(num);
        }*/
        System.out.println(result);
    }
}
