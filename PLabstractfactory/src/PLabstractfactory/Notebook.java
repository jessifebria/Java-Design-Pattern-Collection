
package PLabstractfactory;

public class Notebook extends Komputer{
     private boolean isPowerOn;

     @Override
    public boolean getIsPowerOn() {
        return isPowerOn;
    }

    @Override
    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
    
    void Notebook(){
        System.out.println("Haii...! Selamat datang dalam Notebook");
    }
    
    @Override
    protected void hidupkan_os(){
        if (isPowerOn==true){
            System.out.println("Notebooknya emang sudah nyala bro!");
        }else{
        System.out.println("Notebook sedang dinyalakan OS-nya. Mohon sabar menanti :)");
        isPowerOn=true;
        }
    };
    
    @Override
    protected void matikan_os(){
        if (isPowerOn==true){
        System.out.println("Notebook akan dimatikan. Pastikan seluruh data sudah tersimpan.");
        isPowerOn= false;}
        else{
            System.out.println("Notebooknya emang udah mati bro!");
        }
    };

 @Override
    protected Mouse getmouse(String komputer, String mouse) {
        return null;
    }

    @Override
    protected Keyboard getkeyboard(String komputer, String keyboard) {
        return null;
    }

    @Override
    protected Printer getprinter(String komputer, String printer) {
        return null;
    }

    @Override
    protected void domouse(String komputer, String mouse, String action) {
        MouseFactory mousefactory = new MouseFactory();
        if (isPowerOn == false) {
            System.out.println("Nyalain dulu bro Notebooknya!");
        } else {
            if (action.equalsIgnoreCase("KANAN")) {
                mousefactory.getmouse(komputer, mouse).klik_kanan();
            } else if (action.equalsIgnoreCase("KIRI")) {
                mousefactory.getmouse(komputer, mouse).klik_kiri();
            }
        }
    }

    @Override
    protected void dokeyboard(String komputer, String keyboard, String action) {
        KeyboardFactory keyboardfactory = new KeyboardFactory();
        if (isPowerOn == false) {
            System.out.println("Nyalain dulu bro Notebooknya!");
        } else {
            if (action.equalsIgnoreCase("ENTER")) {
                keyboardfactory.getkeyboard(komputer, keyboard).enter();
            }
        }
    }

    @Override
    protected void doprinter(String komputer, String printer, String action) {
        PrinterFactory printerfactory = new PrinterFactory();
        if (isPowerOn == false) {
            System.out.println("Nyalain dulu bro Notebooknya!");
        } else {
            if (action.equalsIgnoreCase("CETAKDATA")) {
                printerfactory.getprinter(komputer, printer).cetak_data();
            }
        }

    }
}
