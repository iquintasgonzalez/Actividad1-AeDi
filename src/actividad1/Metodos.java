/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

/**
 *
 * @author iqgonzalez17_ESEI
 */
public class Metodos {
    //ejercicio 1

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //ejercicio 2
    public int cuad(int n) {
        if (n == 0) {
            return 0;
        } else {
            return cuad(n - 1) + 2 * n - 1;
        }
    }

    //ejercicio 3
    public int suma(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + suma(n / 10);
        }
    }

    public void visua(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            visua(n / 10);
            System.out.print(n % 10);
        }
    }
    //ejercicio 4

    public int euclides(int n1, int n2) {
        if (n1 == n2) {
            return n1;
        } else if (n1 > n2) {
            return euclides(n1 - n2, n2);
        } else {
            return euclides(n1, n2 - n1);
        }
    }

    //ejercicio 5
    public boolean palindromo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1)) {
            return false;
        } else {
            return palindromo(cadena.substring(1, cadena.length() - 1));
        }
    }
    //ejercicio 6

    public int sumarValoresArray(int[] vector, int fin) {
        if (fin == 0) {
            return vector[fin];
        } else {
            return vector[fin] + sumarValoresArray(vector, fin - 1);
        }
    }

    //ejercicio 7
    public int[] invArray(int[] a, int i, int f) {

        while (i <= f) {

            int temp = a[f];
            a[f] = a[i];
            a[i] = temp;

            return invArray(a, i + 1, f - 1);

        }

        return a;

    }

    //ejercicio8
    public int Menor(int[] array, int n, int menor) {
        if (n == array.length) {
            return menor;
        }

        if (array[n] < menor) {
            menor = array[n];
        }

        return Menor(array, ++n, menor);
    }

    //ejercicio9
    

   

	public  int buscaBinariaRecursiva(int[] a, int menor, int maior,int num) {
		int medio;
                if (menor<=maior) {
                    medio=(menor+maior)/2;
                    if (a[medio]==num) 
                    return medio;
                    
                    else if(a[medio]<num)
                        return buscaBinariaRecursiva(a, medio+1, maior, num);
                    
                    else return buscaBinariaRecursiva(a, menor, medio-1, num);
                    
                }
                else return -1;
                            
                    
            
	}
        
        //ejercicio 10
        
        
}
