package PIjogo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class exemplo {

    // Constantes para Fonte e Texto
    private static final Font FONT_TITULO = new Font("Times New Roman", Font.PLAIN, 40);
    private static final Font FONT_CORPO = new Font("Times New Roman", Font.PLAIN, 30);
    private static final Font FONT_DESAFIOS = new Font("Times New Roman", Font.PLAIN, 20);

    // Janelas e Painéis
    private JFrame janelaPrincipal, janelaStart, janelaComoJogar, janelaCreditos, janelaDesafio1;
    private Container con;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(exemplo::new);
    }

    public exemplo() {
        criarJanelaPrincipal();
    }

    private void criarJanelaPrincipal() {
        janelaPrincipal = criarJanela("A Herança do Caos: Último Maerion", 1000, 700);
        con = janelaPrincipal.getContentPane();

        JPanel painelTitulo = criarPainel(100, 100, 780, 150, Color.black);
        JLabel titulo = criarLabel("A HERANÇA DO CAOS: ÚLTIMO MAERION", Color.white, FONT_TITULO);
        painelTitulo.add(titulo);

        JPanel painelStart = criarBotao("START", 405, 350, e -> abrirJanelaStart());
        JPanel painelComoJogar = criarBotao("COMO JOGAR", 380, 400, e -> abrirJanelaComoJogar());
        JPanel painelCreditos = criarBotao("CRÉDITOS", 385, 450, e -> abrirJanelaCreditos());
        JPanel painelSair = criarBotao("SAIR", 383, 500, e -> System.exit(0));

        con.add(painelTitulo);
        con.add(painelStart);
        con.add(painelComoJogar);
        con.add(painelCreditos);
        con.add(painelSair);
    }

    private JFrame criarJanela(String titulo, int largura, int altura) {
        JFrame janela = new JFrame(titulo);
        janela.setSize(largura, altura);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.getContentPane().setBackground(Color.black);
        janela.setLocationRelativeTo(null);
        janela.setLayout(null);
        janela.setVisible(true);
        return janela;
    }

    private JPanel criarPainel(int x, int y, int largura, int altura, Color corFundo) {
        JPanel painel = new JPanel();
        painel.setBounds(x, y, largura, altura);
        painel.setBackground(corFundo);
        return painel;
    }

    private JLabel criarLabel(String texto, Color cor, Font fonte) {
        JLabel label = new JLabel(texto);
        label.setForeground(cor);
        label.setFont(fonte);
        return label;
    }

    private JPanel criarBotao(String texto, int x, int y, ActionListener acao) {
        JPanel painelBotao = criarPainel(x, y, 200, 50, Color.black);
        JButton botao = new JButton(texto);
        botao.setFont(FONT_CORPO);
        botao.setForeground(Color.white);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);

        botao.addActionListener(acao);
        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botao.setForeground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botao.setForeground(Color.white);
            }
        });

        painelBotao.add(botao);
        return painelBotao;
    }

    private JButton criarBotaoVoltar(JFrame janelaAtual) {
        JButton botaoVoltar = new JButton("VOLTAR");
        botaoVoltar.setFont(FONT_CORPO);
        botaoVoltar.setForeground(Color.white);
        botaoVoltar.setBackground(Color.black);
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.setBorderPainted(false);
        botaoVoltar.setContentAreaFilled(false);

        botaoVoltar.addActionListener(e -> {
            janelaPrincipal.setVisible(true);
            janelaAtual.dispose();
        });

        return botaoVoltar;
    }

    private void abrirJanelaStart() {
        janelaStart = criarJanela("Jogo começa...", 1000, 700);
        JPanel fundoStart = criarPainel(50, 50, 900, 600, Color.black);
        JLabel textoStart = criarLabel("Jogo começa...", Color.white, FONT_CORPO);
        fundoStart.add(textoStart);
        
        configurarTeclaEnter(fundoStart, this::abrirDesafio1);

        janelaStart.getContentPane().add(fundoStart);
    }

    private void abrirDesafio1() {
        janelaStart.dispose();
        janelaDesafio1 = criarJanela("Desafio 1", 1000, 700);
        con = janelaDesafio1.getContentPane();

        JPanel fundoDesafio = criarPainel(50, 50, 900, 600, Color.black);
        JLabel textoDesafio = criarLabel("<html>Após o encontro com o feiticeiro, Kote vai até a biblioteca do palácio, "
            + "mas o livro que ele precisa encontra-se em uma área restrita.<br><br>"
            + "Requisitos: <i>if (!(energia < 5 || foco <= 5) && (habilidadeEspecial || sabedoria > 10))</i>.<br><br>"
            + "Energia: 4<br>Foco: 6<br>Habilidade Especial: desativada<br>Sabedoria: 12.<br><br>"
            + "O que acontece quando Kote tenta acessar a biblioteca?</html>", Color.white, FONT_DESAFIOS);

        JButton alternativaA = criarBotaoResposta("A) A biblioteca é acessada.", false);
        JButton alternativaB = criarBotaoResposta("B) A biblioteca permanece fechada.", true);

        fundoDesafio.add(textoDesafio);
        fundoDesafio.add(alternativaA);
        fundoDesafio.add(alternativaB);

        con.add(fundoDesafio);
    }

    private JButton criarBotaoResposta(String texto, boolean correto) {
        JButton botaoResposta = new JButton(texto);
        botaoResposta.setFont(FONT_DESAFIOS);
        botaoResposta.setForeground(Color.white);
        botaoResposta.setBackground(Color.black);
        botaoResposta.setFocusPainted(false);
        botaoResposta.setBorderPainted(false);
        botaoResposta.setContentAreaFilled(false);
        botaoResposta.setBounds(100, 400, 300, 50);

        botaoResposta.addActionListener(e -> {
            String mensagem = correto ? "Correto! A biblioteca permanece fechada." : "Resposta incorreta! Tente novamente!";
            JOptionPane.showMessageDialog(null, mensagem);
        });

        return botaoResposta;
    }

    private void abrirJanelaComoJogar() {
        janelaComoJogar = criarJanela("Como Jogar", 1000, 700);
        JPanel fundoComoJogar = criarPainel(50, 50, 900, 600, Color.black);
        JLabel textoComoJogar = criarLabel("<html>Esse é um jogo baseado em perguntas de múltipla escolha no qual <br>"
                + "haverá uma pergunta relacionada a Java...</html>", Color.white, FONT_CORPO);
        
        fundoComoJogar.add(textoComoJogar);
        fundoComoJogar.add(criarBotaoVoltar(janelaComoJogar));
        janelaComoJogar.getContentPane().add(fundoComoJogar);
    }

    private void abrirJanelaCreditos() {
        janelaCreditos = criarJanela("Créditos", 1000, 700);
        JPanel fundoCreditos = criarPainel(50, 50, 900, 600, Color.black);
        JLabel textoCreditos = criarLabel("Esse jogo foi desenvolvido por ...", Color.white, FONT_CORPO);
        
        fundoCreditos.add(textoCreditos);
        fundoCreditos.add(criarBotaoVoltar(janelaCreditos));
        janelaCreditos.getContentPane().add(fundoCreditos);
    }

    private void configurarTeclaEnter(JComponent componente, Runnable acao) {
        InputMap inputMap = componente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        componente.getActionMap().put("enterPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acao.run();
            }
        });
    }
}
