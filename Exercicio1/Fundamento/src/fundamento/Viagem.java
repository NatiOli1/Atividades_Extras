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
        ViagemClasse viagemClasse = new ViagemClasse("Piracicaba","São Paulo", 25, 4, "Etanol");
        viagemClasse.CalcularViagem();
        System.out.println(viagemClasse);
   
    }
}
