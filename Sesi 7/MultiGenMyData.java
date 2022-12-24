public class MultiGenMyData {
    public static void main(String[] args) {
        MultiGenData <Integer,String,Double> d1 = new MultiGenData<>();
        MultiGenData <String, String, Double> d2 = new MultiGenData();

        d1.setDataSiswa(2021, "Nazar", 80.5);
        d2.setDataSiswa("20210040109", "Zaini", 70.5);

        int nim_d1 = d1.getNim();
        String nama_d1 = d1.getNama();
        double nilai_d1 = d1.getNilai();

        System.out.println( nim_d1);
        System.out.println(nama_d1);
        System.out.println(nilai_d1);
    }
}

class MultiGenData <N, NA, NI> {
    private N nim;
    private NA nama;
    private NI nilai;

    public void setDataSiswa(N nim, NA nama, NI nilai){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;

    }

    public N getNim(){
        return nim;
    }
    public NA getNama(){
        return nama;

    }
    public NI getNilai(){
        return nilai;
    }

}
