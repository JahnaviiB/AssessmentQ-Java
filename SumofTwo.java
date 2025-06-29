public class SumofTwo {
    public static int SumofTwo(int[] a1){
        int max = -1;
        for(int i=0;i<a1.length-1;i++){
            int sum = a1[i] + a1[i+1];
            for(int j=0;j<a1.length;j++){
                if(j != i && j != i+1 && a1[j] == sum){
                    if(a1[j] > max){
                        max = a1[j];
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] array1 = {1,3,4,5,7,8};
        int result = SumofTwo(array1);
        System.out.println("Sum of 2 numbers in the given array is : " + result);
    }
}
