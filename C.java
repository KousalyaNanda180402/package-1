package child;

import parent.P;

class C extends P {

    void m5() {
        System.out.println("default from class C");
    }

    public static void main(String[] args) {
        C c = new C();
        // c.m1();
        c.m2();
        // c.m3();
        c.m4();
        c.m5();

    }

}
