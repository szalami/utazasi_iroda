import vallalat.Autobusz;
import vallalat.UtazasiIroda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Add meg az utazási iroda buszainak a számát: ");
        int buszokSzama = Integer.parseInt(br.readLine());
        System.out.print("Add meg az utazó csoport létszámát: ");
        int csoportLetszama = Integer.parseInt(br.readLine());
        System.out.print("Milyen meszzire utaznak(km): ");
        int tavolsag = Integer.parseInt(br.readLine());

        UtazasiIroda utazasiiroda = new UtazasiIroda(buszokSzama);


        Autobusz[] buszok = new Autobusz[buszokSzama];

        for (int i = 0; i < buszokSzama; i++) {
            int szabadHelyek = (int)((Math.random() * (40 - 30)) + 30);
            int hatotav = (int)((Math.random() * (400 - 300)) + 300);
            int berlesDij = (int)((Math.random() * (800 - 300)) + 300);
            buszok[i] = new Autobusz(szabadHelyek, hatotav, berlesDij);
            utazasiiroda.buszHozzaAd(buszok[i]);
            System.out.println(buszok[i]);
        }



        System.out.println();
        System.out.println("A " + csoportLetszama + " fős csoportnak " + tavolsag + " km-re a megfelelő busz:");
        Autobusz tesztBusz = utazasiiroda.buszBerel(tavolsag, csoportLetszama);
        if(tesztBusz.getFerohely() != -1){
            System.out.println(tesztBusz);
            tesztBusz.utasHozzad(csoportLetszama);
            System.out.println("Az utasok felszálltak.");
            System.out.println("A buszon maradt még " + (tesztBusz.getFerohely()) + " hely.");

        }else {
            System.out.println("Nincs megfelelő busz!");
        }

    }

}
