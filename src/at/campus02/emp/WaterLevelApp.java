package at.campus02.emp;

public class WaterLevelApp {

    public static void main(String[] args) {

        WaterLevel wl1 = new WaterLevel(1,"Lake", "Österreich", 534.65, 400.00, 456);
        WaterLevel wl2 = new WaterLevel(2,"Lake", "Burgenland", 58.15, 60.00, 56);
        WaterLevel wl3 = new WaterLevel(3,"Sea", "Kroatien", 3412.54, 3000.00, 15456);
        WaterLevel wl4 = new WaterLevel(4,"River", "Italy", 234.87, 234.87, 250);
        WaterLevel wl5 = new WaterLevel(5,"River", "Brasil", 934.55, 800.00, 456);
        WaterLevel wl6 = new WaterLevel(6,"River", "Brasil", 5934.55, 5000.00, 456);
        WaterLevel wl7 = new WaterLevel(6,"Lake", "Österreich", 1034.55, 5000.00, 1236);
        WaterLevel wl8 = new WaterLevel(6,"Sea", "Kroatien", 5134.55, 5000.00, 5156);
        WaterLevel wl9 = new WaterLevel(6,"River", "Brasil", 2934.55, 5000.00, 1256);

        WaterLevelManager wlm = new WaterLevelManager();

        wlm.addWaterLevel(wl1);
        wlm.addWaterLevel(wl2);
        wlm.addWaterLevel(wl3);
        wlm.addWaterLevel(wl4);
        wlm.addWaterLevel(wl5);
        wlm.addWaterLevel(wl6);

        System.out.println("River: " + wlm.findAllByBodyWater("River"));
        System.out.println("Sea: " + wlm.findAllByBodyWater("Sea"));
        System.out.println();
        System.out.println(wlm.findById(3));
        System.out.println(wlm.findById(5));
        System.out.println();
        System.out.println("Lake, time: " + wlm.findLastWaterLevel("Lake"));
        System.out.println();
        System.out.println("Average depth: " + wlm.calcAverageWaterLevel("River", "Brasil"));

        System.out.println();
        System.out.println("Find by time: " + wlm.findByTime(10000, 20000, "Sea", "Kroatien"));

    }
}
