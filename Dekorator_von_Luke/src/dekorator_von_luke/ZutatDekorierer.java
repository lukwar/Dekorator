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
public abstract class ZutatDekorierer extends Getränk {
    private final Getränk g;

    public ZutatDekorierer(String beschreib, Getränk getränk) {
        super(beschreib);
        g = getränk;
    }
    
    public Getränk getGetränk(){
        return g;
    }
    @Override
    public abstract String getBeschreibung();
}
