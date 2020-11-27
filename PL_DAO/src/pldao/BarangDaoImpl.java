/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x.x
 */
public class BarangDaoImpl implements BarangDao {

    List<Barang> barangs;

    public BarangDaoImpl() {
        barangs = new ArrayList<Barang>();
        Barang s1 = new Barang("Panci", 1, 0);
        Barang s2 = new Barang("Gelas", 1, 1);

        barangs.add(s1);
        barangs.add(s2);
    }

    @Override
    public List<Barang> getAllBarangs() {
        return barangs;
    }

    @Override
    public Barang getBarang(int id) {
        for (int i = 0; i < barangs.size(); i++) {
            if (barangs.get(i).getId() == id) {
                return barangs.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateBarang(Barang barang) {
        getBarang(barang.getId()).setName(barang.getName());
        System.out.println(barang.getName() + ", telah di update");
    }

    @Override
    public void deleteBarang(Barang barang) {
        barangs.remove(getBarang(barang.getId()));
        System.out.println(barang.getName() + ", telah dihapus");
    }

    @Override
    public void addBarang(Barang barang) {
        barangs.add(barang);
    }

    @Override
    public boolean checkIDexist(int id) {
        for (int i = 0; i < barangs.size(); i++) {
            if (barangs.get(i).getId() == id) {
                return true;
            }
        }

        return false;

    }

}
