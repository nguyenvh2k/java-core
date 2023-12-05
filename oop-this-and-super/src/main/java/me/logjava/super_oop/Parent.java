package me.logjava.super_oop;

public class Parent {
    public String website = "gpcoder.com";
    public String subject = "OOP";

    public Parent() {
        System.out.println("This is parent");
        print();
    }

    public Parent(String website) {
        this.website = website;
        System.out.println("This is parent");
        print();
    }

    public void print() {
        System.out.println("Website = " + website);
    }

    public void welcome() {
        System.out.println("Welcome to gpcoder.com");
    }
}
