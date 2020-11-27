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
public class MataKuliah {
    private String id;
    private String nama;
    private String dosen;

    public MataKuliah(String id, String nama, String dosen) {
        this.id = id;
        this.nama = nama;
        this.dosen = dosen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }
    
    
}
