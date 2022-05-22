import java.util.*;

public class main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String nama, email;
            System.out.println("Masukan Data User");
            System.out.print("Nama : ");
            nama = in.nextLine();
            System.out.print("Email : ");
            email = in.next();
            
            print(nama, email);

            // fungsi pertambahan
            System.out.println("\nPertambahan");
            System.out.print("Bilangan pertama: ");
            int a = in.nextInt();
            System.out.print("Bilangan kedua: ");
            int b = in.nextInt();
            System.out.println("Hasil: " + substract(a, b));
        }
    }

    public static void print(String nama, String email) {
        System.out.println("\n");
        System.out.println("Data User");
        System.out.println("Nama  : " + nama);
        System.out.println("Email : " + email);
    }

    public static int substract(int a, int b) {
        System.out.println("\n");
        System.out.println("Hasil Pengurangan");
        return a - b;
    }
}