/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento.Classes;

/**
 *
 * @author rnco0
 */
public class IMCClasse {
    private String nome;
    private double peso;
    private double altura;
    private double IMC;

    public IMCClasse(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void CalculaIMC(){
        this.IMC = this.peso / (Math.pow(this.altura, 2));
    }

    @Override
    public String toString() {
        return "IMCClasse{" + "nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", IMC=" + IMC + '}';
    }
    
    
}
