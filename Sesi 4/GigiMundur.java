public class GigiMundur extends Mobil{

    public void persneling(){
        super.persneling();
        System.out.println("Masuk gigi mundur");
    }

    public static void main(String[] args) {
        GigiMundur reverse = new GigiMundur();
        reverse.persneling();
    }
}