package com.javatest;

class Parent {
    public static void staticMethod(){
        System.out.println("This is static method of parent class");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("THis is static method of child class");
    }

}

public class StaticOverride {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod();

        Parent pa = new Parent();
        Child ca = new Child();

        pa.staticMethod();
        ca.staticMethod();
    }
    
}
