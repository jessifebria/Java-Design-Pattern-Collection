package pl_mvc;

import java.util.Scanner;

/**
 *
 * @author JESSI
 */
public class PL_MVC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans = "gas";
        int currid = 1;
        while (!(ans.equalsIgnoreCase("exit"))) {
            MataKuliahController controller2 = new MataKuliahController(getcurrentmatkul(), new View());
            System.out.println("=========================================");
            System.out.println("==============FORM FEEDBACK==============");
            System.out.println("==============KULIAH ONLINE==============");
            controller2.showmatkul();

            System.out.print("Masukkan nama anda : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan feedback positif anda : ");
            String positif = scan.nextLine();
            System.out.print("Masukkan feedback negatif anda : ");
            String negatif = scan.nextLine();
            System.out.println("");

            FormController controller = new FormController(new Form(currid, nama, positif, negatif), new View());

            currid++;
            System.out.println("=========================================");
            System.out.println("==============FEEDBACK ANDA==============");
            System.out.println("========================================");
            controller.showform();
            System.out.println("Ketik exit untuk keluar program, lainnya untuk lanjut ");
            ans = scan.nextLine();
        }
    }

    public static MataKuliah getcurrentmatkul() {
        return new MataKuliah("IN316A", "Pemrograman Lanjut A", "Radius Tanone");
    }

}
