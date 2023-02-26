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
public class PRC4Guia3 {

    private Scanner teclado;
    private int numero;
    private int resultado;
    
    public void Cargar(){
        
        teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero ");
        try{
            numero= teclado.nextInt();
        }
        catch (Exception ie){
            
        }
        
    }
    
    public void TablaDeMultiplicar(){
        
        for(int i =1;i<=10;i++){
            
            try{
            resultado = numero * i;
            
            System.out.println(numero+ " x " + i + " = "+ resultado );
        }
        catch (Exception ie){
            
        }
             
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PRC4Guia3 pv = new PRC4Guia3();
        
        pv.Cargar();
        pv.TablaDeMultiplicar();
        
    }
    
}
