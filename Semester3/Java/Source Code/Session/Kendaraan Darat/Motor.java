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
public class Motor extends Kendaraan{
    private String bahanbakar;
    
    Motor(int jr, String m, String np, String bk){
        super(jr,m,np);
        bahanbakar = bk;
    }
    public void viewMotor(){
        System.out.println("Bahan Bakar  : "+bahanbakar);
    }
}
