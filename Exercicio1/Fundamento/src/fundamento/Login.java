/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author rnco0
 */
public class Login {
    public static void main(String[] args) {
        /**
         * 1.9) Cria o arquivo Login.java e solicite ao usuário seu email e o tamanho da senha,
         * você deve utilizar uma lógica para gerar uma senha com o tamanho especificado 
         * com letras e números aleatórios, detalhe a senha não pode ter menos que 6 caracteres.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu login: "); 
        String login = scanner.next();
        System.out.println("Você quer que o sistema crie uma senha aleatória?? ");
        String perguntaSenha = scanner.next();
    }
}
