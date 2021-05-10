package Uebungsbeispiele07;

public class Getriebe {

    private int gang;
    private int minGang;
    private int maxGang;

    public Getriebe(int minGang, int maxGang) {
        this.minGang = minGang;
        this.maxGang = maxGang;
        gang = 0;
    }

    public int getGang() {
        return gang;
    }

    public int getMinGang() {
        return minGang;
    }

    public int getMaxGang() {
        return maxGang;
    }

    public void setGang(int g) throws GangExistiertNichtException, GetriebeSchutzException {
        if(gang < minGang || gang > maxGang) {
            throw new GangExistiertNichtException("This gear does not exist. Please set a different gear.");
        }
        if((gang < 0 && gang + g > 0) || (gang > 0 && gang + g < 0)){
            throw new GetriebeSchutzException("You cannot change into that gear. Please set a different gear.");
        }
            this.gang = g;
    }

    public int gangErhoehen() throws GangExistiertNichtException{
        if(++gang > maxGang || gang < minGang) {
            throw new GangExistiertNichtException("You cannot increase gears.");
        }
        return gang;
    }

    public int gangErniedrigen() throws GangExistiertNichtException{
        if(--gang > maxGang || gang < minGang) {
            throw new GangExistiertNichtException("You cannot decrease gears.");
        }
        return gang;
    }

}
