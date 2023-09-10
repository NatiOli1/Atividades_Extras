/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento.Classes;

/**
 *
 * @author rnco0
 */
public class CirculoClasse {
    private double pi;
    private double raio;
    private double area;

    public CirculoClasse(double raio) {
        this.pi = 3.14;
        this.raio = raio;
    }
    
    public void CalcularCirculo(){
        this.area = this.pi * Math.pow(this.raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "pi=" + pi + ", raio=" + raio + ", area=" + area + '}';
    }
}
