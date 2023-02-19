'/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Bryan Johnson
 */
public class Kendaraan {

    protected int jumlahroda;
    protected String merk;
    protected String namapemilik;
    
    Kendaraan(int jr, String m, String np){
        jumlahroda = jr;
        merk = m;
        namapemilik = np;
    }
    public void view(){
        System.out.println("Nama Pemilik : "+namapemilik);
        System.out.println("Merk         : "+merk);
        System.out.println("Jumlah Roda  : "+jumlahroda);
    }

}
