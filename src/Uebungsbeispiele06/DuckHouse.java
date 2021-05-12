package Uebungsbeispiele06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuckHouse {

    private List<Duck> duckHouse;

    public DuckHouse() {
        this.duckHouse = duckHouse;
    }

    public void addDuck(Duck d) {
        duckHouse.add(d);
    }

    public List<Duck> getDuckHouse() {
        return duckHouse;
    }

    public Map<Integer, List<Duck>> getGruppierteEnten() {
        Map<Integer, List<Duck>> groupedMap = new HashMap<>();
        List<Duck> groupedList = new ArrayList<>();

        for (int i = 0; i < duckHouse.size(); i++) {
            if (duckHouse.get(i).getFullWeight() <= 100) {
                groupedList.add(duckHouse.get(i));
                groupedMap.put(100, groupedList);
            } else if (duckHouse.get(i).getFullWeight() <= 200) {
                groupedList.add(duckHouse.get(i));
                groupedMap.put(200, groupedList);
            } else if (duckHouse.get(i).getFullWeight() <= 300) {
                groupedList.add(duckHouse.get(i));
                groupedMap.put(300, groupedList);
            }
        }
        return groupedMap;
    }

}
