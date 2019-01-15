package problem;
//矩阵从左到右升序，从上到下升序，找一个数的位置
public class No4 {
    private int[] find(int[][] mat,int tar){
        if(mat==null)return new int[]{-1,-1};
        int row=mat.length-1;
        int col=mat[0].length-1;
        while(row>=0&&col>=0){
            if(mat[row][col]==tar)return new int[]{row,col};
            if(mat[row][col]>tar)col--;
            else
                row++;
        }
        return new int[]{-1,-1};
    }
}
