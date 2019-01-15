package problem;

public class No13 {
    public int movingCount(int m,int n,int threshold){
        int[][] visited=new int[m][n];
        return moving(visited,0,0,m,n,threshold);

    }
    private int moving(int[][] visited,int x,int y,int m,int n,int threshold){
        int count=0;
        if(x<0||y<0||x>=m||y>=n||visited[x][y]==1)return 0;
        if(enough(x,y,threshold)){
            visited[x][y]=1;
            count=1+moving(visited,x+1,y,m,n,threshold)+moving(visited,x,y+1,m,n,threshold)
                    +moving(visited,x-1,y,m,n,threshold)+moving(visited, x, y-1, m, n, threshold);

        }
        return count;
    }
    private boolean enough(int x,int y,int threadhold){
        if(numSm(x)+numSm(y)<=threadhold)return true;
        else return false;
    }
    private int numSm(int num){
        int rs=0;
        while(num>0){
            rs+=num%10;
            num=num/10;
        }

        return rs;
    }

    public static void main(String[] args) {
        No13 ma=new No13();
        System.out.println(ma.movingCount(10,10,4));
    }
}
