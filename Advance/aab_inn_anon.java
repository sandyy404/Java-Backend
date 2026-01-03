package Advance;

abstract class A {

    public abstract void show();
}

public class aab_inn_anon {

    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("This is overriding the abstract class method.");
            }
        };
        obj.show();
    }
}
