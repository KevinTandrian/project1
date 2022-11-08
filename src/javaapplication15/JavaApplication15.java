/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int angka;
    System.out.println("masukkan angka=");
    angka = scan.nextInt();
    
    if (angka==0)
    {
        System.out.println("off");
        
        
    }
    else if (angka==1)
        System.out.println("on");
    
    }
    {
        // TODO code application logic here
    }
    
}
