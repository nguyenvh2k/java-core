package me.logjava.super_oop;

public class Child extends Parent{

    public String website = "https://gpcoder.com";

    public Child() {
        System.out.println("This is child");
    }

    // super gọi trực tiếp constructor của lớp cha gần nhất.
    public Child(String website) {
        super(website);
        System.out.println("This is child");
    }

    // Gọi trực tiếp biến của lớp cha gần nhất.
    public void printParent() {
        System.out.println("Short link: " + super.website);
        System.out.println("Subject " + subject);
    }

    public void printChild() {
        System.out.println("Full link: " + website);
        System.out.println("Subject " + subject);
    }

    // Gọi trực tiếp phương thức (method) của lớp cha gần nhất
    public void printChild2() {
        super.print();
        welcome();
    }

    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("---");
        Child child2 = new Child("gpcoder.com");
        child2.printChild();
        child2.printParent();
        child2.printChild2();
    }
}
