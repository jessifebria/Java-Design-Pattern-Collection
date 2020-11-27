/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldao;

import java.util.List;

/**
 *
 * @author x.x
 */
public interface BarangDao {
    public List<Barang> getAllBarangs(); 
    public Barang getBarang(int id);
    public void updateBarang(Barang barang); 
    public void deleteBarang(Barang barang);
    public void addBarang(Barang barang);
    public boolean checkIDexist (int id);

   
}
