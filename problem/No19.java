package problem;

public class No19 {
    public boolean match(String str, String pattern) {
        if (str == null || pattern == null) return false;
        char[] strArr = str.toCharArray();
        char[] patArr = pattern.toCharArray();
        return matchpos(strArr, 0, patArr, 0);
    }

    public boolean matchpos(char[] str, int i, char[] pat, int j) {
        if (i == str.length && j == pat.length) return true;
        if (i != str.length && j == pat.length) return false;

        if (j < pat.length - 1 && pat[j + 1] == '*') {
            if(i!=str.length) {
                if (str[i] != pat[j]) {
                    return matchpos(str, i, pat, j + 2);
                } else {
                    //*分别代表0，1，多
                    return matchpos(str, i, pat, j + 2) || matchpos(str, i + 1, pat, j + 2) || matchpos(str, i + 1, pat, j);
                }
            }else{
                return matchpos(str,i,pat,j+2);
            }
        } else {

            if ((i!=str.length)&&(pat[j] == '.' || str[i] == pat[j])) return matchpos(str, i + 1, pat, j + 1);

            else return false;
        }
    }

    public static void main(String[] args) {
        String str = "aaa";
        String pattern = "ab*ac*a";
        No19 n = new No19();
        System.out.println(n.match(str, pattern));
    }
}
