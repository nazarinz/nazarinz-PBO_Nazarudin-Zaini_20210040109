package com.lingkaran;

public class SetengahLingkaran implements Lingkaran{
    
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    @Override
    public void hitungLuas() {
        hasil = (panjang/2 * lebar) * (Math.PI *(panjang/2) * (panjang/2) / 4);
    }
    @Override
    public void tampilkanLuas(){
        System.out.println("Luasnya adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    }
}
