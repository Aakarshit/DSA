package java.src;

public class BinaryTreeMaximumPathSum {
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return ans;
    }
    public int solve(TreeNode root){
        int l,r;
        l=root.left==null?0:Math.max(0,solve(root.left));
        r=root.right==null?0:Math.max(0,solve(root.right));
        ans=Math.max(root.val+l+r,ans);
        return root.val+Math.max(l,r);
    }
}
