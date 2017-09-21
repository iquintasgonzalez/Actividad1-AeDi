/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iqgonzalez17_ESEI
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of factorial method, of class Metodos.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int n = 4;
        Metodos instance = new Metodos();
        int expResult = 24;
        int result = instance.factorial(n);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of cuad method, of class Metodos.
     */
    @Test
    public void testCuad() {
        System.out.println("cuad");
        int n = 5;
        Metodos instance = new Metodos();
        int expResult = 25;
        int result = instance.cuad(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of suma method, of class Metodos.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int n = 4;
        Metodos instance = new Metodos();
        int expResult = 4;
        int result = instance.suma(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of visua method, of class Metodos.
     */
    @Test
    public void testVisua() {
        System.out.println("visua");
        int n = 8;
        Metodos instance = new Metodos();
        instance.visua(n);
       
    }

    /**
     * Test of euclides method, of class Metodos.
     */
    @Test
    public void testEuclides() {
        System.out.println("euclides");
        int n1 = 12;
        int n2 = 6;
        Metodos instance = new Metodos();
        int expResult = 6;
        int result = instance.euclides(n1, n2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of palindromo method, of class Metodos.
     */
    @Test
    public void testPalindromo() {
        System.out.println("palindromo");
        String cadena = "cba";
        Metodos instance = new Metodos();
        boolean expResult = false;
        boolean result = instance.palindromo(cadena);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarValoresArray method, of class Metodos.
     */
    @Test
    public void testSumarValoresArray() {
        System.out.println("sumarValoresArray");
        int[] vector = {1,2,3,6,4,58,4};
        Metodos instance = new Metodos();
        int expResult = 78;
        int result = instance.sumarValoresArray(vector,6);
        assertEquals(expResult, result);
        
    }
    
}
