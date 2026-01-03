package Advance;

enum Status {
    Success, Failed, Pending;    // these are the object constant of the Status class
}

public class Enum {

    public static void main(String[] args) {
        Status s = Status.Failed;
        // System.out.println(s);
        // System.out.println(s.ordinal());   // this will give the order of s.
        //    Status []ss = Status.values();
        //   for(Status a :ss){
        //    System.out.println(a.ordinal() + ":" + a);
        //   }

        // if(s==Status.Failed){
        //    System.out.println("Sorry! Try again" );
        // }else if(s == Status.Pending){
        //    System.out.println("Your transaction is underprocess");
        // }else if(s == Status.Success){
        //    System.out.println("Congratulation! Your transaction is successfully done");
        // }
        switch (s) {
            case Success:
                System.out.println("Congratulation! Your transaction is successfully done");
                break;
            case Failed:
                System.out.println("Sorry! Try again");
                break;
            case Pending:
                System.out.println("Your transaction is underprocess");
                break;
            default:
                System.out.println("Done");
        }

    }
}
