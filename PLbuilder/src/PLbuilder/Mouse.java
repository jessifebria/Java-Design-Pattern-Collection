package PLbuilder;

public abstract class Mouse implements Hardware {

    public abstract void klik_kanan();

    public abstract void klik_kiri();

    @Override
    public Merk merk(){
        return new Logitech();
    }

}
