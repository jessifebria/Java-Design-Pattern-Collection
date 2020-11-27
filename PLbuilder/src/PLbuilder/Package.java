/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JESSI
 */
public class Package {
    List<Hardware> listhardware = new ArrayList<Hardware>();
    
    public void additem(Hardware hd){
        listhardware.add(hd);
    }
    
    
    public void showitem(){
        for (Hardware hd : listhardware){
            System.out.println("Jenis : "+ hd.name()+", Merk : "+hd.merk().merkhardware()+", Battery Usage : "+ hd.batteryusage());
        }
    }
    
    public Mouse getmouse(){
        return (Mouse) listhardware.get(0);
    }
    
     public Keyboard getkeyboard(){
        return (Keyboard) listhardware.get(1);
    }
     
      public Printer getprinter(){
        return (Printer) listhardware.get(2);
    }
}
