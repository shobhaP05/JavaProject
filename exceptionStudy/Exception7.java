package exceptionStudy;

public class Exception7 {
    public static void main(String[] args){
        try {
            String a = "pune";
            System.out.println(a.charAt(9));
        } catch (NullPointerException e) {
            System.out.println("object should not be null");
        } catch (ArithmeticException e) {
            System.out.println("divide by zero is not possilble");
        } catch (Exception e) {
            System.out.println("somthing went wrong");
        } finally {
            System.out.println("finally executed");
        }
        System.out.println("bye");

        }
    }

