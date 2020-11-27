package PLbuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final class KomputerCetak {

    private static String jenis;
    private static boolean[] status = {false, false, false};
    private static float[] battery = {100, 100, 100};
    private static PackageBuilder packagebuilder = new PackageBuilder();
    private static Package[] packagelist = {new Package(), new Package(), new Package()};

    private static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Komputer yang anda inginkan");
        System.out.println("1. PersonalComputer");
        System.out.println("2. Notebook");
        System.out.println("3. Netbook");
        System.out.println("4. Keluar Program");
        System.out.print("Masukkan pilihan anda [1/2/3/4] : ");
        int device = scan.nextInt();
        KomputerBuilder producer = new KomputerBuilder();
        if (device == 1) {
            jenis = "PersonalComputer";
            PersonalComputer K1 = (PersonalComputer) producer.getkomputer("PC");
            K1.setIsPowerOn(status[0]);
            menu(K1, jenis, 0);
        } else if (device == 2) {
            jenis = "Notebook";
            Notebook K2 = (Notebook) producer.getkomputer("Notebook");
            K2.setIsPowerOn(status[1]);
            menu(K2, jenis, 1);
        } else if (device == 3) {
            jenis = "Netbook";
            Netbook K3 = (Netbook) producer.getkomputer("Netbook");
            K3.setIsPowerOn(status[2]);
            menu(K3, jenis, 2);

        } else if (device == 4) {
            System.out.println("----------------------------------------------");
            System.out.println("Anda keluar dari program");
            System.out.println("Seluruh komputer akan dimatikan otomatis");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("Menu yang anda pilih tidak ada");
            main();

        }
    }

    private static void menu(Komputer k, String jenis, int indeks) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("Pilih perintah untuk " + jenis + " anda!");
        System.out.println("----------------------------------------------");
        System.out.println("1. Nyalakan " + jenis);
        System.out.println("2. Matikan " + jenis);
        System.out.println("3. Klik Kanan " + jenis);
        System.out.println("4. Klik Kiri" + jenis);
        System.out.println("5. Enter " + jenis);
        System.out.println("6. Cetak Data " + jenis);
        System.out.println("7. Ganti Device ");
        System.out.print("Masukkan pilihan anda : ");
        int perintah = scan.nextInt();

        if (perintah == 1) {
            System.out.println("----------------------------------------------");
            if (status[indeks] == false) {
                System.out.println("Pilih hardware yang ingin anda gunakan : ");
                System.out.println("1. Kualitas Tinggi (Mouse Wireless, Keyboard Gaming, Printer FullColor)");
                System.out.println("2. Kualitas Standard (Mouse Wired, Keyboard Standard, Printer Blackwhite)");
                System.out.print("Masukkan pilihan anda : ");
                int pilihan = scan.nextInt();
                if (pilihan == 1) {
                    packagelist[indeks] = packagebuilder.preparehighhardware(jenis);
                } else if (pilihan == 2) {
                    packagelist[indeks] = packagebuilder.preparelowhardware(jenis);
                } else {
                    System.out.println("Maaf, pilihan tidak ditemukan. Anda gagal menyalakan " + jenis);
                    menu(k, jenis, indeks);
                }
                System.out.println("----------------------------------------------");
                System.out.println("HARDWARE YANG ANDA GUNAKAN pada " + jenis + " anda");
                System.out.println("----------------------------------------------");
                packagelist[indeks].showitem();
            }
            System.out.println("----------------------------------------------");
            k.hidupkan_os();
            System.out.println("----------------------------------------------");
            System.out.println("BATTERY " + jenis + " : " + battery[indeks] + " %");
            status[indeks] = k.getIsPowerOn();
            menu(k, jenis, indeks);
        } else if (perintah == 2) {
            System.out.println("----------------------------------------------");
            k.matikan_os();
            System.out.println("----------------------------------------------");
            System.out.println("BATTERY " + jenis + " : " + battery[indeks] + " %");
            status[indeks] = k.getIsPowerOn();
            menu(k, jenis, indeks);
        } else if (perintah == 3) {
            System.out.println("----------------------------------------------");
            if (status[indeks] == false) {
                System.out.println("Nyalain dulu bro " + jenis + "nya!");
            } else {
                k.domouse(jenis, packagelist[indeks].getmouse(), "KANAN");
                System.out.println("----------------------------------------------");
                battery[indeks] -= packagelist[indeks].getmouse().batteryusage();
                System.out.println("Merk : " + packagelist[indeks].getmouse().merk().merkhardware() + ", Battery usage = " + packagelist[indeks].getmouse().batteryusage());
                System.out.println("BATTERY " + jenis + " : " + battery[indeks] + " %");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 4) {
            System.out.println("----------------------------------------------");
            if (status[indeks] == false) {
                System.out.println("Nyalain dulu bro " + jenis + "nya!");
            } else {
                k.domouse(jenis, packagelist[indeks].getmouse(), "KIRI");
                System.out.println("----------------------------------------------");
                battery[indeks] -= packagelist[indeks].getmouse().batteryusage();
                System.out.println("Merk : " + packagelist[indeks].getmouse().merk().merkhardware() + ", Battery usage = " + packagelist[indeks].getmouse().batteryusage());

                System.out.println("BATTERY " + jenis + " : " + battery[indeks] + " %");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 5) {
            System.out.println("----------------------------------------------");
            if (status[indeks] == false) {
                System.out.println("Nyalain dulu bro " + jenis + "nya!");
            } else {
                k.dokeyboard(jenis, packagelist[indeks].getkeyboard(), "ENTER");
                System.out.println("----------------------------------------------");
                battery[indeks] -= packagelist[indeks].getkeyboard().batteryusage();
                System.out.println("Merk : " + packagelist[indeks].getkeyboard().merk().merkhardware() + ", Battery usage = " + packagelist[indeks].getkeyboard().batteryusage());

                System.out.println("BATTERY " + jenis + " : " + battery[indeks] + " %");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 6) {
            System.out.println("----------------------------------------------");
            if (status[indeks] == false) {
                System.out.println("Nyalain dulu bro " + jenis + "nya!");
            } else {
                k.doprinter(jenis, packagelist[indeks].getprinter(), "CETAKDATA");
                System.out.println("----------------------------------------------");
                battery[indeks] -= packagelist[indeks].getprinter().batteryusage();
                System.out.println("Merk : " + packagelist[indeks].getprinter().merk().merkhardware() + ", Battery usage = " + packagelist[indeks].getprinter().batteryusage());

                System.out.println("BATTERY " + jenis + " : " + battery[indeks] + " %");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 7) {
            System.out.println("----------------------------------------------");
            main();
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("Menu yang anda pilih tidak ada");
            menu(k, jenis, indeks);
        }

    }

    public static void main(String[] args) {
        main();

    }

}
