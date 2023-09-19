/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import fundamento.Classes.SalarioClasse;

/**
 *
 * @author rnco0
 */
public class Salario {
    public static void main(String[] args) {
        
        /**
         * 1.6) Crie o Salario.java para calcular o aumento de um salário, 
         * o programa deverá solicitar as informações de salário e percentual de aumento. 
         * Aplique a lógica necessária para realizar o cálculo e ao final imprima uma 
         * mensagem com as informações pertinentes.
         */
        SalarioClasse salarioClasse = new SalarioClasse(1400, 5);
        salarioClasse.calcularPercentual();
    }
}
