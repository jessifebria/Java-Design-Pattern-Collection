/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLbuilder;

/**
 *
 * @author JESSI
 */
public class Wireless extends Mouse{
    String komputer;

    public Wireless(String komputer) {
        this.komputer = komputer;
    }
    
    
    @Override
    public void klik_kanan() {
        System.out.println(komputer+" melakukan perintah Klik kanan Mouse Wireless");
    }

    @Override
    public void klik_kiri() {
        System.out.println(komputer + " melakukan perintah Klik kiri Mouse Wireless");   
    }
    
     @Override
    public String name() {
        return "Mouse Wireless";
    }

    @Override
    public float batteryusage() {
        return (float) 0.9;
    }
}
