/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a06p1;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num=1, sum=0;
        Scanner kb = new Scanner (System.in);
        while(num >0){
            try{
                num =SolicitarDatos();
                if (num>0){
                    sum = CalcularSuma(num,sum);
                }
            }
           catch (Exception ex){
               System.out.println("Este no es un número");
               System.out.println("Por favor teclea un número");
               kb.next();
               
           }
        }
        System.out.println("La suma acumulada es " +sum);
    
    }

    static double SolicitarDatos(){
        double num;
        Scanner kb = new Scanner (System.in) ;
        System.out.println("Introduce un numero positivo");
        num = kb.nextDouble();
        return num;
        
    }
    static double CalcularSuma(double num, double sum){
      
        return sum = sum + num;
        
    }
    
    
    }
