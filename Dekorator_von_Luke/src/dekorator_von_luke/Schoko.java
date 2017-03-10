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
public class Schoko extends ZutatDekorierer{
    public Schoko(Getränk getränk) {
        super("Schoko", getränk);
    }

    @Override
    public String getBeschreibung() {
        return "Schoko";
    }

    @Override
    public double preis() {
        return getGetränk().preis() + 0.20;
    }
}
