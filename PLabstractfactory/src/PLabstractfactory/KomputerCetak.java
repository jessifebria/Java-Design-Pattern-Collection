package PLabstractfactory;

import java.util.Scanner;

final class KomputerCetak {

    private static String jenis;
    private static boolean[] status = {false, false, false};

    private static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Komputer yang anda inginkan");
        System.out.println("1. PersonalComputer");
        System.out.println("2. Notebook");
        System.out.println("3. Netbook");
        System.out.println("4. Keluar Program");
        System.out.print("Masukkan pilihan anda [1/2/3/4] : ");
        int device = scan.nextInt();
        KomputerProducer producer = new KomputerProducer();
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
            k.hidupkan_os();
            status[indeks] = k.getIsPowerOn();
            menu(k, jenis, indeks);
        } else if (perintah == 2) {
            System.out.println("----------------------------------------------");
            k.matikan_os();
            status[indeks] = k.getIsPowerOn();
            menu(k, jenis, indeks);
        } else if (perintah == 3) {
            System.out.println("----------------------------------------------");
            System.out.println("Pilih Jenis MOUSE");
            System.out.println("1. Mouse Wireless");
            System.out.println("2. Mouse Wired");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = scan.nextInt();
            System.out.println("----------------------------------------------");
            if (pilih == 1) {
                k.domouse(jenis, "WIRELESS", "KANAN");
            } else if (pilih == 2) {
                k.domouse(jenis, "WIRED", "KANAN");
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 4) {
             System.out.println("----------------------------------------------");
            System.out.println("Pilih Jenis MOUSE");
            System.out.println("1. Mouse Wireless");
            System.out.println("2. Mouse Wired");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = scan.nextInt();
            System.out.println("----------------------------------------------");
            if (pilih == 1) {
                k.domouse(jenis, "WIRELESS", "KIRI");
            } else if (pilih == 2) {
                k.domouse(jenis, "WIRED", "KIRI");
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 5) {
             System.out.println("----------------------------------------------");
            System.out.println("Pilih Jenis KEYBOARD");
            System.out.println("1. Keyboard Gaming");
            System.out.println("2. Keyboard Standard");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = scan.nextInt();
            System.out.println("----------------------------------------------");
            if (pilih == 1) {
                k.dokeyboard(jenis, "GAMING", "ENTER");
            } else if (pilih == 2) {
                k.dokeyboard(jenis, "STANDARD", "ENTER");
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
            menu(k, jenis, indeks);
        } else if (perintah == 6) {
             System.out.println("----------------------------------------------");
            System.out.println("Pilih Jenis PRINTER");
            System.out.println("1. Printer FullColor");
            System.out.println("2. Printer BlackWhite");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = scan.nextInt();
            System.out.println("----------------------------------------------");
            if (pilih == 1) {
                k.doprinter(jenis, "FULLCOLOR", "CETAKDATA");
            } else if (pilih == 2) {
                k.doprinter(jenis, "BLACKWHITE", "CETAKDATA");
            } else {
                System.out.println("Pilihan Tidak Tersedia");
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
