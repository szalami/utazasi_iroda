package vallalat;

public class Autobusz {
    private int ferohely;
    private int hatotav;
    private int berlesDij;

    private static final int MAXHELY =0;

    public Autobusz(int szabadHelyek, int hatotav, int berlesDij) {
        this.ferohely = szabadHelyek;
        this.hatotav = hatotav;
        this.berlesDij = berlesDij;
    }
    public Autobusz() {
        this.ferohely = -1;
        this.hatotav = -1;
        this.berlesDij = -1;
    }
    public boolean utasHozzad(int utasokSzama){
        boolean felfer = false;
        if(this.ferohely >= utasokSzama){
            felfer = true;
            this.ferohely -= utasokSzama;
        }
        return felfer;
    }

    @Override
    public String toString() {
        return "Busz " + ferohely +
                " férőhellyel és " + hatotav +
                "km hatótávolsággal, " + berlesDij +
                " Ft bérlési díjjal.";
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public int getHatotav() {
        return hatotav;
    }

    public void setHatotav(int hatotav) {
        this.hatotav = hatotav;
    }

    public int getBerlesDij() {
        return berlesDij;
    }

    public void setBerlesDij(int berlesDij) {
        this.berlesDij = berlesDij;
    }

}
