package Advance;

interface A {

    int a = 50;
    String s = "Sandeep";

    void show();

    void config();
}

class B implements A {

    public void show() {
        System.out.println("This is show method");
    }

    public void config() {
        System.out.println("This is config method");
    }
}

public class inter {

    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();
        System.out.println(A.a);
        System.out.println(A.s);
    }
}
