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

    public void setGang(int gang) throws GangExistiertNichtException {
        if(gang < minGang || gang > maxGang) {
            throw new GangExistiertNichtException("This gear does not exist. Try a different gear.");
        }
            this.gang = gang;
    }

    public int gangErhoehen(int g) throws GangExistiertNichtException, GetriebeSchutzException{
        if(gang + g > maxGang || gang + g < minGang) {
            throw new GangExistiertNichtException("You cannot change into that gear. Please increase into a different gear.");
        }
        if((gang < 0 && gang + g > 0) || (gang > 0 && gang + g < 0)){
            throw new GetriebeSchutzException("You cannot change into that gear. Please set a different gear.");
        }
        return gang += g;
    }

    public int gangErniedrigen(int g) throws GangExistiertNichtException, GetriebeSchutzException{
        if(gang + g > maxGang || gang + g < minGang) {
            throw new GangExistiertNichtException("You cannot change into that gear. Please increase into a different gear.");
        }
        if((gang < 0 && gang - g > 0) || (gang > 0 && gang - g < 0)){
            throw new GetriebeSchutzException("You cannot change into that gear. Please set a different gear.");
        }
        return gang -= g;
    }

}
