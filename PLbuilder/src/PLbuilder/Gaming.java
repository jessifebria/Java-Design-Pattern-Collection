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
public class Gaming extends Keyboard {

    String komputer;

    public Gaming(String komputer) {
        this.komputer = komputer;
    }

    @Override
    public void enter() {
        System.out.println(komputer + " melakukan perintah Enter Keyboard Gaming");
    }

     @Override
    public String name() {
        return "Keyboard Gaming";
    }

    @Override
    public float batteryusage() {
        return (float) 0.9;
    }

}
