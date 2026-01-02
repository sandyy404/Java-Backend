package Advance;

class Papa {

    public void mehnat() {
        System.out.println("Papa ki mahnat");
    }

    class Beta {

        public void padhna() {
            System.out.println("Bete ka padhna");
        }
    }
}

public class Inner_class {

    public static void main(String[] args) {
        Papa obj = new Papa();
        obj.mehnat();
        // Papa.Beta obj1 = new Papa.Beta();   if beta class is static.
        Papa.Beta obj1 = obj.new Beta();
        obj1.padhna();
    }
}
