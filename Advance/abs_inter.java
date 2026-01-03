package Advance;

// abstract class

// abstract  class Computer {
//    public abstract  void code();
// }
// class Desktop extends Computer {

//     public void code() {
//         System.out.println("code,compile,run:faster");
//         System.out.println("This is desktop section");
//     }
// }

// class Laptop extends Computer{

//     public void code() {
//         System.out.println("code,compile,run");
//         System.out.println("Thid is Laptop section");
//     }
// }


// interface

  interface Computer {
    void code();
}
class Desktop implements  Computer {

    public void code() {
        System.out.println("code,compile,run:faster");
        System.out.println("This is desktop section");
    }
}

class Laptop implements  Computer{

    public void code() {
        System.out.println("code,compile,run");
        System.out.println("Thid is Laptop section");
    }
}
class Developer {

    public void devApp(Computer a) {
        a.code();
        
    }
}

public class abs_inter {

    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer sandeep = new Developer();
         sandeep.devApp(lap);
         sandeep.devApp(desk);

    }
}
