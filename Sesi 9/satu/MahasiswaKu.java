package satu;

class Mahasiswa<X, Y, Z> {
    private X nim;
    private Y name;
    private Z clas;

    public void setNim(X nim) {
        this.nim = nim;
    }

    public X getNim() {
        return nim;
    }

    public void setName(Y name) {
        this.name = name;
    }

    public Y getName() {
        return name;
    }

    public void setClas(Z clas) {
        this.clas = clas;
    }

    public Z getClas() {
        return clas;
    }

}

public class MahasiswaKu {

    public static void main(String[] args) {

        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}