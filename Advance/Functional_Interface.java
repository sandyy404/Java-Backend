package Advance;
@FunctionalInterface
interface A {

    void show();
}

// class B implements A {

//     public void show() {
//         System.out.println("This is a show method");
//     }
// }

public class Functional_Interface {

    public static void main(String[] args) {
      //   A obj  = new B();
      //   obj.show();    for class B
      A obj = new A() {
         public void show(){
            System.out.println("This is anonymous inner class");
         }
      };
      obj.show();
    }
}
