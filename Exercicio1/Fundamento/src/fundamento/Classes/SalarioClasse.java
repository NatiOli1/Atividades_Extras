/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento.Classes;

/**
 *
 * @author rnco0
 */
public class SalarioClasse {
    private double salario;
    private double percentualAumento;

    public SalarioClasse(double salario, double percentualAumento) {
        this.salario = salario;
        this.percentualAumento = percentualAumento;
    }
    
    public void calcularPercentual(){
        this.percentualAumento = this.percentualAumento / 100;
        this.salario = this.salario + (this.salario * this.percentualAumento);
        System.out.println("Salario agora é de: " + salario);
    }
}
