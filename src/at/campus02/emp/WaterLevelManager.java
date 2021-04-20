package at.campus02.emp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WaterLevelManager {

    private List<WaterLevel> waterlevel;

    public WaterLevelManager() {
        this.waterlevel = new ArrayList<WaterLevel>();
    }

    public void addWaterLevel(WaterLevel wl1) {
        waterlevel.add(wl1);
    }

    public WaterLevel findById(int id) {
        for (int i = 0; i < waterlevel.size(); i++) {
            if (waterlevel.get(i).getId() == id) {
                return waterlevel.get(i);
            }
        }
        return null;
    }

    public ArrayList<WaterLevel> findAllByBodyWater(String bodyWaterName) {
        ArrayList<WaterLevel> wl1 = new ArrayList<WaterLevel>();

        for (int i = 0; i < waterlevel.size(); i++) {
            if (waterlevel.get(i).getBodyWaterName().equals(bodyWaterName)) {
                wl1.add(waterlevel.get(i));
            }
        }
        return wl1;
    }

    public WaterLevel findLastWaterLevel(String bodyWaterName) {
        WaterLevel temp = waterlevel.get(0);
        for (int i = 0; i < waterlevel.size(); i++) {
            if (waterlevel.get(i).getBodyWaterName().equals(bodyWaterName)) {
                if (temp.getTime() < waterlevel.get(i).getTime()) {
                    temp = waterlevel.get(i);
                }}
            }
            return temp;
        }

    public ArrayList<WaterLevel> findForAlarmierung() {
        ArrayList<WaterLevel> wl2 = new ArrayList<WaterLevel>();

        for (int i = 0; i < waterlevel.size(); i++) {
            if(waterlevel.get(i).getMeasurement() <= waterlevel.get(i).getMeasurementForAlarm()) {
                wl2.add(waterlevel.get(i));
            }
        }
    return wl2;}

    public double calcAverageWaterLevel(String bodyWaterName, String place) {
        double average = 0;
        double sum = 0;
        int counter = 0;

        for (int i = 0; i < waterlevel.size(); i++) {
            if(waterlevel.get(i).getBodyWaterName().equals(bodyWaterName) && waterlevel.get(i).getPlace().equals(place)) {
                sum = sum + waterlevel.get(i).getMeasurement();
                counter++;
            }
        }
        average = sum / counter;
    return average;
    }

//    public ArrayList<WaterLevel> findByTime(int von, int bis, String bodyWaterName, String place) {
//
//
//    }


}
