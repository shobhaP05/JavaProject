package logicalProgram;

public class ReverseString {
    public static void main(String[] args){
        String s = "Pune";    //enup
        String rev = "";
        //inti = maxindex--->s.length()-1 update--->-1     condition  >=0
        for(int i =s.length() -1; i >=0 ;i--) {
            char t = s.charAt(i);
            rev = rev + t;
        }
        System.out.println(rev);

    }



}
