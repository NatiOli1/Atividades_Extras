/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import fundamento.Classes.IMCClasse;
import java.util.Scanner;

/**
 *
 * @author rnco0
 */
public class IMC {
    public static void main(String[] args) {
        /**
         *1.8) Crie o arquivo IMC.java solicitando as informações nome, peso, altura
         * abaixo via Scanner exibindo ao final uma mensagem com as informações pertinentes.
         */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu peso: ");
        Double peso = scanner.nextDouble();
        
        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();
        
        IMCClasse imcClasse = new IMCClasse(nome, peso, altura);
        imcClasse.CalculaIMC();
        
        System.out.println(imcClasse);
    }
}
