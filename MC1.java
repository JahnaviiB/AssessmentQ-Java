/*class TreeNode {
    int val;
    treeNode left;
    treeNode right;

    TreeNode(int val) { this.val = val; this.left = null; this.right = null;}
}
public class MC1 {
    public int rangeSumBST(treeNode root, int low, int high){
        if(root == null) return 0;
        int sum =0;

        if(root.val>low){
            sum+=rangeSumBST(root.left,low,high);
        }
        if(root.val<high){
            sum+=rangeSumBST(root.right,low,high);
        }

        if(root.val>=low &&root.val<=high){
            sum+=root.val;
        }

        return sum;
    }

    public static void main(String[] args) {
        treeNode root1 = new treeNode(10);
        root1.left = new treeNode(5);
        root1.right = new treeNode(15);
        root1.left.left = new treeNode(3);
        root1.left.right = new treeNode(7);
        root1.right.right = new treeNode(18);

        MC1 bstRangeSum = new MC1();
        int result1 = bstRangeSum.rangeSumBST(root1, 7, 15);
        assert result1 == 32: "Test 1 Failed";
        System.out.println(result1);
        System.out.println("Test 1 Passed");

        int result2 = bstRangeSum.rangeSumBST(root1, 1, 20);
        assert result2 == 53: "Test 1 Failed";
        System.out.println(result2);
        System.out.println("Test 2 Passed");

    }

}
*/