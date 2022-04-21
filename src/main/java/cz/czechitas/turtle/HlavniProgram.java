package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
        Turtle zofka;
        Color cervenaBarva;
        Color zlutaBarva;
        Color modraBarva;
        Color cernaBarva;
        Color ruzovaBarva;

    public void main(String[] args) {
        zofka = new Turtle();
        cervenaBarva = new Color(0xE3041E);
        zlutaBarva = new Color(0xDFEE1D);
        modraBarva = new Color(0x090980);
        cernaBarva = new Color(0x18181A);
        ruzovaBarva = new Color(0xEA1E7D);

        /*
        nakresliRovnostrannytrojuhelnik(100.0);
        zofka.setLocation(570.0, 249:0);
        nakresliCtyruhelnik(100.0,50.0);
        zofka.setLocation(770.0, 249.0);
        nakresliCtyruhelnik(100.0, 100.0);
        zofka.setLocation(900.0, 200.0);
        nakresliKolecko(10.0);
        */

        nakresliVlacek();
        nakresliSnehulaka();
        nakresliZmrzlinu();
    }

    private void nakresliZmrzlinu() {
        zofka.setLocation(300.0, 450.0);
        zofka.turnLeft(90.0);
        nakresliRovnostrannytrojuhelnik(200.0, zlutaBarva);
        zofka.setLocation(294.0, 450.0);
        zofka.turnRight(90.0);
        nakresliKolecko(25.0,ruzovaBarva);
    }

    private void nakresliSnehulaka() {
        zofka.setLocation(600.0, 550.0);
        nakresliKolecko(25.0,modraBarva);
        zofka.setLocation(570.0,380.0);
        nakresliKolecko(18.0,modraBarva);
        zofka.setLocation(610.0, 380.0);
        nakresliKolecko(5.0,modraBarva);
        zofka.setLocation(425.0,380.0);
        nakresliKolecko(5.0,modraBarva);
        zofka.setLocation(540.0, 265.0);
        nakresliKolecko(11.0,modraBarva);
    }

    private void nakresliVlacek() {
        zofka.setLocation(1100.0, 550.0);
        nakresliCtyruhelnik(200.0,150.0, cervenaBarva);
        zofka.setLocation(950.0,550.0);
        nakresliCtyruhelnik(100.0, 180.0,cervenaBarva);
        zofka.setLocation(1100.0, 550.0);
        nakresliKolecko(20.0,cernaBarva);
        zofka.setLocation(1100.0, 550.0);
        zofka.setLocation(935.0, 590.0);
        nakresliKolecko(8.0,cernaBarva);
        zofka.setLocation(850, 590);
        nakresliKolecko(8.0,cernaBarva);
        zofka.setLocation(770.0,590.0);
        nakresliRovnostrannytrojuhelnik(120.0, zlutaBarva);
    }

    private void nakresliCtyruhelnik( double delkaStranyA, double delkaStranyB, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2 ; i++) {
            zofka.move(delkaStranyA);
            zofka.turnLeft(90.0);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90.0);
        }
    }

    private void nakresliRovnostrannytrojuhelnik(double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(120.0);
        }
    }

    private void nakresliKolecko(double delkaStrany,Color barvaCary){
        zofka.setPenColor(barvaCary);
        double uhel = (1 - (2.0 / 24)) * 180.0;
        double uhelOtoceni = 180.0 - uhel;
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(uhelOtoceni);
        }
    }
}
