
package PIjogo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Desafio1 {
    JFrame janelaDesafio;
    Container con;
    JPanel fundoDesafio;
    JLabel descricaoDesafio;
    JButton opcaoA, opcaoB, opcaoC, opcaoD;
    Font fonteCorpo = new Font("Times New Roman", Font.PLAIN, 30);

    public void abrirDesafio() {
        janelaDesafio = new JFrame("Desafio na Biblioteca");
        janelaDesafio.setSize(1000, 700);
        janelaDesafio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaDesafio.setResizable(false);
        janelaDesafio.getContentPane().setBackground(Color.black);
        janelaDesafio.setLocationRelativeTo(null);
        janelaDesafio.setLayout(null);
        con = janelaDesafio.getContentPane();

        fundoDesafio = new JPanel();
        fundoDesafio.setBounds(50, 50, 900, 600);
        fundoDesafio.setBackground(Color.black);

        descricaoDesafio = new JLabel("<html>Após o encontro com o feiticeiro, Kote vai até a biblioteca do palácio, mas o livro que ele precisa<br> encontra-se em uma área restrita que contém os seguintes requisitos:<br><br>" +
                "<i>if (!(energia < 5 || foco <= 5) && (habilidadeEspecial || sabedoria > 10)) {</i><br>" +
                "<i>acessarBiblioteca();</i><br><br>" +
                "Considere os valores para Kote:<br>" +
                "Energia: 4<br>Foco: 6<br>Habilidade Especial: desativada<br>Sabedoria: 12<br><br>" +
                "O que acontece quando Kote tenta acessar a biblioteca?</html>");
        descricaoDesafio.setForeground(Color.white);
        descricaoDesafio.setFont(fonteCorpo);

        opcaoA = new JButton("A) A biblioteca é acessada.");
        opcaoA.setBounds(100, 400, 300, 50);
        opcaoA.setFont(fonteCorpo);
        opcaoA.setFocusPainted(false);
        opcaoA.setBackground(Color.black);
        opcaoA.setForeground(Color.white);
        opcaoA.setBorderPainted(false);
        opcaoA.setContentAreaFilled(false);
        opcaoA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        });

        opcaoB = new JButton("B) A biblioteca permanece fechada. (Correta)");
        opcaoB.setBounds(400, 400, 500, 50);
        opcaoB.setFont(fonteCorpo);
        opcaoB.setFocusPainted(false);
        opcaoB.setBackground(Color.black);
        opcaoB.setForeground(Color.white);
        opcaoB.setBorderPainted(false);
        opcaoB.setContentAreaFilled(false);
        opcaoB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Correto! A biblioteca permanece fechada.");
            }
        });

        opcaoC = new JButton("C) Kote encontra o livro mágico.");
        opcaoC.setBounds(100, 500, 400, 50);
        opcaoC.setFont(fonteCorpo);
        opcaoC.setFocusPainted(false);
        opcaoC.setBackground(Color.black);
        opcaoC.setForeground(Color.white);
        opcaoC.setBorderPainted(false);
        opcaoC.setContentAreaFilled(false);
        opcaoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        });

        opcaoD = new JButton("D) Kote é banido da biblioteca.");
        opcaoD.setBounds(500, 500, 400, 50);
        opcaoD.setFont(fonteCorpo);
        opcaoD.setFocusPainted(false);
        opcaoD.setBackground(Color.black);
        opcaoD.setForeground(Color.white);
        opcaoD.setBorderPainted(false);
        opcaoD.setContentAreaFilled(false);
        opcaoD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        });

        fundoDesafio.add(descricaoDesafio);
        fundoDesafio.add(opcaoA);
        fundoDesafio.add(opcaoB);
        fundoDesafio.add(opcaoC);
        fundoDesafio.add(opcaoD);

        con.add(fundoDesafio);
        janelaDesafio.setVisible(true);
    }
}

