package PLbuilder;

public class PersonalComputer extends Komputer {

    private boolean isPowerOn;

    @Override
    public boolean getIsPowerOn() {
        return isPowerOn;
    }

    @Override
    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    void PersonalComputer() {
        System.out.println("Haii...! Selamat datang dalam PersonalComputer");
    }

    @Override
    protected void hidupkan_os() {
        if (isPowerOn == true) {
            System.out.println("PersonalComputer emang sudah nyala bro!");
        } else {
            System.out.println("PersonalComputer sedang dinyalakan OS-nya. Mohon sabar menanti :)");
            isPowerOn = true;
        }
    }

    ;
    
    @Override
    protected void matikan_os() {
        if (isPowerOn == true) {
            System.out.println("PersonalComputer akan dimatikan. Pastikan seluruh data sudah tersimpan.");
            isPowerOn = false;
        } else {
            System.out.println("PersonalComputer emang udah mati bro!");
        }
    }

    @Override
    protected void domouse(String komputer, Mouse mouse, String action) {

        if (action.equalsIgnoreCase("KANAN")) {
            mouse.klik_kanan();
        } else if (action.equalsIgnoreCase("KIRI")) {
            mouse.klik_kiri();
        }

    }

    @Override
    protected void dokeyboard(String komputer, Keyboard keyboard, String action) {

        if (action.equalsIgnoreCase("ENTER")) {
            keyboard.enter();
        }

    }

    @Override
    protected void doprinter(String komputer, Printer printer, String action) {

        if (action.equalsIgnoreCase("CETAKDATA")) {
            printer.cetak_data();
        }

    }
}
