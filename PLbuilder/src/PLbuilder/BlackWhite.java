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
public class BlackWhite extends Printer {

    String komputer;

    public BlackWhite(String komputer) {
        this.komputer = komputer;
    }

    @Override
    public void cetak_data() {
        System.out.println(komputer + " melakukan perintah Cetak Data Printer Black White");
    }

     @Override
    public String name() {
        return "Printer Black White";
    }

    @Override
    public float batteryusage() {
        return (float) 1.8;
    }
}
