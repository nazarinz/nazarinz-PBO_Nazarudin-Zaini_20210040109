import java.util.Scanner;

public class Menu extends Connect {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Sistem Pengambilan SKS Mahasiswa");
        System.out.println("--------------------------------");
        System.out.println("1. Tampilkan Data Matakuliah");
        System.out.println("2. Mengambil KRS");
        System.out.println("3. Tampilkan Data Mahasiswa");
        System.out.println("4. Tampilkan Data Transaksi SKS");
        System.out.println("5. Mengundurkan diri");
        System.out.println("6. Logout");
        System.out.println("--------------------------------");
        System.out.print("Pilih Menu : ");
        int input = sc.nextInt();

        ShowData show = new ShowData();
        InsertData insert = new InsertData();
        Login login = new Login();
        DeleteData delete = new DeleteData();
        if (input == 1) {
            show.showMatkul();
        } else if (input == 2) {
            insert.insertData();
        } else if (input == 3) {
            show.showMhs();
        } else if (input == 4) {
            show.showdetail();
        } else if (input == 5) {
            delete.keluar();
        } else if (input == 6) {
            login.regis();
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
