/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dojojava.Interpretador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alu0720017
 */
public class InterpretadorTest {

    @Test
    public void deveRetornar2QuandoEntradaForA(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("A");
        assertEquals("2", saida);
        
    }
    
    @Test
    public void deveRetornar2QuandoEntradaForAMinusculo(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("a");
        assertEquals("2", saida);
    }
    
    @Test
    public void deveRetornar22QuandoEntradaForB(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("B");
        assertEquals("22", saida);
    }
    @Test
    public void deveRetornar22QuandoEntradaForBMinusculo(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("b");
        assertEquals("22", saida);
    }
    @Test
    public void deveRetornar222QuandoEntradaForC(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("C");
        assertEquals("222", saida);
    }
    @Test
    public void deveRetornar222QuandoEntradaForCMinusculo(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("c");
        assertEquals("222", saida);
    }
    
    @Test
    public void deveRetornar23QuandoForAD(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("AD");
        assertEquals("23", saida);
    }
    
    @Test
    public void deveRetornar232QuandoForADa(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("ADA");
        assertEquals("232", saida);
    }
    
    @Test
    public void deveRetornar2_22QuandoForAB(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("AB");
        assertEquals("2_22", saida);
    }
    
    @Test
    public void deveRetornar2_22_2QuandoForABA(){
        Interpretador interpretador = new Interpretador();
        String saida = interpretador.interpretar("ABA");
        assertEquals("2_22_2", saida);
    }
    
    
    
}
