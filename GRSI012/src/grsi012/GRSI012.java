/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grsi012;

/**
 *
 * @author GRSI
 */
public class GRSI012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] compras = new int[]{10, 20, 30, 40, 50};
        
        int total = 0;
        for (int x = 0; x < compras.length; x++) {
            total = total + compras[x];
        }
        System.out.println(total);
    }
    
}
