package Advance;

@FunctionalInterface
interface A{
   int sum(int i,int j);
}
public class Lambda_example {
   public static void main(String[] args) {
      // A jod = new A() {
      //   public  int sum(int i,int j){
      //    return i+j;
      //   }
      // };
      A jod = ( i, j) -> i+j;       // if I curly bracket is there then return keyword is mendatory.
     int a = jod.sum(5,4);
     System.out.println(a);
   }
}
