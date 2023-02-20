package vallalat;


import java.util.Arrays;

public class UtazasiIroda {
    private int szabadBuszokSzama;
    private Autobusz[] autobuszok;

    public UtazasiIroda(int maxBuszSzam){
        this.szabadBuszokSzama = 0;
        this.autobuszok = new Autobusz[maxBuszSzam];
    }
    public boolean buszHozzaAd(Autobusz busz){
        boolean lehetHozzadani = false;

        if(szabadBuszokSzama < autobuszok.length){
            lehetHozzadani = true;
            autobuszok[szabadBuszokSzama++] = busz;
        }
        return lehetHozzadani;
    }
    public Autobusz buszBerel(int tavolsagKm, int utasokSzama){
        int olcsobb = autobuszok.length - 1;
        boolean vissza = false;
        for (int i = 0; i < autobuszok.length; i++) {
            if(autobuszok[i].getHatotav() >= tavolsagKm &&
                autobuszok[i].getFerohely() >= utasokSzama){

                    if(autobuszok[i].getBerlesDij() < autobuszok[olcsobb].getBerlesDij()){
                        olcsobb = i;
                        vissza = true;
                    }else {
                        olcsobb = i;
                        vissza = true;
                    }
            }

        }
        if(vissza){
            return autobuszok[olcsobb];
        }else {
            return new Autobusz();
        }
    }
    public Autobusz buszBerel(int tavolsagKm){
        return buszBerel(tavolsagKm, 0);
    }

    @Override
    public String toString() {
        return "UtazasiIroda{" +
                "SzabadBuszokSzama=" + szabadBuszokSzama +
                ", autobuszok=" + Arrays.toString(autobuszok) +
                '}';
    }
}
