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
public class Wired extends Mouse {

    String komputer;

    public Wired(String komputer) {
        this.komputer = komputer;
    }
    
    @Override
    public void klik_kanan() {
        System.out.println(komputer + " melakukan perintah Klik kanan Mouse Wired");
    }

    @Override
    public void klik_kiri() {
        System.out.println(komputer + " melakukan perintah Klik kiri Mouse Wired");
    }
    
     @Override
    public String name() {
        return "Mouse Wired";
    }

    @Override
    public float batteryusage() {
        return (float) 1.1;
    }

}
