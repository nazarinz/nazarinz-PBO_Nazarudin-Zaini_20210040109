public class Overloading {

    public int proses(int a, int b){
        return a*b;
    }

    public double proses(double a, double b, double c){
        return a+b+c;
    }
    
    public String proses(String a, String b){
        return a+b;
    } 

    public static void main(String[] args) {
        Overloading objek = new Overloading();

        System.out.println(objek.proses(8, 5));
        System.out.println(objek.proses(8.5, 7.525, 1.5));
        System.out.println(objek.proses("Nazarudin ", "Zaini"));
    }
}
