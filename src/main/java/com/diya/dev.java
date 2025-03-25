package com.diya;

public class dev {
    private laptop laptop; //REFERENCE VARIABLE
    public laptop getLaptop() {
        return laptop;
    }
    
    public void setLaptop(laptop laptop) {
        this.laptop = laptop;
    }
    private int age; //PRIMITIVE VARIABLE
    public dev(){
        System.out.println("dev constructor");
    }
    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    public dev(int age){
        this.age=age;
        System.out.println("dev 1 constructor");
    }
    public void build(){
        System.out.println("Building the project");
        laptop.compile();
    }
}
