package problem;

import node.TreeNode;

public class No36 {
    public TreeNode convert(TreeNode head){
        TreeNode last=null;
        convertNode(head,last);
        TreeNode newHead=head;
        if(newHead!=null&&newHead.left!=null){
            newHead=newHead.left;
        }
        return newHead;
    }
    private void convertNode(TreeNode cur,TreeNode last){
        if(cur==null)return;
        if(cur.left!=null){
            convertNode(cur.left,last);

        }

        if(last!=null) {
            last.right = cur;
            cur.left=last;
        }

        last=cur;
        if(cur.right!=null){
            convertNode(cur.right,last);
        }

    }
}
