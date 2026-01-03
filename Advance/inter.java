package Advance;

interface A {

    int a = 50;
    String s = "Sandeep";

    void show();

    void config();
}

interface C {

    void run();
}

class B implements A, C {

    public void show() {
        System.out.println("This is show method");
    }

    public void config() {
        System.out.println("This is config method");
    }

    public void run() {
        System.out.println("Run");
    }
}

public class inter {

    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();
        C obj1 = new B();
        obj1.run();
        System.out.println(A.a);
        System.out.println(A.s);
    }
}
