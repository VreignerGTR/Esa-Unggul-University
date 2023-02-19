/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TOSHIBA
 */
public class Mobil extends Kendaraan{
    private int jumlahpintu;
    
    Mobil(int jr, String m, String np, int jp){
        super(jr,m,np);
        jumlahpintu = jp;
    }
    public void viewMobil(){
        System.out.println("Jumlah Pintu : "+jumlahpintu);
    }
}
