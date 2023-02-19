/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

import java.util.Scanner;

/**
 *
 * @author vreigner
 */
public class TugasPraktikum10_Soal2 {
    public static void main(String[] args) {
        String length, breadth;
        double area;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang: ");
        length = scan.nextLine();
        
        System.out.print("Masukkan Lebar: ");
        breadth = scan.nextLine();
        
        try {
            double a = Double.parseDouble(length);
            double b = Double.parseDouble(breadth);
            area = a * b;
            System.out.println("" + area);
        } catch(NumberFormatException nfe) {
            System.out.println(": " + nfe.getMessage());
        }
      }
}