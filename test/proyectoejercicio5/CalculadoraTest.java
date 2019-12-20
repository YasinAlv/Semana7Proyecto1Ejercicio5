/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ingenieria
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getResultado();
        assertEquals(expResult, result);

    }

    /**
     * Test of setOperador method, of class Calculadora.
     */
    @Test
    public void testSetOperador() {
        System.out.println("setOperador");
        Operador operador = null;
        Calculadora instance = new Calculadora();
        instance.setOperador(operador);
      
    }

    /**
     * Test of getOperador method, of class Calculadora.
     */
    @Test
    public void testGetOperador() {
        System.out.println("getOperador");
        Calculadora instance = new Calculadora();
        String expResult = "SUMA";
        instance.setOperador(Operador.SUMA);
        String result = instance.getOperador();
        assertEquals(expResult, result);

    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Sumar(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Restar(a, b);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Multiplicar(a, b);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int a = 0;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Dividir(a, b);
        assertEquals(expResult, result);
   
    }
    
}
