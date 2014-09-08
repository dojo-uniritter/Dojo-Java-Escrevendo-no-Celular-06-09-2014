/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dojojava;

import java.util.Map;

/**
 *
 * @author alu0720017
 */
public class Interpretador {
    
    
    
    private Map<Character, String> pegarDicionario(){
        Map<Character, String> dicionario = new java.util.HashMap<>();
        dicionario.put('A', "2");
        dicionario.put('B', "22");
        dicionario.put('C', "222");
        dicionario.put('D', "3");
        
        return dicionario;
    }
    
    public String interpretar(String mensagem){
        Map<Character, String> dicionario = pegarDicionario();
        
        char novaMensagem[]  = mensagem.toUpperCase().toCharArray();
        String saida = "";  
        char ultimoNumero = '1';
                       
            for(char letra: novaMensagem){
                char novoNumero ='1'; 
                                
                novoNumero += dicionario.get(letra).toCharArray()[0];
                
                if(ultimoNumero==novoNumero){
                    saida +="_";
                }
                
                saida+= dicionario.get(letra);
                
                if (letra=='A'){
                    ultimoNumero = '2';
                } else if(letra=='B'){
                    ultimoNumero = '2';
                } else if(letra=='C'){
                    ultimoNumero = '2';
                } else if(letra=='D'){
                    ultimoNumero = '3';
                } 
            }
        
       
        return saida;
    }
    
    
    
}
