import java.util.Scanner;

public class Tugas1 {
    public static Scanner masukan = new Scanner(System.in);

    public static void main(String[] args) {
        int lagi = 1;

        while (lagi <= 5) {
            String nama;
            String alamat;
            int umur;
            char jekel;
            String hobi[] = new String[3];
            float ipk;

            // Inputan Nama
            System.out.print("Silahkan Masukkan Nama : ");
            nama = masukan.nextLine();

            // Inputan Alamat
            System.out.print("Silahkan Masukkan Alamat : ");
            alamat = masukan.nextLine();

            // Inputan Umur
            System.out.print("Silahkan Masukkan Umur : ");
            umur = masukan.nextInt();
            masukan.nextLine(); // Bersihkan Buffer

            // Inputan JeKel
            System.out.print("Silahkan Masukkan Jenis Kelamin (L / P) : ");
            jekel = masukan.nextLine().charAt(0);
            // masukan.nextLine(); // Bersihkan Buffer

            // Inputan Hobi
            System.out.println("Silahkan Masukkan 3 Hobi : ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Hobi ke-" + (i + 1) + " : ");
                hobi[i] = masukan.nextLine();
            }

            // Inputan IPK
            System.out.print("Silahkan Masukkan IPK : ");
            ipk = masukan.nextFloat();
            masukan.nextLine(); // Bersihkan Buffer
            System.out.println();

            // Tampilkan data
            System.out.println("Data Mahasiswa " + lagi);
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nama alamat adalah " + alamat);
            System.out.println("Umur anda adalah " + umur);
            System.out.println("Jenis Kelamin anda adalah " + jekel);
            System.out.println("Hobi ke-0 anda adalah " + hobi[0]);
            System.out.println("Hobi ke-1 anda adalah " + hobi[1]);
            System.out.println("Hobi ke-2 anda adalah " + hobi[2]);
            System.out.println("IPK anda adalah " + ipk);
            System.out.println("==============================");
            System.out.println();

            lagi++;
        }
    }
}
