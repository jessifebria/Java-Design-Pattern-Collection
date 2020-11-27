
package PLbuilder;

public abstract class Printer implements Hardware{
    public abstract void cetak_data();
    
    @Override
    public Merk merk(){
        return new Epson();
    }
}
