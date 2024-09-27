/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int km, meses;
        
        Scanner captu = new Scanner(System.in);
    System.out.println("Kilometraje del auto:");
    km = captu.nextInt();
    captu.nextLine();
    
     System.out.println("Meses del vehiculo:");
    meses = captu.nextInt();
    captu.nextLine();
    
    if(km>= 5000 || meses  >= 6){
        System.out.println("Cambio de aceite");
    } else {
    System.out.println("Vehiculo estable");
    }
    }
}
    

