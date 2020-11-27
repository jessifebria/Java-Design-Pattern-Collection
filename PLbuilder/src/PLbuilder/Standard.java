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
public class Standard extends Keyboard {

    String komputer;

    public Standard(String komputer) {
        this.komputer = komputer;
    }

    @Override
    public void enter() {
        System.out.println(komputer + " melakukan perintah Enter Keyboard Standard");
    }

    @Override
    public String name() {
        return "Keyboard Standard";
    }

    @Override
    public float batteryusage() {
        return (float) 0.5;
    }
}
