package Advance;

class myexception extends Exception {

    public myexception(String str) {
        super(str);
    }
}

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
            j = 0 / i;
            // int a[] = new int[9];
            //  int b = a[3];
            //  int n = str.length();
            // this is my exception.
            if (j == 0) {
                throw new myexception("This is created by me.");
            }
        } catch (myexception e) {
            System.out.println("This is the default value" + e);
        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        } catch (Exception e) {    // this is a parent exception so it should be at the last.
            System.out.println(e);
        }
    }
}
