import java.util.HashMap;

public class TwoSum {
    public static int[] TwoSum(int[] a,int t){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int r = t - a[i];
            if(map.containsKey(r)) {
                return new int[]{
                        map.get(r), i
                };
            }
                map.put(a[i], i);
            }
            return new int[] {};
    }

    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum(input,target);
        for(int a:result){
            System.out.println(a);
        }
    }
}
