/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author GRSI
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vendas;
        int[] sales = new int [5];
        int[] compras = new int[]{10, 20, 30, 40, 50};

        int x = compras.length - 1;
        while (x >= 0){
            System.out.println(compras[x]);
            x--;
        }
        
        x = compras.length - 1;
        do{
            System.out.println(compras[x]);
        } while(--x >= 0);
        
        
    }
}