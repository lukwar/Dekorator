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
public abstract class Getränk {
    private final String beschreibung;
    
    public Getränk(String beschreib){
        beschreibung = beschreib;
    }
    public  String getBeschreibung(){
        return beschreibung;
    }
    public abstract double preis();
}
