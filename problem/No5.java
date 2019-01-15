package problem;

public class No5 {
    private String replace(String input){
        StringBuilder sb=new StringBuilder();
        int length=input.length();
        for(int i=0;i<length;i++){
            if(input.charAt(i)!=' ')
                sb.append(input.charAt(i));
            else{
                sb.append("%20");
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        No5 b=new No5();
        String s="to die";
        System.out.println(b.replace(s));
    }
}
