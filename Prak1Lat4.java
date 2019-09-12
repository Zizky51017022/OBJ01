/**
 * @(#)Prak1Lat4.java
 *
 *
 * @author 
 * @version 1.00 2019/9/12
 */

import java.util.Scanner;
public class Prak1Lat4 {

   public static void main (String[] args) {
   	Scanner input = new Scanner(System.in);
   	
   	int nilai1, nilai2, hasil;
   	
   	System.out.print("Masukkan Integer Pertama :");
   	nilai1 = input.nextInt();
   	
   	System.out.print("Masukkan Integer Kedua :");
   	nilai2 = input.nextInt();
   	
   	hasil = nilai1 + nilai2;
   	  System.out.println("Hasil " +nilai1+ "+" +nilai2+ " = " +hasil); 	
   	   }
   }