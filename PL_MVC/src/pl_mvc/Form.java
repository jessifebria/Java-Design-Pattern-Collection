/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl_mvc;


/**
 *
 * @author JESSI
 */
public class Form {

    private int id;
    private String nama;
    private String positif;
    private String negatif;
    
    public Form(int id, String nama, String positif, String negatif) {
        this.id = id;
        this.nama = nama;
        this.positif = positif;
        this.negatif = negatif;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPositif() {
        return positif;
    }

    public void setPositif(String positif) {
        this.positif = positif;
    }

    public String getNegatif() {
        return negatif;
    }

    public void setNegatif(String negatif) {
        this.negatif = negatif;
    }

}
