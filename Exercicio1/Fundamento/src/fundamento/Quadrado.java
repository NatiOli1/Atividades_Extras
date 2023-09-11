/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import fundamento.Classes.QuadradoClasse;

/**
 *
 * @author rnco0
 */
public class Quadrado {
    public static void main(String[] args) {
        
   //1.3) Crie o Quadrado.java com a lógica necessária para calcular a área do quadrado. 
   //Imprima no final uma mensagem com as informações pertinentes.
   
        QuadradoClasse quadradoClasse = new QuadradoClasse(7);
        quadradoClasse.CalcularArea();
        System.out.println(quadradoClasse);
        
    }
}
