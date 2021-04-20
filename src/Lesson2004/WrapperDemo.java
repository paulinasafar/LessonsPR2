package Lesson2004;

public class WrapperDemo {

    public static void main(String[] args) {

        Integer number;
        Integer number2;

        number = new Integer(222);
        int i = number.intValue() * 2;
        System.out.println(i);

        // autoboxing - primitive type and class type can be exchanged for each other
        number2 = 222; // new Integer is not necessary, but we still get an instance of an Object.
        int j = number2 + 7; //should not work because Integer + int, but it works due to autoboxing


        String doubleNr = "7.456";
        System.out.println(doubleNr + 1000); //because doubleNr is string, 1000 is changed to String and we get concatenation
        // we can convert to number
        double d = Double.parseDouble(doubleNr);
        System.out.println("(d = " + (d + 1000));

    }
}
