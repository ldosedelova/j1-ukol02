package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
        Turtle zofka;

    public void main(String[] args) {

        zofka = new Turtle();

        nakresliRovnostrannytrojuhelnik(100.0);
        zofka.setLocation(570, 249);
        nakresliCtyruhelnik(100.0,50.0);
        zofka.setLocation(770, 249);
        nakresliCtyruhelnik(100.0, 100.0);
        zofka.setLocation(900, 200);
        nakresliKolecko(10.0);


    }

    private void nakresliCtyruhelnik( double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2 ; i++) {
            zofka.move(delkaStranyA);
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90);
        }
    }

    private void nakresliRovnostrannytrojuhelnik(double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }

    private void nakresliKolecko(double delkaStrany){
        double uhel = (1 - (2.0 / 24)) * 180.0;
        double uhelOtoceni = 180 - uhel;
        for (int i = 0; i < 24; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(uhelOtoceni);
        }
    }

}
