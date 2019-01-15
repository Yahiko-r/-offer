package problem;

import node.TreeNode;
//根据前序遍历和中序遍历构建二叉树。
public class No7 {
    private TreeNode construct(int[] preorder, int[] inorder) throws Exception {
        if (preorder == null || inorder == null) return null;
        int length = preorder.length;
        TreeNode head=constructCore(preorder,0,length-1,inorder,0,length-1);
        return head;

    }

    private TreeNode constructCore(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) throws Exception {
        int length = preEnd - preBegin + 1;
        TreeNode head = new TreeNode();
        head.value = preorder[preBegin];
        if (preBegin == preEnd) {
            if(preBegin==preEnd && preorder[preBegin]==inorder[inBegin]){  //到达底部的时候只剩下一个节点，不用再继续遍历。
                return head;
            }else {
                throw new Exception("can't construct tree");
            }
        }

        int inPos=-1;
        for (int i = inBegin; i <= inEnd; i++) {
            if (inorder[i] == preorder[preBegin]) {
                inPos = i;
                break;
            }
        }
        int leftLength=inPos-inBegin;
        int newPreEnd=preBegin+leftLength;
        if(leftLength>0){
            //构建左子树
            head.left=constructCore(preorder,preBegin+1,newPreEnd,inorder,inBegin,inPos-1);
        }
        if(leftLength<preEnd-preBegin){
            //右子树
            head.right=constructCore(preorder,newPreEnd+1,preEnd,inorder,inPos+1,inEnd);
        }
        return head;
    }
}
