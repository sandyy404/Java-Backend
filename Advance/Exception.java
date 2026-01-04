package Advance;

public class Exception {
   public static void main(String[] args) {
      int i =0;
      try{ 
      int j = 10/i;
      }catch (ArithmeticException e){ 
    System.out.println("Handle the error in j");
      }
    //  System.out.println(j);
   }
}
