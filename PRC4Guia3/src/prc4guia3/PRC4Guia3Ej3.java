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
public class PRC4Guia3Ej3 {
    /*3. Realizar un programa que lea los datos de “n” triángulos e informar:
    a. De cada uno de ellos, que tipo de triangulo es: equilátero (tres lados iguales),
    isósceles (¿dos lados iguales?, o escaleno (ningún lado igual)
    b. Cantidad de triángulos de cada tipo
    c. Tipo de triangulo que posee menor cantidad */
    private Scanner teclado;
    private float lado1;
    private float lado2;
    private float lado3;
    private int Equilatero;
    private int Isosceles;
    private int Escaleno;
    private int Opcion;
    private String Menor;

    
    
    public void Inicializar()
    {
        teclado = new Scanner(System.in);
        do
        {
            
            
            System.out.println(" Ingresa una opcion \n " + "1 Agregar triangulo \n " + "2 Informe ");
            Opcion = teclado.nextInt();
    
        ///for(int i = 0;i<5;i++){
            if(Opcion==2){
                this.Mostrar();
            }
            else 
            {
                System.out.print("Ingresa el lado A ");
                lado1 = teclado.nextFloat();
            
                System.out.print("Ingresa el lado B ");
                lado2 = teclado.nextFloat();
            
                System.out.print("Ingresa el lado C ");
                lado3 = teclado.nextFloat();

                if(lado1 == lado2)
                {
                                    
                    if(lado1== lado3)
                    {
                        if (lado2==lado3)
                        {
                            Equilatero ++;
                        }
                        else{
                            Isosceles ++;
                        }
                    
                    }
                    else {
                        Isosceles ++;
                    }
                }
                else{
                    Escaleno ++;
                }
                
            }
            
        ///}
    
        }while(Opcion!= 2);
        
        
    }
    
    
    public void Mostrar(){
        
        System.out.println("La cantidad de triangulos equilateros es: " + Equilatero + "\n" +
        "La cantidad de triangulos Isosceles es: " + Isosceles + "\n" +
        "La cantidad de triangulos Escaleno es: " + Escaleno + "\n" +
        "El tipo de triangulo que posee menor cantidad es: " + Menor);
    } 
    
    public void MenorTipo(){
        if((Equilatero>=Isosceles) && (Equilatero>=Escaleno))
        {
            if(Isosceles>=Escaleno)
            {
                Menor=" Escaleno ";
            }
            Menor=" Isosceles ";
        }
        else {
            Menor= " Equilatero ";
        }
    }  
    
    public static void main (String[]args){
        PRC4Guia3Ej3 pv = new PRC4Guia3Ej3();
        
        pv.Inicializar();
        pv.MenorTipo();
        pv.Mostrar();
        

}
}

