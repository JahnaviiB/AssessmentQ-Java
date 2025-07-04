import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] MergeInterval(int[][] intervals){
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= current[1]){
                current[1] = Math.max(current[1],intervals[i][1]);
            }
            else{
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args){
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] output = MergeInterval(input);
        for(int[] a:output){
            System.out.println("[" + a[0] + "," + a[1] + "]");
        }
    }
}
