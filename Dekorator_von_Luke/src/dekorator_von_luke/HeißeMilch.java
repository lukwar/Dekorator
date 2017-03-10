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
public class HeißeMilch extends ZutatDekorierer {
    public HeißeMilch(Getränk getränk) {
        super("Heiße Milch", getränk);
    }

    @Override
    public String getBeschreibung() {
        return "Heiße Milch";
    }

    @Override
    public double preis() {
        return getGetränk().preis() + 0.10;
    }
}
