package exceptionStudy;

public class Exception3 {
    public static void main(String [] args){
        System.out.println("hellow.all");
        String a="test";
        try {
            System.out.println(a.charAt(12));
        } catch (NullPointerException e) {
            System.out.println("object can not null");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("cheak index");
        }
        System.out.println("good noght");
        }

    }


