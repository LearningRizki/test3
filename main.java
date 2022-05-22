import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, email;
        System.out.println("Masukan Data User");
        System.out.print("Nama : ");
        nama = in.nextLine();
        System.out.print("Email : ");
        email = in.next();
        
        print(nama, email);
    }

    public static void print(String nama, String email) {
        System.out.println("\n");
        System.out.println("Data User");
        System.out.println("Nama  : " + nama);
        System.out.println("Email : " + email);
    }

    public static void substract(int a, int b) {
        System.out.println("\n");
        System.out.println("Hasil Pengurangan");
        System.out.println("Hasil : " + (a - b));
    }
}