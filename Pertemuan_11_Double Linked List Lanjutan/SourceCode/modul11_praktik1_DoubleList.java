import java.util.Scanner;

class simpul {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kiri;
    simpul kanan;
}

class modul11_praktik1_DoubleList {
    public static simpul awal;
    public static simpul akhir;
    public static Scanner masukan = new Scanner(System.in);

    public static void inisialisasiSenaraiKosong() {
        awal = null;
        akhir = null;
    }

    public static void tambahDepan() {
        String NAMA, ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;

        System.out.println("------------------------------");
        System.out.println("TAMBAH DEPAN : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        UMUR = Integer.parseInt(masukan.nextLine());
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        JEKEL = masukan.nextLine().charAt(0);
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.nextLine();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.nextLine();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.nextLine();
        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        masukan.nextLine();

        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;

        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else {
            baru.kanan = awal;
            awal.kiri = baru;
            awal = baru;
            awal.kiri = null;
        }
    }

    public static void tambahBelakang() {
        String NAMA, ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;

        System.out.println("------------------------------");
        System.out.println("TAMBAH BELAKANG : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        UMUR = Integer.parseInt(masukan.nextLine());
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        JEKEL = masukan.nextLine().charAt(0);
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.nextLine();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.nextLine();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.nextLine();
        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        masukan.nextLine();

        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;

        if (awal == null) // jika senarai kosong
        {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else // jika senarai tidak kosong
        {
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
        }
    }

    public static void cetakSenarai() {
        if (awal == null)
            System.out.print("....MAAF SENARAI KOSONG....");
        else {
            System.out.println(" ");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI 1", "HOBI 2", "HOBI 3", "IPK");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu = awal;
            int no = 1;

            while (bantu != null) {
                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no, bantu.nama, bantu.alamat, bantu.umur, bantu.jekel,
                        bantu.hobi[0], bantu.hobi[1], bantu.hobi[2], bantu.ipk);
                bantu = bantu.kanan;
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.println(" ");
        }
    }

    public static int hitungJumlahSimpul() {
        int N = 0;
        simpul bantu = awal;
        while (bantu != null) {
            N++;
            bantu = bantu.kanan;
        }
        return N;
    }

    public static void tambahTengah() {
        System.out.print("Tentukan Lokasi Penambahan Data: ");
        int LOKASI = masukan.nextInt();
        masukan.nextLine();

        int jumlahSimpulYangAda = hitungJumlahSimpul();

        if (LOKASI == 1) {
            System.out.println("Lakukan penambahan di depan");
        } else if (LOKASI > jumlahSimpulYangAda) {
            System.out.println("Lakukan penambahan di belakang");
        } else {
            String NAMA, ALAMAT;
            int UMUR;
            char JEKEL;
            String HOBI[] = new String[3];
            float IPK;

            System.out.println("TAMBAH TENGAH : ");
            System.out.print("Silakan masukkan nama anda : ");
            NAMA = masukan.nextLine();
            System.out.print("Silakan masukkan alamat anda : ");
            ALAMAT = masukan.nextLine();
            System.out.print("Silakan masukkan umur anda : ");
            UMUR = Integer.parseInt(masukan.nextLine());
            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            JEKEL = masukan.nextLine().charAt(0);
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            HOBI[0] = masukan.nextLine();
            System.out.print("hobi ke-1 : ");
            HOBI[1] = masukan.nextLine();
            System.out.print("hobi ke-2 : ");
            HOBI[2] = masukan.nextLine();
            System.out.print("Silakan masukkan IPK anda : ");
            IPK = masukan.nextFloat();
            masukan.nextLine();

            // Cari simpul di posisi LOKASI-1 (simpul sebelum posisi sisip)
            simpul bantu = awal;
            int i = 1;
            while (i < LOKASI - 1) {
                bantu = bantu.kanan;
                i++;
            }

            simpul baru = new simpul();
            baru.nama = NAMA;
            baru.alamat = ALAMAT;
            baru.umur = UMUR;
            baru.jekel = JEKEL;
            baru.hobi[0] = HOBI[0];
            baru.hobi[1] = HOBI[1];
            baru.hobi[2] = HOBI[2];
            baru.ipk = IPK;

            simpul sesudah = bantu.kanan; // simpul yang akan ada di kanan baru
            baru.kanan = sesudah; // 1. baru → sesudah
            baru.kiri = bantu; // 2. baru ← bantu
            if (sesudah != null) {
                sesudah.kiri = baru; // 3. sesudah ← baru (jika bukan akhir)
            } else {
                akhir = baru; // 3b. jika sisip di akhir, update akhir
            }
            bantu.kanan = baru; // 4. bantu → baru (terakhir!)
        }
    }

    public static void hapus() {
        if (awal == null) // jika senarai masih kosong
        {
            System.out.println("senarai kosong, menghapus tidak dapat dilakukan");
        } else // jika senarai tidak kosong
        {
            System.out.print("Silakan masukkan nama yang ingin dihapus : ");
            String NAMACARI = masukan.nextLine();
            if (awal == akhir) // jika hanya ada sebuah simpul
            {
                if (awal.nama.equals(NAMACARI)) {
                    System.out.println("menghapus " + NAMACARI + " dilakukan..");
                    inisialisasiSenaraiKosong();
                } else
                    System.out.println("data " + NAMACARI + " tidak ditemukan");
            } else if (awal.nama.equals(NAMACARI)) // jika nama ditemukan di awal
            {
                System.out.println("menghapus " + NAMACARI + " dilakukan..");
                awal = awal.kanan;
                awal.kiri = null;
            } else {
                simpul bantu;
                bantu = awal.kanan;
                while (bantu.nama.equals(NAMACARI) == false) {
                    bantu = bantu.kanan;
                    if (bantu.kanan == null)
                        break;
                }
                if ((bantu == akhir) && (akhir.nama.equals(NAMACARI) == false)) {
                    System.out.println("data " + NAMACARI + " tidak ditemukan");
                } else if (akhir.nama.equals(NAMACARI)) // jika nama ditemukan di akhir
                {
                    akhir = bantu.kiri;
                    akhir.kanan = null;
                } else {
                    System.out.println("menghapus " + NAMACARI + " dilakukan..");
                    bantu.kanan.kiri = bantu.kiri;
                    bantu.kiri.kanan = bantu.kanan;
                }
            }
        }
    }

    public static void cetakSenaraiMaju() {
        if (awal == null)
            System.out.print("....MAAF SENARAI KOSONG....");
        else {
            System.out.println(" ");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI 1", "HOBI 2", "HOBI 3", "IPK");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu = awal;
            int no = 1;

            while (bantu != null) {
                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no, bantu.nama, bantu.alamat, bantu.umur, bantu.jekel,
                        bantu.hobi[0], bantu.hobi[1], bantu.hobi[2], bantu.ipk);
                bantu = bantu.kanan; // traversal ke depan
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.println(" ");
        }
    }

    public static void cetakSenaraiMundur() {
        if (awal == null)
            System.out.print("....MAAF SENARAI KOSONG....");
        else {
            System.out.println(" ");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.printf("| %-3s | %-15s | %-20s | %-8s | %-10s | %-15s | %-15s | %-15s | %-8s |%n",
                    "NO", "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI 1", "HOBI 2", "HOBI 3", "IPK");
            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");

            simpul bantu = akhir;
            int no = 1;

            while (bantu != null) {
                System.out.printf("| %-3d | %-15s | %-20s | %-8d | %-10s | %-15s | %-15s | %-15s | %-8.2f |%n",
                        no, bantu.nama, bantu.alamat, bantu.umur, bantu.jekel,
                        bantu.hobi[0], bantu.hobi[1], bantu.hobi[2], bantu.ipk);
                bantu = bantu.kiri; // traversal ke belakang
                no++;
            }

            System.out.println(
                    "+-----+-----------------+----------------------+----------+------------+-----------------+-----------------+-----------------+----------+");
            System.out.println(" ");
        }
    }

    // PROGRAM 11.1. Fungsi Bubblesort untuk single linkedlist dan double linkedlist
    // dengan penukaran isi variabel
    public static void tukarNilai(simpul X, simpul Y) {
        simpul sementara = new simpul();

        sementara.nama = X.nama;
        sementara.alamat = X.alamat;
        sementara.umur = X.umur;
        sementara.jekel = X.jekel;
        sementara.ipk = X.ipk;

        X.nama = Y.nama;
        X.alamat = Y.alamat;
        X.umur = Y.umur;
        X.jekel = Y.jekel;
        X.ipk = Y.ipk;

        Y.nama = sementara.nama;
        Y.alamat = sementara.alamat;
        Y.umur = sementara.umur;
        Y.jekel = sementara.jekel;
        Y.ipk = sementara.ipk;
    }

    // ---------------------------------------------------------
    // bisa untuk single LL dan double LL
    // ---------------------------------------------------------
    public static void mengurutkanDataBubble_TeknikTukarNilai_singleList() {
        int N = hitungJumlahSimpul();
        simpul A = null;
        simpul B = null;
        simpul berhenti = akhir.kanan;

        System.out.println("Banyaknya simpul = " + hitungJumlahSimpul());
        for (int i = 1; i <= hitungJumlahSimpul() - 1; i++) {
            A = awal;
            B = awal.kanan;
            int nomor = 1;
            while (B != berhenti) {
                if (A.nama.compareTo(B.nama) > 0) {
                    // tukarkan elemen dari simpul A dan elemen dari simpul B
                    tukarNilai(A, B);
                }
                A = A.kanan;
                B = B.kanan;
                nomor++;
            }
            berhenti = A;
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
    }

    // Program 11.2. Fungsi Bubblesort untuk single linkedlist dengan penukaran
    // posisi heap
    public static void mengurutkanDataBubble_TeknikTukarHeap_singleList() {
        int N = hitungJumlahSimpul();
        simpul A = null;
        simpul B = null;
        simpul bantu = null;
        simpul berhenti = akhir.kanan;
        int nomor;

        System.out.println("Banyaknya simpul = " + hitungJumlahSimpul());
        for (int i = 1; i <= hitungJumlahSimpul() - 1; i++)
        // for (int i=1; i<= 4; i++)
        {
            A = awal;
            B = awal.kanan;
            nomor = 1;

            // proses banding-tukar, khusus simpul pertama dgn sebelahnya
            if (A.nama.compareTo(B.nama) > 0) {
                A.kanan = B.kanan;
                B.kanan = A;
                awal = B;
            }

            // proses banding-tukar, simpul kedua dgn sebelahnya, dst
            nomor++;
            bantu = awal;
            while (bantu.kanan.kanan != berhenti) {
                A = bantu.kanan;
                B = bantu.kanan.kanan;
                if (A.nama.compareTo(B.nama) > 0) {
                    // tukarkan simpul A dan simpul B
                    A.kanan = B.kanan;
                    B.kanan = A;
                    bantu.kanan = B;
                    if (B == akhir)
                        akhir = A;
                }
                bantu = bantu.kanan;
                nomor++;
            }
            berhenti = bantu.kanan;
            ;
            System.out.println("");
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
    }

    // Program 11.3. Fungsi Bubblesort untuk double linkedlist dengan penukaran
    // posisi heap
    public static void mengurutkanDataBubble_TeknikTukarHeap_doubleList() {
        int N = hitungJumlahSimpul();
        simpul bantu = awal;

        System.out.println("Banyaknya simpul = " + hitungJumlahSimpul());

        for (int i = 1; i <= hitungJumlahSimpul(); i++) {
            // khusus menguji simpul pertama dgn sebelahnya
            if (awal.nama.compareTo(awal.kanan.nama) > 0) {
                bantu = awal.kanan;
                awal.kanan = bantu.kanan;
                bantu.kanan.kiri = awal;
                bantu.kanan = awal;
                bantu.kiri = null;
                awal.kiri = bantu;
                awal = bantu;
            }

            // khusus menguji simpul kedua dgn sebelahnya, simpul ketiga dgn sebelahnya,
            // dst,
            bantu = awal;
            while (bantu.kanan != akhir) {
                simpul A = bantu.kanan;
                simpul B = bantu.kanan.kanan;
                if (A.nama.compareTo(B.nama) > 0) {
                    // tukarkan simpul A dan simpul B
                    A.kanan = B.kanan;
                    if (B != akhir)
                        A.kanan.kiri = A;

                    B.kanan.kiri = A;
                    B.kanan = A;
                    A.kiri = B;

                    bantu.kanan = B;
                    B.kiri = bantu;

                    if (B == akhir)
                        akhir = A;
                }
                bantu = bantu.kanan;
            }
            System.out.println("");
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
    }

    // Program 11.4. Fungsi Linear Search pada single linkedlist
    public static void cariLinear() {
        if (awal == null) // jika senarai masih kosong
            System.out.print("....MAAF SENARAI KOSONG....");
        else // jika senarai tidak kosong
        {
            System.out.print("Silakan masukkan nama yang anda cari : ");
            String NAMACARI = masukan.nextLine();

            boolean statusKetemu = false;
            int i = 0;
            int posisiKetemu = -1;

            simpul bantu;
            bantu = awal;
            while (bantu != null) {
                if (NAMACARI.equals(bantu.nama)) {
                    statusKetemu = true;
                    posisiKetemu = i;
                }
                bantu = bantu.kanan;
                i++;
            }
            System.out.println("Status Ketemu = " + statusKetemu + " di posisi ke " + posisiKetemu);
        }
    }

    public static void main(String[] args) {
        tambahDepan();
        tambahDepan();
        tambahDepan();
        tambahDepan();
        cetakSenarai();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        cetakSenarai();
        tambahTengah();
        cetakSenaraiMaju();
        cetakSenaraiMundur();
        hapus();
        cetakSenaraiMaju();
    }
}