package at.campus02.emp;

public class WaterLevel {

    private int id;
    private String bodyWaterName;
    private String place;
    private double measurement;
    private double measurementForAlarm;
    private int time;

    public WaterLevel(int id, String bodyWaterName, String place, double measurement, double measurementForAlarm, int time) {
        this.id = id;
        this.bodyWaterName = bodyWaterName;
        this.place = place;
        this.measurement = measurement;
        this.measurementForAlarm = measurementForAlarm;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getBodyWaterName() {
        return bodyWaterName;
    }

    public String getPlace() {
        return place;
    }

    public double getMeasurement() {
        return measurement;
    }

    public double getMeasurementForAlarm() {
        return measurementForAlarm;
    }

    public int getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBodyWaterName(String bodyWaterName) {
        this.bodyWaterName = bodyWaterName;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public void setMeasurementFireAlarm(double measurementForAlarm) {
        this.measurementForAlarm = measurementForAlarm;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WaterLevel{" +
                "id=" + id +
                ", bodyWaterName='" + bodyWaterName + '\'' +
                ", place='" + place + '\'' +
                ", measurement=" + measurement +
                ", measurementFireAlarm=" + measurementForAlarm +
                ", time=" + time +
                '}';
    }
}
