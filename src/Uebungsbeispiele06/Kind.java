package Uebungsbeispiele06;

import lombok.Data;

@Data
public class Kind {

    private String fname;
    private String lname;
    private int age;

    public Kind(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Child: " + fname + " " + lname + ", is " + age + " years old";
    }

    }

