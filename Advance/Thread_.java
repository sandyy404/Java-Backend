package Advance;

class A extends Thread{
   public void run(){
     for(int i=0;i<200;i++){
      System.out.println("hi");
      try {
         Thread.sleep(10);      // this will stop for some ms.
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
     }
   }
}
class B extends Thread{
   public void run(){
      for(int i =0 ;i<200;i++){
         System.out.println("hello");
         try {
         Thread.sleep(10);   // this will stop for some ms.
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      }
   }
}
public class Thread_ {
   public static void main(String[] args) {
      A obj1 = new A();
      B obj2 = new B();
     obj1.run();
     obj2.run();   // this is normal call of method  we use run method to override this from  thread class  because it is inbuild in thread class.
      // obj1.start();
      // try {
      //    Thread.sleep(5);    // this will stop for some ms.
      // } catch (InterruptedException e) {
      //    // TODO Auto-generated catch block
      //    e.printStackTrace();
      // }
      // obj2.start();
   }
}
