package exceptionStudy;

public class Exception6 {
  public static void main(String[] args){
      String a = null;
      try {
          System.out.println(a.length());
      } finally {
          System.out.println("finally block executed");
      }
      System.out.println("end of code");
      }

  }





