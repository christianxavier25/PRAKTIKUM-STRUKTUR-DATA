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

    public static void methodInputData(ArrayList<Barang> arrayBarang, int jumlahData, String posisiData) {
        int counter;

        if (posisiData.equalsIgnoreCase("depan")) {
            if (arrayBarang.size() == 0) {
                System.out.println("Posisi depan hanya bisa digunakan jika sudah ada data, silahkan pilih belakang.");
                System.out.println();
            } else {
                counter = 1;
                for (int i = 0; i < jumlahData; i++) {
                    System.out.println("Data Barang ke - " + (counter));
                    System.out.print("Silahkan masukkan Kode Barang : ");
                    String tempKodeBarang = userInput.nextLine();

                    System.out.print("Silahkan masukkan Nama Barang : ");
                    String tempNamaBarang = userInput.nextLine();

                    System.out.print("Silahkan masukkan Jumlah Barang : ");
                    int tempJumlahBarang = Integer.parseInt(userInput.nextLine());

                    arrayBarang.add(0, new Barang(tempKodeBarang, tempNamaBarang, tempJumlahBarang));
                    System.out.println();
                    counter++;
                }
            }
        } else if (posisiData.equalsIgnoreCase("tengah")) {
            if (arrayBarang.size() == 0) {
                System.out.println("Posisi depan hanya bisa digunakan jika sudah ada data, silahkan pilih belakang.");
                System.out.println();
            } else {
                counter = 1;
                for (int i = 0; i < jumlahData; i++) {
                    System.out.println("Data Barang ke - " + (counter));
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
                    counter++;
                }
            }
        }

        if (posisiData.equalsIgnoreCase("belakang")) {
            counter = 1;
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("=============");
                System.out.println();
                System.out.println("Data Barang ke - " + (counter));
                System.out.print("Silahkan masukkan Kode Barang : ");
                String tempKodeBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Nama Barang : ");
                String tempNamaBarang = userInput.nextLine();

                System.out.print("Silahkan masukkan Jumlah Barang : ");
                int tempJumlahBarang = Integer.parseInt(userInput.nextLine());

                arrayBarang.add(new Barang(tempKodeBarang, tempNamaBarang, tempJumlahBarang));
                counter++;
            }
        }
    }

    public static void methodViewData(ArrayList<Barang> arrayBarang) {

        if (arrayBarang.size() == 0) {
            System.out.printf("%-3s %-15s %-25s %-3s\n",
                    "No", "KODE BARANG", "NAMA BARANG", "JUMLAH BARANG");

            System.out.printf("%-3s %-15s %-25s %-3s\n",
                    "NA",
                    "NA",
                    "NA",
                    "NA");
        } else {
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
    }

    public static void main(String args[]) {
        ArrayList<Barang> mainDataBarang = new ArrayList<>();
        int jumlahBarang;

        System.out.println("Program pengelolahan barang dengan ARRAY OF RECORD sederhana");
        System.out.println("===============================================================================");

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
                    System.out.println("");

                    boolean menuStatusSub1 = true;
                    while (menuStatusSub1) {
                        System.out.println("=========================================");
                        System.out.println();
                        System.out.println("Sub Menu");
                        System.out.println("1. Input Data di posisi Depan");
                        System.out.println("2. Input Data di posisi Tengah");
                        System.out.println("3. Input Data di posisi Belakang");
                        System.out.println("4. Lihat Data");
                        System.out.println("5. Kembali ke menu");
                        System.out.print("Silahkan masukan pilihan anda : ");
                        int pilihanCase1 = Integer.parseInt(userInput.nextLine());
                        switch (pilihanCase1) {
                            case 1:
                                if (mainDataBarang.size() == 0) {
                                    System.out.println(
                                            "Posisi depan hanya bisa digunakan jika sudah ada data, silahkan pilih belakang.");
                                    System.out.println();
                                    break;
                                } else {
                                    System.out.print("Silahkan masukkan jumlah barang yang ingin di input : ");
                                    jumlahBarang = Integer.parseInt(userInput.nextLine());
                                    methodInputData(mainDataBarang, jumlahBarang, "depan");
                                    break;
                                }

                            case 2:
                                if (mainDataBarang.size() == 0) {
                                    System.out.println(
                                            "Posisi depan hanya bisa digunakan jika sudah ada data, silahkan pilih belakang.");
                                    System.out.println();
                                    break;
                                } else {
                                    System.out.print("Silahkan masukkan jumlah barang yang ingin di input : ");
                                    jumlahBarang = Integer.parseInt(userInput.nextLine());
                                    methodInputData(mainDataBarang, jumlahBarang, "tengah");
                                    break;
                                }

                            case 3:
                                System.out.print("Silahkan masukkan jumlah barang yang ingin di input : ");
                                jumlahBarang = Integer.parseInt(userInput.nextLine());
                                methodInputData(mainDataBarang, jumlahBarang, "belakang");
                                break;

                            case 4:
                                methodViewData(mainDataBarang);
                                break;

                            case 5:
                                menuStatusSub1 = false;
                                break;

                            default:
                                System.out.println("Pilihan anda tidak valid");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Silahkan masukkan indeks barang yang ingin di input : ");
                    int indeksBarang = Integer.parseInt(userInput.nextLine());

                    System.out.println("");

                    boolean menuStatusSub2 = true;
                    while (menuStatusSub2) {
                        System.out.println("Sub Menu");
                        System.out.println("1. Hapus Data di posisi Depan");
                        System.out.println("2. Hapus Data di posisi Tengah");
                        System.out.println("3. Hapus Data di posisi Belakang");
                        System.out.println("4. Kembali ke menu");
                        System.out.print("Silahkan masukan pilihan anda : ");
                        int pilihanCase2 = Integer.parseInt(userInput.nextLine());
                        switch (pilihanCase2) {
                            case 1:
                                methodInputData(mainDataBarang, indeksBarang, "depan");
                                break;

                            case 2:
                                methodInputData(mainDataBarang, indeksBarang, "tengah");
                                break;

                            case 3:
                                methodInputData(mainDataBarang, indeksBarang, "belakang");
                                break;

                            case 4:
                                menuStatusSub2 = false;
                                break;

                            default:
                                System.out.println("Pilihan anda tidak valid");
                                break;
                        }
                    }
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