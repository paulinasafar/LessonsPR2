package Uebungsbeispiele06;

import java.util.*;

public class DuckHouse {

    private List<Duck> duckHouse;

    public DuckHouse() {
        this.duckHouse = new ArrayList<>();
    }

    public void addDuck(Duck d) {
        duckHouse.add(d);
    }

    public List<Duck> getDuckHouse() {
        return duckHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DuckHouse)) return false;
        DuckHouse duckHouse1 = (DuckHouse) o;
        return getDuckHouse().equals(duckHouse1.getDuckHouse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDuckHouse());
    }

    public Map<Integer, List<Duck>> getGroupedDucks() {
        Map<Integer, List<Duck>> groupedMap = new HashMap<>();
        List<Duck> groupedList100 = new ArrayList<>();
        List<Duck> groupedList200 = new ArrayList<>();
        List<Duck> groupedList300 = new ArrayList<>();

        for (int i = 0; i < duckHouse.size(); i++) {
            if (duckHouse.get(i).getFullWeight() <= 100) {
                groupedList100.add(duckHouse.get(i));
                groupedMap.put(100, groupedList100);
            } else if (duckHouse.get(i).getFullWeight() <= 200) {
                groupedList200.add(duckHouse.get(i));
                groupedMap.put(200, groupedList200);
            } else if (duckHouse.get(i).getFullWeight() <= 300) {
                groupedList300.add(duckHouse.get(i));
                groupedMap.put(300, groupedList300);
            }
        }
        return groupedMap;
    }

    @Override
    public String toString() {
        return "DuckHouse" +
                "duckHouse=" + duckHouse;
    }
}
