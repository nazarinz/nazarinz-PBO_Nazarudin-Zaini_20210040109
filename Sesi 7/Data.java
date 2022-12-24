public class Data {
   public static void main(String[] args) {
     Dataku d1 = new Dataku();
     d1.setData("10");
     String nilai = (String)d1.getData();//casting
    System.out.println(d1.getData());

   } 
}

class Dataku {
    private Object data;

    public void setData(Object d){
        data = d;

    }

    public Object getData(){
        return data;

    }
}