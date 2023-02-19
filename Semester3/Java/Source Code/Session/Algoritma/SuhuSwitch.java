/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

/**
 *
 * @author vreigner
 */
import java.io.*;
public class SuhuSwitch {
public static void main(String[] args) {
BufferedReader dataKata =new BufferedReader (new InputStreamReader (System.in));
DataInputStream dataAngka = new DataInputStream (System.in);

//Deklarasi variable dan tioe datanya
String kata="",pilihan;
int pilih=0;
double suhuC=0.0, konversi=0.0;

//Bagian utama program
System.out.print("Masukkan suhu dalam Celcius: ");
try{
suhuC = Double.parseDouble(dataAngka.readLine());
}
catch(IOException e) {System.out.println("Terjadi error");}

System.out.println("1.Konversi Celcius ke Fahrenheit");
System.out.println("2.Konversi Celcius ke Reamur");
System.out.println("3.Konversi Celcius ke Kelvin");

System.out.print("Masukkan pilihan Anda: ");
try{
pilih = Integer.parseInt(dataAngka.readLine());
}
catch (IOException e){System.out.println("Terjadi Error");}

//proses konversi suhu
switch (pilih){
case 1:konversi=suhuC*9/5+32;kata="Fahrenheit";break;
case 2:konversi=suhuC*4/5;kata="Reamur";break;
case 3:konversi=suhuC+273;kata="Kelvin";break;
default:konversi=suhuC;kata="Tidak ditemukan";}
    
//cetak konversi suhu
System.out.println("Suhu setelah di konversi: "+konversi+kata);

    }
}
