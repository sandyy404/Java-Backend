package Advance;

@FunctionalInterface
interface A{
   void start();
}
public class Lambda {
   public static void main(String[] args) {
      // A car = new A() {          // this is by using anonymous inner class
      //    public void start(){
      //       System.out.println("Start the car");
      //    }
      // };

      // Lambda expression

      A car = ()-> System.out.println("Start the car");    // This is a Lambda expression.   -> this is called lambda.  public void start method is working behind the scene.
      car.start();
   }
}
