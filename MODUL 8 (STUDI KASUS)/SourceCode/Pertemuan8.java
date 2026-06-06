import java.util.Scanner;

class Barang {
    String kodeBarang;
    String namaBarang;
    int jumlahBarang;
}

public class Pertemuan8 {
    public static Scanner userInput = new Scanner(System.in);
    public static int N = 0;

    public static void InputData(Barang dataArray[]) {
        int counter = 1;
        for (int i = 0; i <= N - 1; i++) {
            System.out.println("Data ke - " + counter);
            System.out.print("Silakan masukkan Kode Barang : ");
            dataArray[i].kodeBarang = userInput.nextLine();

            System.out.print("Silakan masukkan Nama Barang : ");
            dataArray[i].namaBarang = userInput.nextLine();

            System.out.print("Silakan masukkan Jumlah Barang : ");
            dataArray[i].jumlahBarang = Integer.parseInt(userInput.nextLine());
            System.out.println();
            counter++;
        }
    }

    public static void TampilData(Barang dataArray[]) {
        System.out.printf("%-3s %-15s %-25s %-3s\n",
                "No", "KODE BARANG", "NAMA BARANG", "JUMLAH BARANG");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-3s %-15s %-25s %-3s\n",
                    i,
                    dataArray[i].kodeBarang,
                    dataArray[i].namaBarang,
                    dataArray[i].jumlahBarang);
        }
    }

    public static void mengurutkanDataInsertion(Barang dataArray[]) {
        Barang dataArraySementara = new Barang();
        int awal = 1; // mulai dari elemen ke-1 (sisi kanan yang belum terurut)

        while (awal <= N - 1) {
            dataArraySementara = dataArray[awal]; // ambil elemen saat ini sebagai 'kunci'
            int cari = awal - 1; // mulai cari posisi dari sebelah kirinya

            while (cari >= 0) {
                boolean perluGeser;
                perluGeser = dataArray[cari].namaBarang.compareTo(dataArraySementara.namaBarang) > 0;

                if (perluGeser) {
                    dataArray[cari + 1] = dataArray[cari]; // geser ke kanan
                    dataArray[cari] = dataArraySementara;
                    cari--;
                } else {
                    dataArray[cari + 1] = dataArraySementara;
                    cari = -1; // keluar dari loop while
                }
            }
            awal++;
        }
    }

    public static void mengurutkanDataSelection(Barang dataArray[]) {
        Barang dataArraySementara = new Barang();

        for (int i = 0; i <= N - 2; i++) {
            int lokasiTerkecil = i; // anggap posisi i sebagai minimum saat ini

            for (int S = i + 1; S <= N - 1; S++) {
                if (dataArray[S].namaBarang.compareTo(dataArray[lokasiTerkecil].namaBarang) < 0)
                    lokasiTerkecil = S;
            }

            // Tukar hanya jika ditemukan elemen yang lebih kecil/besar
            if (lokasiTerkecil != i) {
                dataArraySementara = dataArray[i];
                dataArray[i] = dataArray[lokasiTerkecil];
                dataArray[lokasiTerkecil] = dataArraySementara;
            }
        }
    }

    public static void tambahDataDiDepan(Barang dataArray[]) {
        Barang dataArrayBaru = new Barang();

        System.out.print("Silahkan Masukkan kode Barang : ");
        dataArrayBaru.kodeBarang = userInput.nextLine();

        System.out.print("Silahkan Masukkan nama Barang : ");
        dataArrayBaru.namaBarang = userInput.nextLine();

        System.out.print("Silahkan Masukkan jumlah Barang : ");
        dataArrayBaru.jumlahBarang = Integer.parseInt(userInput.nextLine());
        System.out.println();

        // Geser semua data ke kanan (dari belakang ke depan)
        for (int i = N - 1; i >= 0; i--) {
            dataArray[i + 1] = dataArray[i];
        }
        // Masukkan data baru di posisi 0
        dataArray[0] = dataArrayBaru;
        N++;
    }

    public static void tambahDataDiBelakang(Barang dataArray[]) {
        Barang dataArrayBaru = new Barang();
        System.out.print("Silahkan Masukkan kode Barang : ");
        dataArrayBaru.kodeBarang = userInput.nextLine();

        System.out.print("Silahkan Masukkan nama Barang : ");
        dataArrayBaru.namaBarang = userInput.nextLine();

        System.out.print("Silahkan Masukkan jumlah Barang : ");
        dataArrayBaru.jumlahBarang = Integer.parseInt(userInput.nextLine());
        System.out.println();

        dataArray[N] = dataArrayBaru; // langsung taruh di posisi N
        N++;
    }

    public static void main(String args[]) {
        // FASE 1 - inisiasi dan awal program
        Barang mainDataBarang[] = new Barang[100];
        N = 3;

        for (int i = 0; i < N; i++) {
            mainDataBarang[i] = new Barang();
        }
        System.out.println("Program pengelolahan barang dengan ARRAY OF RECORD sederhana");
        System.out.println();
        InputData(mainDataBarang);
        System.out.println("Tampilan Data Sebelum Di urutkan : ");
        TampilData(mainDataBarang);

        mengurutkanDataInsertion(mainDataBarang);
        System.out.println();
        System.out.println("Tampilan Data Setelah Di urutkan berdasarkan nama (mengurutkanDataInsertion) : ");
        TampilData(mainDataBarang);
        System.out.println();

        System.out.println("Method Tambah data di depan di panggil 2 kali : ");
        for (int i = 0; i < 2; i++) {
            tambahDataDiDepan(mainDataBarang);
        }

        System.out.println("Tampilan Data Setelah tambahDataDiDepan + belum di urutkan : ");
        TampilData(mainDataBarang);
        System.out.println();

        System.out.println("Method Tambah data di belakang di panggil 2 kali : ");
        for (int i = 0; i < 2; i++) {
            tambahDataDiBelakang(mainDataBarang);
        }
        System.out.println("Tampilan Data Setelah tambahDataDiBelakang + belum di urutkan : ");
        TampilData(mainDataBarang);

        mengurutkanDataSelection(mainDataBarang);
        System.out.println();
        System.out.println("Tampilan Data Setelah Di urutkan berdasarkan nama (mengurutkanDataSelection) : ");
        TampilData(mainDataBarang);
    }
}