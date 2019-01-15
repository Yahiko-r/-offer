package problem;

import node.TreeNode;

import java.util.Stack;

public class No35 {
    public void findPath(TreeNode head,int target){
        if(head==null)return;
        find(head,target,0,new Stack<Integer>());
    }
    private void find(TreeNode node, int target, int sum, Stack<Integer> stack){
        sum+=node.value;
        stack.push(node.value);
        if(node.left==null&&node.right==null&&sum==target){
            for(int i=0;i<stack.size();i++){
                System.out.println(stack.pop());
            }
        }

        if(node.left!=null){
            find(node.left,target,sum,stack);
        }
        if(node.right!=null){
            find(node.right,target,sum,stack);
        }
        stack.pop();
    }
}
