import java.util.Scanner;

public class inputViaKeyboardString {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String kalimat;
        System.out.print("Silakan masukkan sebuah kalimat : ");
        kalimat = masukan.nextLine();
        System.out.println("Kalimat yang anda entri adalah : " + kalimat);
        masukan.close();
    }
}
