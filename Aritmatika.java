/**
 * @(#)Aritmatika.java
 *
 *
 * @author 
 * @version 1.00 2019/9/12
 */


public class Aritmatika {

    public static void main (String[] args) {
    System.out.println("Operasi Aritmetika "+" Pada Tipe Integer");
    int a = 2 + 1;
    int b = a - 1;
    int c = a * b;
    int d = c / 3;
    int e = -a;
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);
    System.out.println("Nilai c: " + c);
    System.out.println("Nilai d: " + d);
    System.out.println("Nilai e: " + e);
    System.out.println();
    
    System.out.println("Operasi Aritmetika "+" Pada Tipe floating-point");
    double fa = 2 + 1;
    double fb = fa - 1;
    double fc = fa * 1;
    double fd = fc / 1;
    double fe = -fa;
    System.out.println("Nilai fa: " + fa);
    System.out.println("Nilai fb: " + fb);
    System.out.println("Nilai fc: " + fc);
    System.out.println("Nilai fd: " + fd);
    System.out.println("Nilai fe: " + fe);
    }
}