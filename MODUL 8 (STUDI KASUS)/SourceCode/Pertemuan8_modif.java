import java.util.Scanner;
import java.util.ArrayList;

class Barang {
    String kodeBarang;
    String namaBarang;
    int jumlahBarang;

    public Barang(String kode, String nama, int jumlah) {
        this.kodeBarang = kode;
        this.namaBarang = nama;
        this.jumlahBarang = jumlah;
    }
}

public class Pertemuan8_modif {
    public static Scanner userInput = new Scanner(System.in);
    public static int activeElement = 0;

    public static void methodInputData(ArrayList<Barang> arrayBarang, int jumlahData, String posisiData) {
        int counter = 0;

        if (posisiData.equalsIgnoreCase("depan")) {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("Data Barang ke - " + (counter + 1));
                System.out.print("Silahkan masukkan Kode Barang : ");
                String tempKodeBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Nama Barang : ");
                String tempNamaBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Jumlah Barang : ");
                int tempJumlahBarang = Integer.parseInt(userInput.nextLine());

                arrayBarang.add(0, new Barang(tempKodeBarang, tempNamaBarang, tempJumlahBarang));
                System.out.println();
            }
        }

        if (posisiData.equalsIgnoreCase("tengah")) {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("Data Barang ke - " + (counter + 1));
                System.out.print("Silahkan masukkan Kode Barang : ");
                String tempKodeBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Nama Barang : ");
                String tempNamaBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Jumlah Barang : ");
                int tempJumlahBarang = Integer.parseInt(userInput.nextLine());

                methodViewData(arrayBarang);
                System.out.print("Silahkan masukkan Posisi Barang Ingin Di sisipkan : ");
                int tempPosisiPenyisipan = Integer.parseInt(userInput.nextLine());

                arrayBarang.add(tempPosisiPenyisipan, new Barang(tempKodeBarang, tempNamaBarang, tempJumlahBarang));
                System.out.println();
            }
        }

        if (posisiData.equalsIgnoreCase("belakang"))
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("Data Barang ke - " + (counter + 1));
                System.out.print("Silahkan masukkan Kode Barang : ");
                String tempKodeBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Nama Barang : ");
                String tempNamaBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Jumlah Barang : ");
                int tempJumlahBarang = Integer.parseInt(userInput.nextLine());

                arrayBarang.add(new Barang(tempKodeBarang, tempNamaBarang, tempJumlahBarang));
                System.out.println();
            }
    }

    public static void methodViewData(ArrayList<Barang> arrayBarang) {
        System.out.printf("%-3s %-15s %-25s %-3s\n",
                "No", "KODE BARANG", "NAMA BARANG", "JUMLAH BARANG");

        for (int i = 0; i < arrayBarang.size(); i++) {
            System.out.printf("%-3s %-15s %-25s %-3s\n",
                    i,
                    arrayBarang.get(i).kodeBarang,
                    arrayBarang.get(i).namaBarang,
                    arrayBarang.get(i).jumlahBarang);
        }
    }

    public static void main(String args[]) {
        // FASE 1 - inisiasi dan awal program
        ArrayList<Barang> mainDataBarang = new ArrayList<>();

        System.out.println("Program pengelolahan barang dengan ARRAY OF RECORD sederhana");
        System.out.println();

        boolean menuStatus = true;
        while (menuStatus) {
            System.out.println("Menu");
            System.out.println("1. Input Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Urutkan Nama Barang");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.print("Silahkan masukan pilihan anda : ");
            int pilihan = Integer.parseInt(userInput.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Silahkan masukkan jumlah barang yang ingin di input : ");
                    int jumlahBarang = Integer.parseInt(userInput.nextLine());
                    activeElement = jumlahBarang;

                    System.out.println("");

                    System.out.println("Sub Menu");
                    System.out.println("1. Input Data di posisi Depan");
                    System.out.println("2. Input Data di posisi Tengah");
                    System.out.println("3. Input Data di posisi Belakang");
                    System.out.print("Silahkan masukan pilihan anda : ");
                    int pilihanCase1 = Integer.parseInt(userInput.nextLine());
                    switch (pilihanCase1) {
                        case 1:
                            methodInputData(mainDataBarang, jumlahBarang, "depan");
                            break;

                        case 2:
                            methodInputData(mainDataBarang, jumlahBarang, "tengah");
                            break;

                        case 3:
                            methodInputData(mainDataBarang, jumlahBarang, "belakang");
                            break;

                        default:
                            System.out.println("Pilihan anda tidak valid");
                            break;
                    }

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    methodViewData(mainDataBarang);
                    break;

                case 5:
                    System.out.println("Terimakasih :)");
                    menuStatus = false;
                    break;

                default:
                    System.out.println("Pilihan anda tidak valid, silahkan coba lagi.");
                    System.out.println();
                    break;
            }
        }
    }
}