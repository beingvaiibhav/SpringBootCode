package com.vaibhavdubey.week1Introduction.IntroductionToSpringBoot;

public class Student {
    private String name;
    private int roll_no;
    private float marks;

    Student(String name,int roll_no,float marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No. : "+name);
        System.out.println("Marks : "+name);
    }
}
