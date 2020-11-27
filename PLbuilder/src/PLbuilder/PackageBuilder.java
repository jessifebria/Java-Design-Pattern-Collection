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
public class PackageBuilder {
    
    public Package preparelowhardware(String komputer){
        Package packageused = new Package();
        packageused.additem(new Wired(komputer));
        packageused.additem(new Standard(komputer));
        packageused.additem(new BlackWhite(komputer));
        return packageused;
    }
    
    public Package preparehighhardware(String komputer){
        Package packageused = new Package();
        packageused.additem(new Wireless(komputer));
        packageused.additem(new Gaming(komputer));
        packageused.additem(new FullColor(komputer));
        return packageused;
    }
    
}
