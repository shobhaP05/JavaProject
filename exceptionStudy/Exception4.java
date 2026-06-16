package exceptionStudy;

public class Exception4 {
    public static void main(String[] args){
        String a="pune";
        try {
            System.out.println(a.charAt(-1));
        } catch (Exception e){
            System.out.println("somthing went rong");
        }
        }
    }

