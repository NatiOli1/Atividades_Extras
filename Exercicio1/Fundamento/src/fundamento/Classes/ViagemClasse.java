/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento.Classes;

import java.text.DecimalFormat;

/**
 *
 * @author rnco0
 */
public class ViagemClasse {
    //cidade saída, cidade destino, distância, km/litro, combustível utilizado e valor.
    private String cidadeSaida;
    private String cidadeDestino;
    private double distancia;
    private double kmLitro;
    private String combustivel;
    private double etanol;
    private double gasolina;
    private double ValorTotalDaViagem;

    public ViagemClasse(String cidadeSaida, String cidadeDestino, double distancia, double kmLitro, String combustivel) {
        this.cidadeSaida = cidadeSaida;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia;
        this.kmLitro = kmLitro;
        this.combustivel = combustivel;
    }

    
    public void CalcularViagem(){
        if (this.combustivel == "Etanol"){
            this.etanol = 4.58;
            this.ValorTotalDaViagem = (this.distancia / this.kmLitro) * this.etanol;
        }else if (this.combustivel == "Gasolina"){
            this.gasolina = 5.85;
            this.ValorTotalDaViagem = (this.distancia / this.kmLitro) * this.gasolina;
        }else{
            System.err.println("Combustível não identificado");
        }
        }
    

    @Override
    public String toString() {
        return "ViagemClasse{" + "cidadeSaida=" + cidadeSaida + ", cidadeDestino=" + cidadeDestino + ", distancia=" + distancia + ", kmLitro=" + kmLitro + ", combustivel=" + combustivel + ", ValorTotalDaViagem=" + ValorTotalDaViagem + '}';
    }
        
    }

    
