/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento.Classes;

/**
 *
 * @author rnco0
 */
public class QuadradoClasse {
    private double lado;
    private double area;

    public QuadradoClasse(double lado) {
        this.lado = lado;
    }
    
    public void CalcularArea(){
        this.area = this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "QuadradoClasse{" + "lado=" + lado + ", area=" + area + '}';
    }


    
    
}
