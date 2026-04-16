import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

class program_37 {
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

    // --- Program Utama ---
    public static void main(String[] args) {
        formatBiodata biodataMahasiswa[] = new formatBiodata[10];
        // N = biodataMahasiswa.length;
        N = 10;
        biodataMahasiswa[0] = new formatBiodata();
        biodataMahasiswa[1] = new formatBiodata();
        biodataMahasiswa[2] = new formatBiodata();
        biodataMahasiswa[3] = new formatBiodata();
        biodataMahasiswa[4] = new formatBiodata();
        biodataMahasiswa[5] = new formatBiodata();
        biodataMahasiswa[6] = new formatBiodata();
        biodataMahasiswa[7] = new formatBiodata();
        biodataMahasiswa[8] = new formatBiodata();
        biodataMahasiswa[9] = new formatBiodata();

        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        // System.out.println("Method tambahDataDiDepan Di Panggil");
        // tambahDataDiDepan(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);

        // System.out.println("Method tambahDataDiTengah Di Panggil");
        // tambahDataDiTengah(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);

        // System.out.println("Method tambahDataDiBelakang Di Panggil");
        // tambahDataDiBelakang(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);

        // System.out.println("Method hapusDataDiDepan Di Panggil");
        // hapusDataDiDepan(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);

        // System.out.println("Method hapusDataDiTengah Di Panggil");
        // hapusDataDiTengah(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);

        // System.out.println("Method hapusDataDiBelakang Di Panggil");
        // hapusDataDiBelakang(biodataMahasiswa);
        // tampilkanData(biodataMahasiswa);

        System.out.println("Method tukarData Di Panggil");
        tukarData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        System.out.println("Method editData Di Panggil");
        editData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}