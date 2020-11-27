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
public class Standard implements Keyboard {

    String komputer;

    public Standard(String komputer) {
        this.komputer = komputer;
    }

    @Override
    public void enter() {
        System.out.println(komputer + " melakukan perintah Enter Keyboard Standard");
    }

}
