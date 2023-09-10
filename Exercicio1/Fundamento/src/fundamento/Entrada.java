/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import java.util.Scanner;

/**
 *
 * @author rnco0
 */
public class Entrada {
    public static void main(String[] args) {
        //1.1) Crie o arquivo Entrada.java com as informações de 
        //nome, sobrenome, idade, endereço, cidade, estado. 
        //Imprima as informações ao final.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        String endereco2 = scanner.nextLine();
        
        System.out.println("Digite sua cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.println("Digite seu estado: ");
        String estado = scanner.nextLine();
        
        System.out.println("--- Suas Informações ---\n Nome: " + nome + "\n Sobrenome: " + sobrenome + ""
                + "\n Idade: " + idade + "\n Endereço: " + endereco2 + "\n Cidade: " + cidade + ""
                        + "\n Estado: " + estado);
    }
}
