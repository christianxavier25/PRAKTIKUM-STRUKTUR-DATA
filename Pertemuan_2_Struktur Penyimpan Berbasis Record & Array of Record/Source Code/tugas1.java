import java.util.Scanner;

class formatBiodata { // bagian deklarasi struktur record ---------------------------------
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class tugas1 {
    public static Scanner masukan = new Scanner(System.in);
    public static int N;

    // --------------------------------------------------
    // --- Fungsi untuk mengentri data ke dalam Larik ---
    // --------------------------------------------------
    public static void ngentriSatuData(formatBiodata biodataMahasiswa[], int N) {
        boolean valid;

        // --- VALIDASI NAMA ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan nama anda : ");
            String inputNama = masukan.next();

            // Cek apakah input hanya berisi huruf (A-Z, a-z)
            if (inputNama.matches("[a-zA-Z]+")) {
                biodataMahasiswa[N].nama = inputNama;
                valid = true;
            } else {
                System.out.println("Input tidak valid! Nama tidak boleh mengandung angka.");
            }
        }

        // --- VALIDASI ALAMAT ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan alamat anda : ");
            String inputAlamat = masukan.next();
            if (inputAlamat.length() > 2) {
                biodataMahasiswa[N].alamat = inputAlamat;
                valid = true;
            } else {
                System.out.println("Alamat terlalu pendek! Masukkan alamat yang jelas.");
            }
        }

        // --- VALIDASI UMUR ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan umur anda : ");
            if (masukan.hasNextInt()) {
                biodataMahasiswa[N].umur = masukan.nextInt();
                valid = true;
            } else {
                System.out.println("Input tidak valid! Masukkan angka untuk umur.");
                masukan.next(); // Membersihkan input yang salah dari buffer
            }
        }

        // --- VALIDASI Jenis Kelamin ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
            String inputJekel = masukan.next().toUpperCase(); // Mengubah input menjadi huruf besar otomatis

            if (inputJekel.equals("L") || inputJekel.equals("P")) {
                biodataMahasiswa[N].jekel = inputJekel.charAt(0); // Mengambil karakter index ke-0 [cite: 2]
                valid = true;
            } else {
                System.out.println("Input Salah! Hanya masukkan huruf 'L' untuk Laki-laki atau 'P' untuk Perempuan.");
            }
        }

        // --- VALIDASI HOBI ---
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        for (int j = 0; j < 3; j++) {
            valid = false;
            while (!valid) {
                System.out.print("hobi ke-" + j + " : ");
                String hobiInput = masukan.next();
                if (hobiInput.matches("[a-zA-Z]+")) {
                    biodataMahasiswa[N].hobi[j] = hobiInput; // Mengisi array hobi [cite: 10]
                    valid = true;
                } else {
                    System.out.println("Hobi harus berupa kata/huruf!");
                }
            }
        }

        // --- VALIDASI IPK ---
        valid = false;
        while (!valid) {
            System.out.print("Silakan masukkan IPK anda (0.0 - 4.0) : ");
            if (masukan.hasNextFloat()) {
                float inputIpk = masukan.nextFloat();
                // Cek rentang nilai IPK
                if (inputIpk >= 0.0 && inputIpk <= 4.0) {
                    biodataMahasiswa[N].ipk = inputIpk;
                    valid = true;
                } else {
                    System.out.println("IPK tidak masuk akal! Gunakan rentang 0.0 sampai 4.0.");
                }
            } else {
                System.out.println("Input harus berupa angka desimal (gunakan titik, misal: 3.5)!");
                masukan.next(); // Buang input yang salah agar tidak infinite loop
            }
        }

    }

    // --------------------------------------------------
    // --- Fungsi untuk menampilkan data ---
    // --------------------------------------------------
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        // bagian menampilkan isi struktur Larik --------------------------
        System.out.println("-----------------------------------------------------------------");
        System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI1\tHOBI2\tHOBI3\tIPK");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-----------------------------------------------------------------");
    }

    // --------------------------------------------------
    // --- Program Utama ---
    // --------------------------------------------------
    public static void main(String[] args) {
        boolean status = true;
        String statusText;
        N = 0; // Mulai dari indeks 0
        formatBiodata biodataMahasiswa[] = new formatBiodata[20];

        do {
            if (N >= 20) { // Cek sebelum membuat objek baru
                System.out.println("Sudah mencapai batas maksimal 20 mahasiswa.");
                break;
            }

            // Siapkan hanya SATU objek baru untuk posisi saat ini
            biodataMahasiswa[N] = new formatBiodata();

            // Panggil fungsi input (modifikasi fungsi ini agar hanya mengisi indeks ke-N)
            ngentriSatuData(biodataMahasiswa, N);

            N++; // Naikkan jumlah record setelah berhasil input

            System.out.print("Input lagi? (Y/N): ");
            statusText = masukan.next();

            if (statusText.equalsIgnoreCase("Y")) {
                status = true;
            } else {
                status = false;
            }
        } while (status);

        tampilkanData(biodataMahasiswa);
    }
}