/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SIH;

/**
 *
 * @author Baptiste-PC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MedecinPH med1 = new MedecinPH(8,"lol","Labat","paul","gynéco");
         med1.setServices(Services.medecine);
        System.out.println(med1.getId());
        System.out.println(med1.getServices());
        
        
        
       
        
    }
    
}
