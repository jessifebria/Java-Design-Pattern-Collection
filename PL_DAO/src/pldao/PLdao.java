/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pldao;

import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author x.x
 */
public class PLdao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BarangDao barangDao = new BarangDaoImpl();

        int ans = 1;

        while (ans != 5) {
            System.out.println("");
            System.out.println("================================");
            System.out.println("==APLIKASI MANAJEMEN STOK TOKO==");
            System.out.println("1. Lihat List Stok Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Update Barang");
            System.out.println("4. Delete Barang");
            System.out.println("5. Keluar Program");
            System.out.print("Pilihan : ");
            ans = in.nextInt();

            System.out.println("");
            if (ans == 1) {
                System.out.println("=========LIST BARANG============");
                for (Barang barang : barangDao.getAllBarangs()) {
                    System.out.println("Barang: [ID : " + barang.getId() + ", Nama : " + barang.getName() + ", Jumlah : " + barang.getJumlah() + " ]");
                }
            } else if (ans == 2) {
                System.out.println("==========TAMBAH=============");
                System.out.print("ID Barang : ");
                int id = in.nextInt();
                if (barangDao.checkIDexist(id)) {
                    System.out.println("Sudah ada ID yang sama! Input barang dengan ID berbeda! Program akan diulang");
                } else {
                    System.out.print("Nama Barang : ");
                    String barang = in.next();
                    in.nextLine();
                    System.out.print("Jumlah : ");
                    int jum = in.nextInt();
                    barangDao.addBarang(new Barang(barang, jum, id));
                    System.out.println(barang + ", Berhasil Ditambah");
                }
            } else if (ans == 3) {
                System.out.println("==========UPDATE STOK=============");
                System.out.print("ID Barang: ");
                int id = in.nextInt();
                if (barangDao.checkIDexist(id) == false) {
                    System.out.println("ID tidak ditemukan! Program akan diulang");
                } else {
                    System.out.print("Jumlah Baru: ");
                    int jumlah = in.nextInt();

                    Barang barang = barangDao.getBarang(id);
                    barang.setJumlah(jumlah);
                    barangDao.updateBarang(barang);

                    barangDao.getBarang(id);
                    System.out.println("Barang: [ID : " + barang.getId() + ", Name : " + barang.getName() + ", jumlah : " + barang.getJumlah() + " ]");
                }
            } else if (ans == 4) {
                System.out.println("==========DELETE=============");
                System.out.print("ID Barang : ");
                int id = in.nextInt();
                if (barangDao.checkIDexist(id) == false) {
                    System.out.println("ID tidak ditemukan! Program akan diulang");
                } else {
                    barangDao.deleteBarang(barangDao.getBarang(id));
                }
            } else if (ans == 5) {
                System.out.println("Keluar dari Program");
            } else {
                System.out.println("Pilihan Tidak Ditemukan");
            }

        }

    }
}
