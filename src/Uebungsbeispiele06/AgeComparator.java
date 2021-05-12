package Uebungsbeispiele06;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {
        if (o1.getAge() < o2.getAge()) return -1;
        if (o1.getAge() > o2.getAge()) return 1;
        else return 0;
    }

}
