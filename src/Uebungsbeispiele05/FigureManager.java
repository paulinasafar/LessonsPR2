package Uebungsbeispiele05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    protected ArrayList<Figure> figures;

    public FigureManager() {
        this.figures = new ArrayList<>();
    }

    public void add(Figure f) {
        figures.add(f);
    }

    public double getMaxPerimeter() {
        double temp = 0.0;
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getPerimeter() > temp) {
                temp = figures.get(i).getPerimeter();
            }
        }
        return temp;
    }

    public double getAverageAreaSize() {
        double sum = 0.0;
        for (int i = 0; i < figures.size(); i++) {
            sum += figures.get(i).getArea();
        }
        return sum / figures.size();
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> areaSize = new HashMap<>();

        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getArea() < 1000) {
                areaSize.put("Klein", areaSize.getOrDefault("Klein", 0.0) + figures.get(i).getArea());
            } else if (figures.get(i).getArea() < 5000) {
                areaSize.put("Mittel", areaSize.getOrDefault("Mittel", 0.0) + figures.get(i).getArea());
            } else if (figures.get(i).getArea() >= 5000) {
                areaSize.put("Gross", areaSize.getOrDefault("Gross", 0.0) + figures.get(i).getArea());
            }
        }
    return areaSize;}

    @Override
    public String toString() {
        return "FigureManager" + figures;
    }
}
