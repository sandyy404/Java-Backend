package Advance;

public class ExceptionDemo {

    public static void main(String[] args) {
        //    int i =0;

        //    try{ 
        //       int j = 10/i;
        //       System.out.println(j);
        //    }catch (ArithmeticException e){ 
        //  System.out.println("Handle the error in j");
        //    }
        int i = 5;
        int j = 0;
        String str = null;
        try {
         j = 150/i;
            int a[] = new int[9];
            int b = a[3];
            int n = str.length();
        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        }catch(Exception e){    // this is a parent exception so it should be at the last.
         System.out.println(e);
        }
    }
}
