import java.util.*;

public class main{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String nama,email;
    System.out.println("Masukan Data User");
    System.out.print("Nama : ");
     nama = in.nextLine();
    System.out.print("Email : ");
     email = in.next();
     
    System.out.println("\n");
     System.out.println("Data User");
     System.out.println("Nama  : "+nama);
     System.out.println("Email : "+email);

}
}