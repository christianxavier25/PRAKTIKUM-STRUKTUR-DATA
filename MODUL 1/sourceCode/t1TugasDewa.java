import java.util.Scanner;

public class t1TugasDewa {
    public static Scanner masukan = new Scanner(System.in);

    static class Mahasiswa {
        String nama;
        String alamat;
        int umur;
        char jekel;
        String[] hobi = new String[3];
        float ipk;

        public static Mahasiswa inputDataMahasiswa() {
            // Instansiasi Class Mahasiswa ke objeck mhs
            Mahasiswa mhs = new Mahasiswa();

            // Inputan Nama
            System.out.print("Silahkan Masukkan Nama : ");
            mhs.nama = masukan.nextLine();

            // Inputan Alamat
            System.out.print("Silahkan Masukkan Alamat : ");
            mhs.alamat = masukan.nextLine();

            // Inputan Umur
            System.out.print("Silahkan Masukkan Umur : ");
            mhs.umur = masukan.nextInt();
            masukan.nextLine(); // Bersihkan Buffer

            // Inputan JeKel
            System.out.print("Silahkan Masukkan Jenis Kelamin (L / P) : ");
            mhs.jekel = masukan.nextLine().charAt(0);
            // masukan.nextLine(); // Bersihkan Buffer

            // Inputan Hobi
            System.out.println("Silahkan Masukkan 3 Hobi : ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Hobi ke-" + (i + 1) + " : ");
                mhs.hobi[i] = masukan.nextLine();
            }

            // Inputan IPK
            System.out.print("Silahkan Masukkan IPK : ");
            mhs.ipk = masukan.nextFloat();
            masukan.nextLine(); // Bersihkan Buffer

            return mhs;

        }
    }

    public static void main(String[] args) {
        Mahasiswa[] data = new Mahasiswa[5];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1) + " : ");
            data[i] = Mahasiswa.inputDataMahasiswa();
            System.out.println();
        }

        System.out.println("\n===== DATA MAHASISWA =====");

        System.out.printf("%-15s %-15s %-5s %-5s %-20s %-5s\n",
                "Nama", "Alamat", "Umur", "JK", "Hobi", "IPK");

        for (int i = 0; i < data.length; i++) {

            String hobiGabung = data[i].hobi[0] + ", " +
                    data[i].hobi[1] + ", " +
                    data[i].hobi[2];

            System.out.printf("%-15s %-15s %-5d %-5c %-20s %-5.2f\n",
                    data[i].nama,
                    data[i].alamat,
                    data[i].umur,
                    data[i].jekel,
                    hobiGabung,
                    data[i].ipk);
        }
    }
}
