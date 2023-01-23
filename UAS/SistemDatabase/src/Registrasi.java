import java.util.Scanner;

public class Registrasi extends Connect {
    Scanner sc = new Scanner(System.in);
    Login login = new Login();

    public void regis() {

        System.out.println("--------------------------------");
        System.out.println("Sistem Pengambilan SKS Mahasiswa");
        System.out.println("--------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu : ");
        int input = sc.nextInt();

        if (input == 1) {
            login.toLogin();
        } else if (input == 2) {
            InsertData regisMaba = new InsertData();
            regisMaba.registMaba();
            Registrasi menunya = new Registrasi();
            menunya.regis();
        } else if (input == 3) {
            System.exit(0);
        } else {
            System.out.println("Input tidak valid");
        }
    }

}
