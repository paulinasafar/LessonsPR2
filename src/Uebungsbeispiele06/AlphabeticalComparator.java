package Uebungsbeispiele06;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {
        if (o1.getLname().equals(o2.getLname())) {
            return o1.getFname()
                    .compareTo(o2.getFname());
        } else {
            return o1.getLname()
                    .compareTo(o2.getLname());
        }
    }
}
