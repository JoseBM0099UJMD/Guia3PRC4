/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc4guia3;

import java.util.Scanner;

/**
 *
 * @author Alejandro Bautista
 */
public class PRC4Guia3Ej4 {
    /*Se realiza la entrada de 10 números enteros. Se desea conocer:
    a. La cantidad de números negativos
    b. La cantidad de números positivos
    c. La cantidad de múltiplos de 15
    d. El valor acumulado de los números ingresados que son pares */
    private Scanner teclado;
    private int Numero;
    private int NumNegativo;
    private int NumPositivo;
    private int Multiplos15;
    private int pares;
    private int resultadoMulti15;
    
    public void Cargar(){
        teclado = new Scanner(System.in);
        
        System.out.println("Digita 10 numeros ");
        for(int i = 1;i<=10;i++){
            
            System.out.print("Digita un numero " + i + " ");
            Numero= teclado.nextInt();
            
            if(Numero<0){
                NumNegativo ++;
            }
            else{
                NumPositivo ++;
            }
            resultadoMulti15 = Numero%15;
            
            if(resultadoMulti15 == 0){
                Multiplos15 ++;
                
            }
            if(Numero%2 == 0)
            {
                pares ++;
            }
        }
    }
    
    public void Imprimir(){
        
        System.out.println("La cantidad de números negativos es: " + NumNegativo + "\n"+
        "La cantidad de números positivos es: " + NumPositivo + "\n" +
        "La cantidad de múltiplos de 15 es: " + Multiplos15 + "\n" +
        "El valor acumulado de los números ingresados que son pares es: " + pares);
        
        
    }
    
    public static void main (String[] args){
        PRC4Guia3Ej4 pv = new PRC4Guia3Ej4();
        
        pv.Cargar();
        pv.Imprimir();
        
        
    }
}
