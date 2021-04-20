package Lesson2004;

import java.time.LocalDateTime;

public class SocialNetworkApp {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        MayBe<Integer> age = new MayBe<Integer>(23, 2);
        MayBe<Double> salary = new MayBe<Double>(2000.55, 1);
        MayBe<String> name = new MayBe<String>("Lucia", 3);
        MayBe<LocalDateTime> time = new MayBe<LocalDateTime>(localDateTime, 1);

        System.out.println(age.print());
        System.out.println(salary.print());
        System.out.println(name.print());
        System.out.println(time.print());

        // MayBe<int>   -> does not work  -    but wrapper class does:
        //MayBe<Integer>...

    }
}
