package me.logjava.this_oop;

public class Helper {

    private UsingThisExample ex;

    public Helper() {
    }

    public Helper(UsingThisExample ex){
        this.ex = ex;
    }

    public void print(UsingThisExample ex) {
        System.out.println("Id = " + ex.getId());
        System.out.println("Website = " + ex.getWebsite());
    }

    public void printId() {
        System.out.println("Id = " + ex.getId());
    }

    public void printWebsite() {
        System.out.println("Website = " + ex.getWebsite());
    }
}
