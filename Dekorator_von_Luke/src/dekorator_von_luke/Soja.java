/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator_von_luke;

/**
 *
 * @author lukwar
 */
public class Soja extends ZutatDekorierer {
    public Soja(Getränk getränk) {
        super("Soja", getränk);
    }

    @Override
    public String getBeschreibung() {
        return "Soja";
    }

    @Override
    public double preis() {
        return getGetränk().preis() + 0.15;
    }
}
