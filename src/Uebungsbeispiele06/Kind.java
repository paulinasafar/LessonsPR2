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

    @Override
    public String toString() {
        return "Kind{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
