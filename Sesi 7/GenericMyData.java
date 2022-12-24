public class GenericMyData {
 public static void main(String[] args) {
    GenericData <String> d1 = new GenericData <>();
    GenericData <Integer> d2 = new GenericData <>();
    GenericData <Double> d3 = new GenericData <>();

    d1.setNama("Nazar");
    d2.setNama(19);
    d3.setNama(90.2);

    String nilai_s = d1.getData();
    int nilai_i = d2.getData();
    double nilai_d = d3.getData();


    System.out.println(nilai_s);
    System.out.println(nilai_i);
    System.out.println(nilai_d);

 }
}

class GenericData <T> {
    private T nama;

    public void setNama(T nama){
        this.nama = nama;
    }

    public T getData(){
        return nama;
    }

}
