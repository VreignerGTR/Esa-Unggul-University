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
public class Main {
    Main(){
        System.out.println("kontsruktor Main");
    }
    public static void main(String[] args) {
        Mobil mb = new Mobil(4,"ALPART","ANDI",4);
        Motor mt = new Motor(2,"HONDA","BUDI","PERTAMINA");
        Sepeda sp = new Sepeda(2,"FIXIE","CACA","BESI");
        
        mb.viewMobil();
        mb.view();
        System.out.println("");
        
        mt.viewMotor();
        mt.view();
        System.out.println("");
        
        sp.viewSepeda();
        sp.view();
        System.out.println("");
    }
}
