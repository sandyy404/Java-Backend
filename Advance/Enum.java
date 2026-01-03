package Advance;


enum Status{
   Success,Failed,Pending;
}
public class Enum {
   public static void main(String[] args) {
      Status s =  Status.Success;
      // System.out.println(s);
      // System.out.println(s.ordinal());   // this will give the order of s.
      Status []ss = Status.values();
     for(Status a :ss){
      System.out.println(a.ordinal() + ":" + a);
     }

   }
}
