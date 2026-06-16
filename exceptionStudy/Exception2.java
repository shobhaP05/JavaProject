package exceptionStudy;

public class Exception2 {
    public static void main(String [] args){
        System.out.println("hi");
        try {
            System.out.println(10 / 0); //risy code
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
        }
        System.out.println("hello");

        }
    }


