/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import java.util.Arrays;

/**
 *
 * @author iqgonzalez17_ESEI
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();

        System.out.println(m.factorial(4));
        System.out.println(m.cuad(5));
        System.out.println(m.suma(4));
        m.visua(8);
        System.out.println(m.euclides(12, 6));
        System.out.println(m.palindromo("aba"));

        int[] a = new int[]{1,2,3,4,9,15};
        System.out.println(m.sumarValoresArray(a, 5));

        System.out.println(m.invArray(a, 0, 5));
        System.out.println(m.Menor(a, 6, 15));

        System.out.println(m.buscaBinariaRecursiva(a,1,a.length-1,3));
    }
}
