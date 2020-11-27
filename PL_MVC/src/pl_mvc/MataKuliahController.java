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
public class MataKuliahController {
    private MataKuliah model;
    private View view;

    public MataKuliahController(MataKuliah model, View view) {
        this.model = model;
        this.view = view;
    }

    public void showmatkul(){
        view.showmatkul(model);
    }
    
    
    
}
