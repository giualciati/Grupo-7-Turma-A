
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
                "<br> abriga o Diário de Arquimedes, uma escrita ancestral que contém segredos poderosos sobre a manipulação do tempo."
                +
                "<br> Porém, a tranquilidade do reino foi perturbada por uma nova ameaça: o diário de Arquimedes foi roubado pela facção do rei, o Purgatório."
                +
                "<br> Se eles não forem impedidos, o equilíbrio do mundo será destruído." +
                "<br> Agora, Kote embarca em uma jornada através do tempo, voltando ao passado para recuperar o diário de Arquimedes antes do Purgatório."
                +
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
            proximaPerguntaParte2();
        } else if (tentativa < 5) {
            resultadoArea.setText("Resposta incorreta! Você perdeu uma vida ;<.\n");
        } else {
            resultadoArea.setText("Você perdeu todas as vidas. O jogo terminou.\n");
            desativarBotoes();
        }
    }

    private void proximaPerguntaParte2() {
        historiaLabel.setText(
                "<html>Narrador: Assim que kote chega ao passado, ele vai direto para a biblioteca principal de Noxxterra, uma imensa estrutura de paredes de pedra e livros antigos. O ambiente é iluminado pelo luar da lua, e um ar misterioso envolve o lugar. No centro da biblioteca, ele encontra um feiticeiro, uma figura imponente coberta por uma capa de tecido mágico que brilha levemente"
                        +
                        "<br> Feiticeiro: 'Bem-vindo, kote. O tempo aqui não é linear, o Diário de Arquimendes está escondido dentro deste baú. Mas para abri-lo, você precisará decifrar o código que mantém o baú fechado. Somente aqueles que dominam os loops do tempo poderão abri-lo."
                        +
                        "<br> Desafio: Este baú está protegido por um feitiço de repetição. O código está escrito nas runas. Decifre-o: o valor de x começa em 10 e diminui continuamente. Qual será o valor final de x ao sair do ciclo?"
                        +
                        "<br>Para abrir o baú, decifre o seguinte código: int x = 10; do { x = x - 2; } while (x > 3);</html>");

        tentativa = 0;
        acertou = false;
        resultadoArea.setText("");
        botaoA.setText("A - 2");
        botaoB.setText("B - 4");
        botaoC.setText("C - 3");
        botaoD.setText("D - 5");

        botaoA.addActionListener(e -> verificarRespostaParte2('A'));
        botaoB.addActionListener(e -> verificarRespostaParte2('B'));
        botaoC.addActionListener(e -> verificarRespostaParte2('C'));
        botaoD.addActionListener(e -> verificarRespostaParte2('D'));
    }

    private void verificarRespostaParte2(char opcao) {
        tentativa++;
        if (opcao == 'A') {
            acertou = true;
            resultadoArea.setText("Parabéns, Kote! Você conseguiu abrir o baú.\n");
            proximaPerguntaParte3();
        } else if (tentativa < 5) {
            resultadoArea.setText("Resposta incorreta! Você perdeu uma vida ;<.\n");
        } else {
            resultadoArea.setText("Você esgotou suas tentativas. O baú permanece fechado.\n");
            desativarBotoes();
        }
    }

    private void proximaPerguntaParte3() {
        historiaLabel.setText(
                "<html>Narrador: Com o Diário de Arquimendes finalmente em mãos, kote sente o poder e o conhecimento antigo fluindo através dele. As páginas brilham com runas misteriosas que começam a se reorganizar em um idioma compreensível. Mas o tempo é curto, e ele sabe que precisa voltar ao futuro antes que o portal se feche para sempre."
                        +
                        "<br> Ele se posiciona no centro da sala, cercado pela energia mágica que emana do diário, e se prepara para realizar o feitiço de retorno temporal."
                        +
                        "<br> kote respira fundo, fecha os olhos, e começa a invocar seu poder mágico. Ele sabe que tem que se concentrar profundamente, pois o sucesso da viagem depende da precisão de sua conjuração."
                        +
                        "<br> Kote: Um... dois... três..." +
                        "<br> Pergunta: Qual das seguintes afirmações define corretamente quando se utiliza um laço FOR?</html>");
        tentativa = 0;
        acertou = false;
        resultadoArea.setText(""); // Limpa a área de resultado para a nova pergunta
        botaoA.setText(
                "A - É utilizado quando uma condição é true/verdadeira mas a essa condição é verificada apenas no final da repetição.");
        botaoB.setText("B - É utilizado quando se sabe o número de repetições.");
        botaoC.setText("C - É utilizado quando uma condição é true/verdadeira.");
        botaoD.setText(
                "D - É utilizado quando uma condição é true/verdadeira mas a essa condição é verificada apenas no final da repetição.");

        botaoA.addActionListener(e -> verificarRespostaParte3('A'));
        botaoB.addActionListener(e -> verificarRespostaParte3('B'));
        botaoC.addActionListener(e -> verificarRespostaParte3('C'));
        botaoD.addActionListener(e -> verificarRespostaParte3('D'));
    }

    // Função para verificar a resposta da terceira parte
    private void verificarRespostaParte3(char opcao) {
        tentativa++;
        if (opcao == 'B') {
            acertou = true;
            resultadoArea.setText("Parabéns, Kote! Você conseguiu voltar ao futuro com o Diário!\n");
        } else if (tentativa < 5) {
            resultadoArea.setText("Resposta incorreta! Você perdeu uma vida ;<.\n");
        } else {
            resultadoArea.setText("Você esgotou suas tentativas. O feitiço falhou.\n");
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
