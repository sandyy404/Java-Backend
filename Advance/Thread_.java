package Advance;

class A extends Thread{
   public void run(){
     for(int i=0;i<200;i++){
      System.out.println("hi");
     }
   }
}
class B extends Thread{
   public void run(){
      for(int i =0 ;i<200;i++){
         System.out.println("hello");
      }
   }
}
public class Thread_ {
   public static void main(String[] args) {
      A obj1 = new A();
      B obj2 = new B();
      obj1.start();
      obj2.start();
   }
}
