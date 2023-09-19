/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamento;
import java.awt.Color;
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
public class Tempo {
    public static void main(String[] args) {
        //1.5) Crie o arquivo Tempo.java para calcular o valor em segundos, 
        //o programa deverá solicitar as informações de dias, horas, minutos e segundos. 
        //Coloque a lógica necessária para converter as informações para segundos e realizar a soma. 
        //Ao final imprima uma mensagem com as informações pertinentes.
        
        JFrame janela = new JFrame("Converter para Segundos");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 150);

        
        JPanel painel = new JPanel();

        
        JLabel numeroHoras = new JLabel("Digite as horas: ");
        JLabel numeroMin = new JLabel("Digite os minutos: ");
        JLabel numeroSeg = new JLabel("Digite os segundos: ");
       
        JTextField campoDeTexto1 = new JTextField(10);
        JTextField campoDeTexto2 = new JTextField(10);
        JTextField campoDeTexto3= new JTextField(10);

  
        JButton botao = new JButton("Confirmar");

        painel.add(numeroHoras);
        painel.add(campoDeTexto1);
        painel.add(numeroMin);
        painel.add(campoDeTexto2);
        painel.add(numeroSeg);
        painel.add(campoDeTexto3);
        painel.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String texto1 = campoDeTexto1.getText();
                String texto2 = campoDeTexto2.getText();
                String texto3 = campoDeTexto3.getText();

                try {
                    int horas = Integer.parseInt(texto1);
                    int minutos = Integer.parseInt(texto2);
                    int segundos = Integer.parseInt(texto3);

                    int converterHoras = horas * 3600;
                    int converterMin = minutos * 60;
                    int resultado = segundos + converterHoras + converterMin;


                    JOptionPane.showMessageDialog(janela, "O resultado da conversão é: " + resultado + " segundos");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Entrada inválida. Digite números válidos.");
                }
            }
        });

        janela.add(painel);

        janela.setVisible(true);
    }
}

