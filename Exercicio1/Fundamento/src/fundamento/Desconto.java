/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rnco0
 */
public class Desconto {
    public static void main(String[] args) {
        
        //1.7) Crie o arquivo Desconto.java para calcular o desconto de um produto, 
        //o programa deverá solicitar as informações de nome, preço e percentual de desconto. 
        //Aplique a lógica necessária para realizar o cálculo e ao 
        //final imprima uma mensagem com as informações pertinentes.
        
        JFrame janela = new JFrame("Calculo de desconto");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 150);
        
        JPanel painel = new JPanel();

        
        JLabel nome = new JLabel("Nome do produto: ");
        JLabel preco = new JLabel("Preço do produto: ");
        JLabel percentualDesconto = new JLabel("Percentual de desconto: ");
        
        JTextField campoDeTexto1 = new JTextField(10);
        JTextField campoDeTexto2 = new JTextField(10);
        JTextField campoDeTexto3 = new JTextField(10);
        
        JButton botao = new JButton("Confirmar");
        
        painel.add(nome);
        painel.add(campoDeTexto1);
        painel.add(preco);
        painel.add(campoDeTexto2);
        painel.add(percentualDesconto);
        painel.add(campoDeTexto3);
        painel.add(botao);
        
        
        
        janela.add(painel);

        janela.setVisible(true);
        
            botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String texto1 = campoDeTexto2.getText();
                String texto2 = campoDeTexto3.getText();
                try {
                    double preco = Double.parseDouble(texto1);
                    double percentualDesconto = Double.parseDouble(texto2);
                    double calculaPercentual = percentualDesconto / 100;
                    double desconto = preco - (calculaPercentual * preco);
                     String mensagem = "Seu desconto é de: "  + desconto;
                    JOptionPane.showMessageDialog(janela, mensagem);
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Entrada inválida. Digite números válidos.");
                }
                }
            });
            }
                    }
