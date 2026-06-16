package logicalProgram;

public class CountNumberOfWhiteSpace {
    public static void main(String[] args){
        String s = "   Tes         tnig   ";  //3
        int counter=0;
        for (int i=0; i <=s.length()-1; i++){
            char temp =s.charAt(i);
            if (temp == ' '){
                counter++;
            }
        }
        System.out.println("Number of white space are" + counter);
    }
}
