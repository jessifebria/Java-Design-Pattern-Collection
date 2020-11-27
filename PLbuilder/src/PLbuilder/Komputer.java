
package PLbuilder;

public abstract class Komputer  {
    protected boolean isPowerOn;

    protected abstract void domouse(String komputer, Mouse mouse, String action);
   protected abstract void dokeyboard(String komputer, Keyboard keyboard, String action);
    protected abstract void doprinter(String komputer, Printer printer, String action);
    
    protected abstract boolean getIsPowerOn();

    protected abstract void setIsPowerOn(boolean isPowerOn);
    
    protected abstract void hidupkan_os();
    
    protected abstract void matikan_os();
}
