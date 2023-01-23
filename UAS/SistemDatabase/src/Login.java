import java.util.Scanner;
import java.sql.DriverManager;

public class Login extends Connect {
    Scanner sc = new Scanner(System.in);

    public void toLogin() {
        System.out.println("--------------------------------");
        System.out.println("Silakan Login terlebih dahulu");
        System.out.println("--------------------------------");
        System.out.print("NIM : ");
        int nim = sc.nextInt();
        System.out.print("Nama : ");
        String nama = sc.next();
        System.out.print("Password : ");
        String ypass = sc.next();

        try {
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM tbl_mahasiswa WHERE nim = ? AND nama = ? AND ypass = ? ";
            ps = con.prepareStatement(query);
            ps.setInt(1, nim);
            ps.setString(2, nama);
            ps.setString(3, ypass);
            rs = ps.executeQuery();

            if (rs.next()) {
                Menu menu = new Menu();
                menu.menu();
            } else {
                System.out.println("Data yang kamu masukan salah / Kamu Belum Terdaftar Menjadi Mahasiswa");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
