/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldao;

/**
 *
 * @author x.x
 */
public class Barang {

    private String name;
    private int jumlah;
    private int id;

    Barang(int id) {
        this.id = id;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    Barang(String name, int jumlah, int id) {
        this.name = name;
        this.jumlah = jumlah;
        this.id = id;
    }

}
