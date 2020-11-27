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
public class View {

    public void showform(Form form) {
        System.out.println("Form ID : " + form.getId());
        System.out.println("Nama Pengisi : " + form.getNama());
        System.out.println("Feedback Positif : " + form.getPositif());
        System.out.println("Feedback Negatif " + form.getNegatif());
        System.out.println("=========================================");
    }

    
    public void showmatkul(MataKuliah matkul) {
        System.out.println("=========================================");
        System.out.println("Kode MataKuliah : " + matkul.getId());
        System.out.println("Nama MataKuliah : " + matkul.getNama());
        System.out.println("Dosen Pengampu : " + matkul.getDosen());
        System.out.println("=========================================");
    }
}
