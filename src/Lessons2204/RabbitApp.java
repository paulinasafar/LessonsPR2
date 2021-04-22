package Lessons2204;

import javax.xml.stream.events.EntityReference;

public class RabbitApp {

    public static void main(String[] args) {

       // Rabbit rabbit  = new Rabbit();
        XmasBunny xmasBunny = new XmasBunny("Xmasy");
        EasterBunny easterBunny = new EasterBunny("Easty");
        BunnyPen pen = new BunnyPen();

        xmasBunny.hopp(25);
        easterBunny.hopp(25);
        System.out.println("*******************************");

        Rabbit rabbit = easterBunny;
        rabbit.hopp(10);


        EasterBunny o2 = (EasterBunny) rabbit;
        o2.hidesGifts(7);

    }
}
