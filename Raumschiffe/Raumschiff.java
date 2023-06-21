import java.util.ArrayList;
package Raumschiffe;

public class Raumschiff{
    int torpedos;
    double energie;
    double schilde;
    double huelle;
    double lifesupport;
    int repdroids;
    String name;
    ArrayList<String> broadkom;
    ArrayList<Ladung> ladeverzeichnis;

    //leerer Konstruktor
    public Raumschiff(){
        torpedos = 0;
        energie = 1.00;
        schilde = 1.00;
        huelle = 1.00;
        lifesupport = 1.00;
        repdroids = 0;
        name = "Standard-Schiff";
        broadkom = new ArrayList<String>;
        ladeverzeichnis = new ArrayList<Ladung>;
    }

    //Konstruktor mit allen Parametern gesetzt
    public Raumschiff(int torpedos, double energie, double schilde, double huelle, double lifesupport, int repdroids, String name, ArrayList<String> broadkom, ArrayList<Ladung> ladeverzeichnis){
        torpedos = torpedos;
        energie = energie;
        schilde = schilde;
        huelle = huelle;
        lifesupport = lifesupport;
        repdroids = repdroids;
        name = name;
        broadkom = broadkom;
        ladeverzeichnis = ladeverzeichnis;
    }

    //getter-Methoden
    public int getTorpedos(){
        return this.torpedos;
    }

    public double getEnergie(){
        return this.energie;
    }

    public double getSchilde(){
        return this.schilde;
    }

    public double getHuelle(){
        return this.huelle;
    }

    public double getLifesupport(){
        return this.lifesupport;
    }

    public int getRepdroids(){
        return this.repdroids;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<String> getBroadkom(){
        return this.broadkom;
    }

    public ArrayList<Ladung> getLadeverzeichnis(){
        return this.ladeverzeichnis;
    }

    //setter-Methoden
    public void setTorpedos(int torpedos){
        this.torpedos = torpedos;
        return;
    }

    public void setEnergie(double energie){
        this.energie = energie;
        return;
    }

    public void setSchilde(double schilde){
        this.schilde = schilde;
        return;
    }

    public void setHuelle(double huelle){
        this.huelle = huelle;
        return;
    }

    public void setLifesupport(double lifesupport){
        this.lifesupport = lifesupport;
        return;
    }

    public void setName(String name){
        this.name = name;
        return;
    }

    public void setBroadkom(ArrayList<String> broadkom){
        this.broadkom = broadkom;
        return;
    }

    public void setLadeverzeichnis(ArrayList<Ladung> ladeverzeichnis){
        this.ladeverzeichnis = ladeverzeichnis;
        return;
    }

    //Methoden
    public torpedoFeuern(Raumschiff ziel){
        if (this.torpedos <= 0) {
            sendMsg("-=*Click*=-");
        }
        else {
            this.torpedos--;
            sendMsg("Photonentorpedo abgeschossen");
            ziel.calcHit();
        }
    }
}