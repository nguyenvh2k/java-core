package me.logjava.this_oop;

public class UsingThisExample {
    private int id;

    private String website;

    private String subject;

    public UsingThisExample(){
        this.id = 1;
        this.website = "https://logjava.me";
    }

    // Gọi Constructor của lớp hiện tại.
    public UsingThisExample(String website){
        this(); // Bắt buộc phải dòng lệnh đầu tiên trong constructor
        this.website = website;
    }

    // Gọi Constructor của lớp hiện tại.
    public UsingThisExample(String website, String subject) {
        this(website); // Bat buoc phai dong lenh dau tien trong contructor
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWebsite() {
        return website;
    }

    // Trả về instance của lớp hiện tại
    public UsingThisExample setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    // Trả về instance của lớp hiện tại
    public UsingThisExample setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    // Gọi trực tiếp biến của lớp cha gần nhất.
    public void print() {
        System.out.println("Id = " + id);
        this.printWebsite();
        this.printSubject();
    }

    // this Được truyền như một tham số trong phương thức (method).
    public void print2(){
        Helper helper = new Helper();
        helper.print(this);
    }

    // this Được truyền như một tham số trong hàm dựng (constructor).
    public void print3(){
        Helper helper = new Helper(this);
        helper.printId();
        helper.printWebsite();
    }

    private void printWebsite() {
        System.out.println("Subject = " + subject);
    }

    private void printSubject() {
        System.out.println("Website = " + website);
    }

    public static void main(String[] args) {
        UsingThisExample ex1 = new UsingThisExample("logjava.me", "OOP");
        ex1.print();
        UsingThisExample ex2 = new UsingThisExample()
                .setWebsite("logjavav2.me")
                .setSubject("OOP");
        ex2.print();
        ex2.print2();
        ex2.print3();
    }
}
