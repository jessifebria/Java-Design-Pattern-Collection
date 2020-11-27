
package PLabstractfactory;

public abstract class Komputer  {
    protected boolean isPowerOn;
    
    protected abstract Mouse getmouse(String komputer, String mouse);
    protected abstract Keyboard getkeyboard(String komputer, String keyboard);
    protected abstract Printer getprinter(String komputer, String printer);
    
    protected abstract void domouse(String komputer, String mouse, String action);
    protected abstract void dokeyboard(String komputer, String keyboard, String action);
    protected abstract void doprinter(String komputer, String printer, String action);
    
    protected abstract boolean getIsPowerOn();

    protected abstract void setIsPowerOn(boolean isPowerOn);
    
    protected abstract void hidupkan_os();
    
    protected abstract void matikan_os();
}
