import java.util.Arrays;
import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class masterData_modul5 {
    public static Scanner masukan = new Scanner(System.in);
    public static int N;

    // --- METHOD ngentriData => LARIK (MODUL 2)
    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        int bacaTombol = 0;
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i].nama = masukan.nextLine();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            biodataMahasiswa[i].jekel = (char) bacaTombol;
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("hobi ke-1 : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("hobi ke-2 : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
            masukan.nextLine();
        }
    }

    // --- METHOD tambahDataDiDepan => LARIK
    public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();

        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        for (int i = N - 1; i >= 0; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        biodataMahasiswa[0] = biodataMahasiswaBaru;
        masukan.nextLine();
        N++;
    }

    // --- METHOD tambahDataDiTengah => LARIK
    public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        int T;
        System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
        T = masukan.nextInt();
        for (int i = N - 1; i >= T; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        biodataMahasiswa[T] = biodataMahasiswaBaru;
        masukan.nextLine();
        N++;
    }

    // --- METHOD tambahDataDiBelakang => LARIK
    public static void tambahDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        biodataMahasiswa[N] = biodataMahasiswaBaru;
        masukan.nextLine();
        N++;
    }

    // --- METHOD hapusDataDiDepan => LARIK
    public static void hapusDataDiDepan(formatBiodata biodataMahasiswa[]) {
        for (int i = 0; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-0 selesai.");
        N--;
    }

    // --- METHOD hapusDataDiTengah => LARIK
    public static void hapusDataDiTengah(formatBiodata biodataMahasiswa[]) {
        int T;
        System.out.print("Tuliskan posisi data yang akan dibapus : ");
        T = masukan.nextInt();
        for (int i = T; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-" + T + " selesai.");
        N--;
    }

    // --- METHOD hapusDataDiBelakang => LARIK
    public static void hapusDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        System.out.println("Proses menghapus data paling akhir selesai.");
        N--;
    }

    // --- METHOD untuk Menampilkan Data ---
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println();

        System.out.printf("%-3s %-20s %-15s %-5s %-6s %-10s %-10s %-10s %-5s\n",
                "No", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI[0]", "HOBI[1]", "HOBI[2]", "IPK");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-3d %-20s %-15s %-5d %-6s %-10s %-10s %-10s %-5.2f\n",
                    i,
                    biodataMahasiswa[i].nama,
                    biodataMahasiswa[i].alamat,
                    biodataMahasiswa[i].umur,
                    biodataMahasiswa[i].jekel,
                    biodataMahasiswa[i].hobi[0],
                    biodataMahasiswa[i].hobi[1],
                    biodataMahasiswa[i].hobi[2],
                    biodataMahasiswa[i].ipk);
        }

        System.out.println();
    }

    // --- METHOD tukarData => LARIK
    public static void tukarData(formatBiodata biodataMahasiswa[]) {
        int indeksA, indeksB;

        while (true) {
            System.out.print("Masukkan indeks data pertama yang akan ditukar : ");
            indeksA = masukan.nextInt();

            if (indeksA >= 0 && indeksA < N) {
                break;
            } else {
                System.out.println("Data dengan indeks tersebut tidak ada! Silakan ulangi.");
            }
        }

        while (true) {
            System.out.print("Masukkan indeks data kedua yang akan ditukar : ");
            indeksB = masukan.nextInt();

            if (indeksB >= 0 && indeksB < N) {
                break;
            } else {
                System.out.println("Data dengan indeks tersebut tidak ada! Silakan ulangi.");
            }
        }

        formatBiodata temp = biodataMahasiswa[indeksA];
        biodataMahasiswa[indeksA] = biodataMahasiswa[indeksB];
        biodataMahasiswa[indeksB] = temp;

        System.out.println("Proses penukaran data indeks " + indeksA + " dengan indeks " + indeksB + " selesai.");
    }

    // --- METHOD editData => LARIK
    public static void editData(formatBiodata biodataMahasiswa[]) {
        int indeksEdit;
        int bacaTombol = 0;

        while (true) {
            System.out.print("Masukkan indeks data yang akan diedit : ");
            indeksEdit = masukan.nextInt();

            if (indeksEdit >= 0 && indeksEdit < N) {
                break;
            } else {
                System.out.println("Data dengan indeks tersebut tidak ada! Silakan ulangi.");
            }
        }

        masukan.nextLine();

        System.out.println("Masukkan data baru : ");

        System.out.print("Nama : ");
        biodataMahasiswa[indeksEdit].nama = masukan.nextLine();

        System.out.print("Alamat : ");
        biodataMahasiswa[indeksEdit].alamat = masukan.next();

        System.out.print("Umur : ");
        biodataMahasiswa[indeksEdit].umur = masukan.nextInt();

        System.out.print("Jenis Kelamin (L/P) : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswa[indeksEdit].jekel = (char) bacaTombol;

        System.out.println("Masukkan Hobi : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswa[indeksEdit].hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswa[indeksEdit].hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswa[indeksEdit].hobi[2] = masukan.next();

        System.out.print("IPK : ");
        biodataMahasiswa[indeksEdit].ipk = masukan.nextFloat();

        masukan.nextLine();

        System.out.println("Proses edit data indeks ke-" + indeksEdit + " selesai.");
    }

    // --- METHOD searchingDataLinear (loop WHILE) => LARIK
    public static void cariDataLinearWhile(formatBiodata biodataMahasiswa[]) {
        System.out.print("Silakan masukkan kataKunci data yang anda cari (Nama  Mahasiswa) : ");
        String kataKunci = masukan.next();
        boolean statusKetemu = false;
        int lokasiKetemu = -1;
        int i = 0;
        while ((i <= N - 1) && (statusKetemu == false)) {
            if (kataKunci.equalsIgnoreCase(biodataMahasiswa[i].nama)) {
                statusKetemu = true;
                lokasiKetemu = i;
            }
            i++;
        }

        if (statusKetemu) {
            System.out.println("Data Ditemukan di posisi ke " + lokasiKetemu);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    // --- METHOD searchingDataLinear (loop FOR) => LARIK
    public static void cariDataLinearFor(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;
        System.out.print("Masukkan kata kunci pencarian (Nama  Mahasiswa) : ");
        kataKunci = masukan.next();
        for (int i = 0; i <= N - 1; i++) {
            if (biodataMahasiswa[i].nama.equalsIgnoreCase(kataKunci)) {
                statusKetemu = true;
                lokasi = i;
                break;
            }
        }
        if (statusKetemu) {
            System.out.println("Data Ditemukan di posisi ke " + lokasi);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    // --- METHOD searchingDataBinary => LARIK
    public static void mencariDataBiner(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;
        System.out.print("Masukkan kata kunci pencarian (Nama Mahasiswa) : ");
        kataKunci = masukan.next();
        int atas, bawah, tengah;
        atas = 0;
        bawah = N - 1;
        tengah = (atas + bawah) / 2;
        while (atas <= bawah && !statusKetemu) {
            tengah = (atas + bawah) / 2;

            System.out.println("Data Tengah " + biodataMahasiswa[tengah].nama + " <---> " + kataKunci);

            int hasil = kataKunci.compareToIgnoreCase(biodataMahasiswa[tengah].nama);

            if (hasil < 0) {
                bawah = tengah - 1;
            } else if (hasil > 0) {
                atas = tengah + 1;
            } else {
                statusKetemu = true;
                lokasi = tengah;
            }
        }

        if (statusKetemu) {
            System.out.println("Data yang anda cari ditemukan di posisi ke " + lokasi);
        } else {
            System.out.println("Data yang anda cari tidak ditemukan");
        }
    }

    // --- METHOD cariNamaDanJekel => LARIK
    public static void cariNamaDanJekel(formatBiodata biodataMahasiswa[]) {
        String kataNama;
        char kataJekel;

        System.out.print("Masukkan nama yang dicari : ");
        kataNama = masukan.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P) : ");
        kataJekel = masukan.next().charAt(0);

        boolean ketemu = false;

        System.out.println("\n=== Hasil Pencarian ===");

        for (int i = 0; i <= N - 1; i++) {
            if (biodataMahasiswa[i].nama.equalsIgnoreCase(kataNama)
                    && (biodataMahasiswa[i].jekel == kataJekel
                            || biodataMahasiswa[i].jekel == Character.toUpperCase(kataJekel)
                            || biodataMahasiswa[i].jekel == Character.toLowerCase(kataJekel))) {

                ketemu = true;

                System.out.println("Data ke-" + i);
                System.out.println("Nama   : " + biodataMahasiswa[i].nama);
                System.out.println("Alamat : " + biodataMahasiswa[i].alamat);
                System.out.println("Umur   : " + biodataMahasiswa[i].umur);
                System.out.println("Jekel  : " + biodataMahasiswa[i].jekel);
                System.out.println("Hobi   : "
                        + biodataMahasiswa[i].hobi[0] + ", "
                        + biodataMahasiswa[i].hobi[1] + ", "
                        + biodataMahasiswa[i].hobi[2]);
                System.out.println("IPK    : " + biodataMahasiswa[i].ipk);
                System.out.println("-----------------------------------");
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // --- METHOD hapusDataBerdasarkanNama => LARIK
    public static void hapusDataBerdasarkanNama(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        String confirmHapus;
        int lokasi = -1;
        boolean statusKetemu = false;

        System.out.print("Masukkan nama yang ingin dihapus : ");
        kataKunci = masukan.nextLine();

        // proses searching (menggunakan logika yang sama dengan cariDataLinearFor)
        for (int i = 0; i <= N - 1; i++) {
            if (biodataMahasiswa[i].nama.equalsIgnoreCase(kataKunci)) {
                statusKetemu = true;
                lokasi = i;
                break;
            }
        }

        if (statusKetemu) {
            System.out.println("Data ditemukan di posisi ke " + lokasi);
            System.out.print("Yakin ingin menghapus data ini ? (y/n) : ");
            confirmHapus = masukan.next();
            if (confirmHapus.equalsIgnoreCase("y")) {

                System.out.println("Menghapus data...");

                // --- proses penggeseran data ke kiri
                for (int i = lokasi; i < N - 1; i++) {
                    biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                }

                // kosongkan data terakhir (opsional, agar rapi)
                biodataMahasiswa[N - 1] = new formatBiodata();

                // kurangi jumlah data
                N--;
                System.out.println("Data berhasil dihapus.");
            }
        } else {
            System.out.println("Data tidak ditemukan, tidak ada yang dihapus.");
        }
    }

    // -- METHOD SEMENTARA ISI DATA
    public static void isiData(formatBiodata biodataMahasiswa[]) {

        biodataMahasiswa[0].nama = "Andi";
        biodataMahasiswa[0].alamat = "Yogyakarta";
        biodataMahasiswa[0].umur = 18;
        biodataMahasiswa[0].jekel = 76;
        biodataMahasiswa[0].hobi[0] = "Mancing";
        biodataMahasiswa[0].hobi[1] = "Lari";
        biodataMahasiswa[0].hobi[2] = "Ngoding";
        biodataMahasiswa[0].ipk = 3.8f;

        biodataMahasiswa[1].nama = "Arif";
        biodataMahasiswa[1].alamat = "Bantul";
        biodataMahasiswa[1].umur = 19;
        biodataMahasiswa[1].jekel = 76;
        biodataMahasiswa[1].hobi[0] = "SepakBola";
        biodataMahasiswa[1].hobi[1] = "Ngoding";
        biodataMahasiswa[1].hobi[2] = "Membaca";
        biodataMahasiswa[1].ipk = 3.4f;

        biodataMahasiswa[2].nama = "Bayu";
        biodataMahasiswa[2].alamat = "Yogyakarta";
        biodataMahasiswa[2].umur = 20;
        biodataMahasiswa[2].jekel = 76;
        biodataMahasiswa[2].hobi[0] = "Fotografi";
        biodataMahasiswa[2].hobi[1] = "Editing";
        biodataMahasiswa[2].hobi[2] = "Traveling";
        biodataMahasiswa[2].ipk = 3.7f;

        biodataMahasiswa[3].nama = "Dimas";
        biodataMahasiswa[3].alamat = "Bantul";
        biodataMahasiswa[3].umur = 20;
        biodataMahasiswa[3].jekel = 76;
        biodataMahasiswa[3].hobi[0] = "Gaming";
        biodataMahasiswa[3].hobi[1] = "Sepeda";
        biodataMahasiswa[3].hobi[2] = "Fotografi";
        biodataMahasiswa[3].ipk = 3.2f;

        biodataMahasiswa[4].nama = "Fajar";
        biodataMahasiswa[4].alamat = "KulonProgo";
        biodataMahasiswa[4].umur = 21;
        biodataMahasiswa[4].jekel = 76;
        biodataMahasiswa[4].hobi[0] = "Musik";
        biodataMahasiswa[4].hobi[1] = "Traveling";
        biodataMahasiswa[4].hobi[2] = "Memasak";
        biodataMahasiswa[4].ipk = 3.1f;

        biodataMahasiswa[5].nama = "Hendra";
        biodataMahasiswa[5].alamat = "Gunungkidul";
        biodataMahasiswa[5].umur = 23;
        biodataMahasiswa[5].jekel = 76;
        biodataMahasiswa[5].hobi[0] = "Mancing";
        biodataMahasiswa[5].hobi[1] = "Camping";
        biodataMahasiswa[5].hobi[2] = "Motoran";
        biodataMahasiswa[5].ipk = 3.0f;

        biodataMahasiswa[6].nama = "Ilham";
        biodataMahasiswa[6].alamat = "Bantul";
        biodataMahasiswa[6].umur = 21;
        biodataMahasiswa[6].jekel = 76;
        biodataMahasiswa[6].hobi[0] = "Basket";
        biodataMahasiswa[6].hobi[1] = "Lari";
        biodataMahasiswa[6].hobi[2] = "Fitness";
        biodataMahasiswa[6].ipk = 3.3f;

        biodataMahasiswa[7].nama = "Raka";
        biodataMahasiswa[7].alamat = "Sleman";
        biodataMahasiswa[7].umur = 19;
        biodataMahasiswa[7].jekel = 76;
        biodataMahasiswa[7].hobi[0] = "Futsal";
        biodataMahasiswa[7].hobi[1] = "Ngoding";
        biodataMahasiswa[7].hobi[2] = "Membaca";
        biodataMahasiswa[7].ipk = 3.5f;

        biodataMahasiswa[8].nama = "Rizky";
        biodataMahasiswa[8].alamat = "Sleman";
        biodataMahasiswa[8].umur = 18;
        biodataMahasiswa[8].jekel = 76;
        biodataMahasiswa[8].hobi[0] = "Gaming";
        biodataMahasiswa[8].hobi[1] = "Ngoding";
        biodataMahasiswa[8].hobi[2] = "Desain";
        biodataMahasiswa[8].ipk = 3.9f;

        biodataMahasiswa[9].nama = "Yoga";
        biodataMahasiswa[9].alamat = "Sleman";
        biodataMahasiswa[9].umur = 22;
        biodataMahasiswa[9].jekel = 76;
        biodataMahasiswa[9].hobi[0] = "Basket";
        biodataMahasiswa[9].hobi[1] = "Gym";
        biodataMahasiswa[9].hobi[2] = "NontonFilm";
        biodataMahasiswa[9].ipk = 3.6f;

    }

    // -- METHOD SEMENTARA ISI DATA ACAK
    public static void isiDataAcak(formatBiodata biodataMahasiswa[]) {

        biodataMahasiswa[0].nama = "Zidan";
        biodataMahasiswa[0].alamat = "Yogyakarta";
        biodataMahasiswa[0].umur = 18;
        biodataMahasiswa[0].jekel = 76;
        biodataMahasiswa[0].hobi[0] = "Mancing";
        biodataMahasiswa[0].hobi[1] = "Lari";
        biodataMahasiswa[0].hobi[2] = "Ngoding";
        biodataMahasiswa[0].ipk = 3.8f;

        biodataMahasiswa[1].nama = "Rafi";
        biodataMahasiswa[1].alamat = "Bantul";
        biodataMahasiswa[1].umur = 19;
        biodataMahasiswa[1].jekel = 76;
        biodataMahasiswa[1].hobi[0] = "SepakBola";
        biodataMahasiswa[1].hobi[1] = "Ngoding";
        biodataMahasiswa[1].hobi[2] = "Membaca";
        biodataMahasiswa[1].ipk = 3.4f;

        biodataMahasiswa[2].nama = "Galang";
        biodataMahasiswa[2].alamat = "Yogyakarta";
        biodataMahasiswa[2].umur = 20;
        biodataMahasiswa[2].jekel = 76;
        biodataMahasiswa[2].hobi[0] = "Fotografi";
        biodataMahasiswa[2].hobi[1] = "Editing";
        biodataMahasiswa[2].hobi[2] = "Traveling";
        biodataMahasiswa[2].ipk = 3.7f;

        biodataMahasiswa[3].nama = "Fikri";
        biodataMahasiswa[3].alamat = "Bantul";
        biodataMahasiswa[3].umur = 20;
        biodataMahasiswa[3].jekel = 76;
        biodataMahasiswa[3].hobi[0] = "Gaming";
        biodataMahasiswa[3].hobi[1] = "Sepeda";
        biodataMahasiswa[3].hobi[2] = "Fotografi";
        biodataMahasiswa[3].ipk = 3.2f;

        biodataMahasiswa[4].nama = "Bagas";
        biodataMahasiswa[4].alamat = "KulonProgo";
        biodataMahasiswa[4].umur = 21;
        biodataMahasiswa[4].jekel = 76;
        biodataMahasiswa[4].hobi[0] = "Musik";
        biodataMahasiswa[4].hobi[1] = "Traveling";
        biodataMahasiswa[4].hobi[2] = "Memasak";
        biodataMahasiswa[4].ipk = 3.1f;

        biodataMahasiswa[5].nama = "Yusuf";
        biodataMahasiswa[5].alamat = "Gunungkidul";
        biodataMahasiswa[5].umur = 23;
        biodataMahasiswa[5].jekel = 76;
        biodataMahasiswa[5].hobi[0] = "Mancing";
        biodataMahasiswa[5].hobi[1] = "Camping";
        biodataMahasiswa[5].hobi[2] = "Motoran";
        biodataMahasiswa[5].ipk = 3.0f;

        biodataMahasiswa[6].nama = "Aldo";
        biodataMahasiswa[6].alamat = "Bantul";
        biodataMahasiswa[6].umur = 21;
        biodataMahasiswa[6].jekel = 76;
        biodataMahasiswa[6].hobi[0] = "Basket";
        biodataMahasiswa[6].hobi[1] = "Lari";
        biodataMahasiswa[6].hobi[2] = "Fitness";
        biodataMahasiswa[6].ipk = 3.3f;

        biodataMahasiswa[7].nama = "Kevin";
        biodataMahasiswa[7].alamat = "Sleman";
        biodataMahasiswa[7].umur = 19;
        biodataMahasiswa[7].jekel = 76;
        biodataMahasiswa[7].hobi[0] = "Futsal";
        biodataMahasiswa[7].hobi[1] = "Ngoding";
        biodataMahasiswa[7].hobi[2] = "Membaca";
        biodataMahasiswa[7].ipk = 3.5f;

        biodataMahasiswa[8].nama = "Daffa";
        biodataMahasiswa[8].alamat = "Sleman";
        biodataMahasiswa[8].umur = 18;
        biodataMahasiswa[8].jekel = 76;
        biodataMahasiswa[8].hobi[0] = "Gaming";
        biodataMahasiswa[8].hobi[1] = "Ngoding";
        biodataMahasiswa[8].hobi[2] = "Desain";
        biodataMahasiswa[8].ipk = 3.9f;

        biodataMahasiswa[9].nama = "Naufal";
        biodataMahasiswa[9].alamat = "Sleman";
        biodataMahasiswa[9].umur = 22;
        biodataMahasiswa[9].jekel = 76;
        biodataMahasiswa[9].hobi[0] = "Basket";
        biodataMahasiswa[9].hobi[1] = "Gym";
        biodataMahasiswa[9].hobi[2] = "NontonFilm";
        biodataMahasiswa[9].ipk = 3.6f;

    }

    // --- METHOD untuk Mengurutkan Data (BubbleSort) ---
    public static formatBiodata[] mengurutkanDataBubble(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();
        int indeksTerakhir = N - 1;
        for (int j = 0; j <= indeksTerakhir - 1; j++) {
            for (int i = 0; i <= indeksTerakhir - 1 - j; i++) {
                // perintah dibawah ini identik dengan if (nama[i]>nama[i+1])
                // if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i + 1].nama) < 0) {
                // // jika descending, maka ubah tanda > menjadi < (kurang dari)
                if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i + 1].nama) > 0) {
                    biodataSementara = biodataMahasiswa[i];
                    biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                    biodataMahasiswa[i + 1] = biodataSementara;
                }
            }
        }

        return biodataMahasiswa;
    }

    // --- METHOD untuk Mengurutkan Data (Selection) ---
    public static void mengurutkanDataSelection(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();

        for (int i = 0; i <= N - 2; i++) {
            // 1. Anggap posisi i adalah yang terkecil saat ini
            int lokasiTerkecil = i;

            // 2. Cari di sisa array (dari i+1 sampai akhir) apakah ada yang lebih kecil
            for (int S = i + 1; S <= N - 1; S++) {
                // Bandingkan nama di posisi S dengan nama di posisi lokasiTerkecil
                // if (biodataMahasiswa[S].nama.compareTo(biodataMahasiswa[lokasiTerkecil].nama)
                // < 0) { // jika descending, maka ubah tanda < menjadi > (lebih dari)
                if (biodataMahasiswa[S].nama.compareTo(biodataMahasiswa[lokasiTerkecil].nama) < 0) {
                    lokasiTerkecil = S; // Catat indeks yang punya nama lebih kecil
                }
            }

            // 3. Setelah selesai mencari, tukar data di posisi i dengan data di
            // lokasiTerkecil
            // (Hanya tukar jika ditemukan data yang lebih kecil dari i)
            if (lokasiTerkecil != i) {
                biodataSementara = biodataMahasiswa[i];
                biodataMahasiswa[i] = biodataMahasiswa[lokasiTerkecil];
                biodataMahasiswa[lokasiTerkecil] = biodataSementara;
            }
        }
    }

    // --- METHOD untuk Mengurutkan Data (Insertion) ---
    public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();
        // untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
        int awal;
        // untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
        int cari;
        awal = 1;
        while (awal <= N - 1) {
            biodataSementara = biodataMahasiswa[awal];
            cari = awal - 1;
            // cari akan bergerak dari kanan (awal-1) ke kiri
            while (cari >= 0) {
                // ( biodataMahasiswa[cari].nama > biodataSementara.nama )
                // if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) < 0) { //
                // jika descending, maka ubah
                // tanda > menjadi < (lebih
                // kecil dari)
                if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) > 0) {
                    biodataMahasiswa[cari + 1] = biodataMahasiswa[cari];
                    biodataMahasiswa[cari] = biodataSementara;
                    cari--; // cari digeser kekiri 1 langkah
                } else {
                    biodataMahasiswa[cari + 1] = biodataSementara;
                    // perintah ini untuk keluar dari loop while
                    cari = -1;
                }
            }
            awal++;
        }

    }

    // --- Program Utama ---
    public static void main(String[] args) {
        formatBiodata biodataMahasiswa[] = new formatBiodata[10];
        // N = biodataMahasiswa.length;
        N = 10;

        for (int i = 0; i <= N - 1; i++) {
            biodataMahasiswa[i] = new formatBiodata();
        }

        System.out.println("Tabel data yang belum diurutkan : ");
        // isiData(biodataMahasiswa); // Method helper untuk isi data secara langsung
        isiDataAcak(biodataMahasiswa); // Method helper untuk isi data secara langsung + acak

        // ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        // <================= MODUL 3 =================>
        /*
         * // System.out.println("Method tambahDataDiDepan Di Panggil");
         * // tambahDataDiDepan(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method tambahDataDiTengah Di Panggil");
         * // tambahDataDiTengah(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method tambahDataDiBelakang Di Panggil");
         * // tambahDataDiBelakang(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method hapusDataDiDepan Di Panggil");
         * // hapusDataDiDepan(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method hapusDataDiTengah Di Panggil");
         * // hapusDataDiTengah(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method hapusDataDiBelakang Di Panggil");
         * // hapusDataDiBelakang(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method tukarData Di Panggil");
         * // tukarData(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method editData Di Panggil");
         * // editData(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         */

        // <================= MODUL 4 =================>
        /*
         * // System.out.println("Method cariDataLinear Di Panggil");
         * // cariDataLinearWhile(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method cariDataLinearFor Di Panggil");
         * // cariDataLinearFor(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method mencariDataBiner Di Panggil");
         * // mencariDataBiner(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method cariNamaDanJekel Di Panggil");
         * // cariNamaDanJekel(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         * 
         * // System.out.println("Method hapusDataBerdasarkanNama Di Panggil");
         * // hapusDataBerdasarkanNama(biodataMahasiswa);
         * // tampilkanData(biodataMahasiswa);
         */

        // <================= MODUL 5 =================>
        /* */
        // Praktik 1
        System.out.println("Method mengurutkanDataBubble Di Panggil");
        // formatBiodata dataSortingDouble[] =
        // (mengurutkanDataBubble(biodataMahasiswa));
        formatBiodata dataSortingDouble[] = Arrays.copyOf(biodataMahasiswa, biodataMahasiswa.length);
        mengurutkanDataBubble(dataSortingDouble);
        tampilkanData(dataSortingDouble);

        // Praktik 2
        System.out.println("Method mengurutkanDataSelection Di Panggil");
        // mengurutkanDataSelection(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        // Praktik 3
        // System.out.println("Method mengurutkanDataInsertion Di Panggil");
        // mengurutkanDataInsertion(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);
    }
}
