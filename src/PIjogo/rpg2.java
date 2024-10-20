
package PIjogo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rpg2 extends JFrame {
    private int tentativa = 0;
    private boolean acertou = false;
    private JLabel historiaLabel;
    private JTextArea resultadoArea;
    private JButton botaoA, botaoB, botaoC, botaoD;

    public rpg2() {
        setTitle("RPG Kote");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

       
        historiaLabel = new JLabel("<html>Narrador: Em uma noite sombria, Kote recebe um chamado de emergência." +
                "<br> O reino de Noxterra, um reino noturno onde a lua ilumina segredos e conhecimentos antigos," +
                "<br> abriga o Diário de Arquimedes, uma escrita ancestral que contém segredos poderosos sobre a manipulação do tempo." +
                "<br> Porém, a tranquilidade do reino foi perturbada por uma nova ameaça: o diário de Arquimedes foi roubado pela facção do rei, o Purgatório." +
                "<br> Se eles não forem impedidos, o equilíbrio do mundo será destruído." +
                "<br> Agora, Kote embarca em uma jornada através do tempo, voltando ao passado para recuperar o diário de Arquimedes antes do Purgatório." +
                "<br>Pergunta: Qual estrutura de repetição é mais adequada para repetir um conjunto de ações necessárias para alcançar esse objetivo?</html>");
        add(historiaLabel, BorderLayout.NORTH);

        
        JPanel painelBotoes = new JPanel(new GridLayout(2, 2));
        botaoA = new JButton("A - For");
        botaoB = new JButton("B - While");
        botaoC = new JButton("C - Do While");
        botaoD = new JButton("D - IF");
        painelBotoes.add(botaoA);
        painelBotoes.add(botaoB);
        painelBotoes.add(botaoC);
        painelBotoes.add(botaoD);
        add(painelBotoes, BorderLayout.CENTER);

        
        resultadoArea = new JTextArea(5, 30);
        resultadoArea.setEditable(false);
        add(new JScrollPane(resultadoArea), BorderLayout.SOUTH);

        
        botaoA.addActionListener(e -> verificarRespostaParte1('A'));
        botaoB.addActionListener(e -> verificarRespostaParte1('B'));
        botaoC.addActionListener(e -> verificarRespostaParte1('C'));
        botaoD.addActionListener(e -> verificarRespostaParte1('D'));
    }

    
    private void verificarRespostaParte1(char opcao) {
        tentativa++;
        if (opcao == 'B') {
            acertou = true;
            resultadoArea.setText("Parabéns, Kote! Você acertou!\n");
            // proximaPerguntaParte2();
        } else if (tentativa < 5) {
            resultadoArea.setText("Resposta incorreta! Você perdeu uma vida ;<.\n");
        } else {
            resultadoArea.setText("Você perdeu todas as vidas. O jogo terminou.\n");
            desativarBotoes();
        }
    }

    
    private void desativarBotoes() {
        botaoA.setEnabled(false);
        botaoB.setEnabled(false);
        botaoC.setEnabled(false);
        botaoD.setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            rpg2 jogo = new rpg2();
            jogo.setVisible(true);
        });
    }
}


