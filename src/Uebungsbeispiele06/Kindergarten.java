package Uebungsbeispiele06;

import java.util.ArrayList;
import java.util.List;

public class Kindergarten {

    private String klasse;
    List<Kind> children;

    public Kindergarten(String klasse) {
        this.klasse = klasse;
        this.children = new ArrayList<>();
    }

    public String getKlasse() {
        return klasse;
    }

    public List<Kind> getChildren() {
        return children;
    }

    public void addKind(Kind k) {
        children.add(k);
    }
}
