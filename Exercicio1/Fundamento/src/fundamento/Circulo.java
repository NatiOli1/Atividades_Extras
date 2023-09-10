/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import fundamento.Classes.CirculoClasse;

/**
 *
 * @author rnco0
 */
public class Circulo {
    public static void main(String[] args) {
        //1.3) Crie o arquivo Circulo.java com a lógica necessária para calcular a área do círculo, 
        //utilize boas práticas na construção do algoritmo. 
        //Imprima no final uma mensagem com as informações pertinentes.
        
        CirculoClasse circuloClasse = new CirculoClasse(2);
        circuloClasse.CalcularCirculo();
        System.out.println(circuloClasse);
    }
}
