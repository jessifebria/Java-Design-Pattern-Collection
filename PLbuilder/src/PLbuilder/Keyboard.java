
package PLbuilder;


public abstract class Keyboard implements Hardware{
    public abstract void enter();
    
    @Override
    public Merk merk(){
        return new Logitech();
    }
}
