import java.util.ArrayDeque;

public class ArrayDequ {
  public static void main(String[] args) {
    ArrayDeque<String> listBarang = new ArrayDeque<>();

    listBarang.add("Pulpen");
    listBarang.addLast("Meja");
    listBarang.add("Kursi");
    listBarang.addFirst("Sapu");
    listBarang.addFirst("Buku");

    System.out.println(listBarang);
  }
}