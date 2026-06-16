package exceptionStudy;

public class Exception5 {
    public static void main(String[] args){
        String a="null";
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("/ by zero not possible");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("cheak string index");
        }catch (NullPointerException e) {
            System.out.println("cheak object should not be change");
        } catch (Exception e) {
            System.out.println("Somthing went wrong");
        }
        System.out.println("hello program over");
        }
    }

