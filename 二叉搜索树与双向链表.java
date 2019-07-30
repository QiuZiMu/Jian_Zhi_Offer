public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        pRootOfTree=search(pRootOfTree);
        while(pRootOfTree.left!=null){
               pRootOfTree=pRootOfTree.left;
        }
        return pRootOfTree;
    }
    public TreeNode search(TreeNode pRootOfTree) {
        if(pRootOfTree.right!=null){
           TreeNode rd=Convert(pRootOfTree.right);
           while(rd.left!=null){
               rd=rd.left;
            }
            rd.left=pRootOfTree;
            pRootOfTree.right=rd;
        }
        if(pRootOfTree.left!=null){
            TreeNode ld=Convert(pRootOfTree.left);
            while(ld.right!=null){
                ld=ld.right;
            }
            ld.right=pRootOfTree;
            pRootOfTree.left=ld;
        }
        return pRootOfTree;
    }
}