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
public class Dekorator_von_Luke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DunkleRöstung dR = new DunkleRöstung("Dunkle Röstung");
        System.out.println(dR.getBeschreibung());
    }
    
}
