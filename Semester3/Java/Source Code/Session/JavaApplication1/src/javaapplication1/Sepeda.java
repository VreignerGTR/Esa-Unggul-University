/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Bryan Johnson
 */
public class Sepeda extends Kendaraan{
    private String bahanpedal;
    
    Sepeda(int jr, String m, String np, String bp){
        super(jr,m,np);
        bahanpedal = bp;
    }
    public void viewSepeda(){
        System.out.println("Bahan Pedal  : "+bahanpedal);
    }
}
