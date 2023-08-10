package pack2;

import pack1.A;
import pack1.B;

class B2 {
    public static void main(String[] args) {
        System.out.println("B2 from pack2");
        A a = new A();
        B b = new B();

        b.m1();
    }

}