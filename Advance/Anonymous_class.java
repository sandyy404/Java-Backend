package Advance;
class A{
   public void show(){
      System.out.println("This is normal class");
   }
}
public class Anonymous_class {
   public static void main(String[] args) {
      A obj = new A()
      {
    public void show(){
      System.out.println("This is an anonymous class example.");
    }
      };
      obj.show();
   }
}
