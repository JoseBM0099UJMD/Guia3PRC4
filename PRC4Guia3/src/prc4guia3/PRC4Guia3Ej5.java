/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc4guia3;


/**
 *
 * @author Alejandro Bautista
 */
public class PRC4Guia3Ej5 {
    /*Desarrollar un programa que permita imprimir en pantalla los números del 1 al 30,
    excepto el 25. */
    
    public void Imprimir(){
        
        for(int i =1;i<=30;i++){
            
            if((i<25) || (i>25)){
                
                System.out.println(i) ;
            }
        }
            
            
        ///System.out.print("");
    }
    
    public static void main (String[]args){
        PRC4Guia3Ej5 pv = new PRC4Guia3Ej5();
        
        pv.Imprimir();
        
    }
}
