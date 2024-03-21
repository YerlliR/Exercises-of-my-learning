
import java.io.Serializable;

public class Elem1 implements Serializable{
    private String OBJECT;
    private String CON;
    private String RA;
    private String DEC;
    private String MAG;
    
    public Elem1(String OBJECT, String CON, String RA, String DEC, String MAG) {
        this.OBJECT = OBJECT;
        this.CON = CON;
        this.RA = RA;
        this.DEC = DEC;
        this.MAG = MAG;
    }

    public void printdatos() {
        System.out.println("Object: " + OBJECT + "Con: " + CON + "RA: " + RA + "DEC: " + DEC + "MAG: " + MAG);
    }

    public String getOBJECT() {
        return OBJECT;
    }

    public void setOBJECT(String OBJECT) {
        this.OBJECT = OBJECT;
    }

    public String getCON() {
        return CON;
    }

    public void setCON(String CON) {
        this.CON = CON;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getDEC() {
        return DEC;
    }

    public void setDEC(String DEC) {
        this.DEC = DEC;
    }

    public String getMAG() {
        return MAG;
    }

    public void setMAG(String MAG) {
        this.MAG = MAG;
    }

}
