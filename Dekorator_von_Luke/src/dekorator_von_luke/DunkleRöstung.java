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
public class DunkleRöstung extends Getränk {
    
    public DunkleRöstung(String beschreib) {
        super(beschreib);
    }
    
    @Override
    public double preis(){
        return 0.99;
    }
}
