package Lesson2004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HolidayApp {
    public static void main(String[] args) {

        Holiday summerHoliday =  new Holiday("Gold Coast", 2, 4);
        Holiday winterHoliday = new Holiday("Copacabana", 21, 3);
        Holiday defaultHoliday = new Holiday();
        Holiday holiday1 = new Holiday("Dubrovnik", 10,3);
        Holiday holiday2 = new Holiday("Dominican Republic", 15,5);
        Holiday holiday3 = new Holiday("Hawaii", 21,2);

        //summerHoliday.setNrPersons(3);
        System.out.println(summerHoliday.getNrPersons());
        System.out.println(summerHoliday);

        System.out.println("----------------------------------------------------");

        ArrayList<Holiday> holidays = new ArrayList<>();
        holidays.add(summerHoliday);
        holidays.add(winterHoliday);
        holidays.add(defaultHoliday);
        holidays.add(holiday1);
        holidays.add(holiday2);
        holidays.add(holiday3);

        System.out.println(holidays);
        //Collections.sort(holidays);
        System.out.println(holidays);
        Collections.sort(holidays, new HolidayComparator());
        System.out.println(holidays);

    }
}
