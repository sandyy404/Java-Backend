package Advance;

class A {

    public void show() throws ClassNotFoundException {

        // method first to handle the exception.
        //  try {
        //      Class.forName("Throws");
        //  } catch (ClassNotFoundException ex) {
        //      System.getLogger(A.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        //  }
        // method second to handle the exception.
        Class.forName("Throw");
    }
}

public class Throws_ {

    public static void main(String[] args) {
      A obj = new A();
      //method  to handle the exception.
      try {
         obj.show();
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();   //this will show that what stack have. 
      }
      // method second is that use throws keyword with main method but this is bad habit because using throws with main method means u r saying to handle the exception  to main method that is very bad habit and jvm will say i wlil not work.
        System.out.println("This is main method");
    }
}
