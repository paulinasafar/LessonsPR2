package Uebungsbeispiele06;

import java.util.*;

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

    @Override
    public String toString() {
        return "Kindergarten= " + klasse + " " + children;
    }
}
