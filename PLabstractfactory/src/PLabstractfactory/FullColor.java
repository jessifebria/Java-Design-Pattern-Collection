/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLabstractfactory;

/**
 *
 * @author JESSI
 */
public class FullColor implements Printer {

    String komputer;

    public FullColor(String komputer) {
        this.komputer = komputer;
    }

    @Override
    public void cetak_data() {
        System.out.println(komputer + " melakukan perintah Cetak Data Printer FullColor");
    }

}
