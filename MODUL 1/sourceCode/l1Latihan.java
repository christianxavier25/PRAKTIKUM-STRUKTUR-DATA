import java.util.Scanner;

public class l1Latihan {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        String password = "AKAKOM";
        String user;

        System.out.print("Silahkan masukkan password anda : ");
        user = userInput.nextLine();

        if (user.equals(password)) {
            System.out.print("Password yang anda masukkan BENAR");
        } else {
            System.out.print("Password yang anda masukkan SALAH");
        }
    }

}
