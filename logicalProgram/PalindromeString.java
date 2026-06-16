package logicalProgram;

public class PalindromeString {
    public static void main(String[] args){
        //mom dad radar madam nitin pune
        String s1 = "Radar";
        String rev = "";
        String s = s1.toLowerCase();
        for (int i = s.length() - 1; i >=0; i--)  //i=4
        {
            char temp = s.charAt(i);
            rev = rev + temp;
        }
        System.out.println("Given String is " +s);
        System.out.println("Revrse String is " +rev);
        if(s.equals(rev)) {
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");




    }
    }
}
