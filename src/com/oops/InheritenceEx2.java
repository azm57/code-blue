package com.oops;
class Basee {
    public void test() {
    }
}

class Base1 extends Basee {
    public void test() {
         System.out.println("Base1");
    }
}

class Base2 extends Basee {
    public void test() {
         System.out.println("Base2");
    }
}

class InheritenceEx2 {
    public static void main(String[] args) {
        Basee obj = new Base1();
        ((Base2) obj).test(); // CAST
    }
}
