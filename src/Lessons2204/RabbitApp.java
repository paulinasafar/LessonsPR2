package Lessons2204;

import javax.xml.stream.events.EntityReference;

public class RabbitApp {

    public static void main(String[] args) {

        Rabbit rab  = new Rabbit("Bugs Bunny");
        XmasBunny xmasBunny = new XmasBunny("Xmasy");
        EasterBunny easterBunny = new EasterBunny("Easty");
        BunnyPen pen = new BunnyPen();

        rab.hopp(25);
        xmasBunny.hopp(25);
        easterBunny.hopp(25);
        System.out.println("*******************************");

        Rabbit rabbit = easterBunny;
        rabbit.hopp(10);



        EasterBunny o2 = (EasterBunny) rabbit;
        o2.hopp(15);
        o2.hidesEggs(7);

        pen.addRabbits(xmasBunny);
        pen.addRabbits(o2);
        pen.addRabbits(easterBunny);
        pen.addRabbits(rab);
        pen.addRabbits(rabbit);
        System.out.println("--------------------------------------");
        pen.hophop();


    }
}
