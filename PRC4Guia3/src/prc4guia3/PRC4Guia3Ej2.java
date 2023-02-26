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
public class PRC4Guia3Ej2 {
    
    /*Escribir un programa que pida ingresar coordenadas (x,y) que representen puntos en el
    plano. Informar cuantos puntos se han ingresado en el primer, segundo, tercer y cuarto
    cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de pares de
    puntos a procesar.*/
    
    private Scanner teclado;
    private double x;
    private double y;
    
    public void Calcular(){
        
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la coordenada X ");
        x = teclado.nextDouble();
        System.out.println("Ingrese la cordernada Y ");
        y = teclado.nextDouble();
        
    }
    
    public void main(String [] args){
        
    }
    
}
