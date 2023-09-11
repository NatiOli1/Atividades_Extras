/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import fundamento.Classes.ViagemClasse;

/**
 *
 * @author rnco0
 */
public class Viagem {
    public static void main(String[] args) {
        
        //1.4) Crie o arquivo Viagem.java para calcular o valor de combustível a ser gasto na viagem, 
        //o programa deverá pedir as informações como entrada de dados: 
        //cidade saída, cidade destino, distância, km/litro, combustível utilizado e valor. 
        //Aplique a lógica necessária para realizar o cálculo e ao final 
        //imprima uma mensagem com as informações pertinentes.
        
        
        ViagemClasse viagemClasse = new ViagemClasse("Piracicaba","São Paulo", 25, 4, "Etanol");
        viagemClasse.CalcularViagem();
        System.out.println(viagemClasse);
   
    }
}
