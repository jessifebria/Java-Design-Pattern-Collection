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
public class MouseFactory extends Komputer {

    @Override
    protected Mouse getmouse(String komputer, String mouse) {
        if (mouse.equalsIgnoreCase("WIRELESS")) {
            return new Wireless(komputer);
        }
        else if (mouse.equalsIgnoreCase("WIRED")){
            return new Wired(komputer);
        }
        else{
            return null;
        }
    }

    @Override
    protected Keyboard getkeyboard(String komputer, String mouse) {
        return null;
    }

    @Override
    protected Printer getprinter(String komputer, String mouse) {
        return null;
    }

    @Override
    protected boolean getIsPowerOn() {
        return false;
    }

    @Override
    protected void setIsPowerOn(boolean isPowerOn) {
    }

    @Override
    protected void hidupkan_os() {
    }

    @Override
    protected void matikan_os() {
    }

    @Override
    protected void domouse(String komputer, String mouse, String action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void dokeyboard(String komputer, String keyboard, String action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doprinter(String komputer, String printer, String action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
