package problem;

public class No60 {
    //n个骰子
    //rs[i] is the number of sum that equals i
    public void printP(int n) {
        int[] rs = new int[n * 6 + 1];
        for (int i = 1; i <= 6; i++) {
            rs[i] = 1;
        }
        //i : the number of touzi
        for (int i = 2; i <= n; i++) {
            for (int j = i * 6; j >= i; j--) {
                rs[j]=0;
                for (int k = 1; k <= 6; k++) {
                    if (j - k >= (i-1) && rs[j - k] != 0) {
                        rs[j] += rs[j - k];
                    }
                }
            }
        }
        outResult(rs,n);

    }

    public void outResult(int[] rs,int n) {
        for (int i = n; i < rs.length; i++) {
            System.out.println(rs[i]);

        }
    }

    public static void main(String[] args) {
        No60 n=new No60();
        n.printP(4);
    }

}
