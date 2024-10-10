package ahdcum;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Rpg {

 JFrame janela;//janela
 Container con;//conteúdo
 JPanel fundotituloinicial, fundobstart, fundobcomojogar, fundobcreditos, fundobsair;//painéis
 JLabel tituloinicial;//textos
 JButton bstart, bcomojogar, bcreditos, bsair;//botões
 Font fontetitulo = new Font("Times New Roman", font.PLAIN, 40);//fonte
 Font fontecorpo = new Font ("Times New Roman", font.PLAIN, 30);//fonte

public static void main(String[] args) {
    new Rpg();
}

public Rpg(){
   janela = new JFrame(); // cria a janela
   janela.setTitle("A Herança do Caos: Último Maerion");// dá um título
   janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para fechar devidamente a janela
   janela.setSize(1000,700);// define o tamanho
   janela.getContentPane().setBackground(Color.black); // cor de fundo
   janela.setLayout(null);
   janela.setLocationRelativeTo(null); // centralizar
   janela.setVisible(true);// faz com que fique visível
   con = janela.getContentPane(); //coloca o conteúdo dentro da janela

   //Titulo
   fundotituloinicial = new JPanel();//criação do painel
   fundotituloinicial.setBounds(100,100,780,150);//define o tamanho
   fundotituloinicial.setBackground(Color.black);// cor

   tituloinicial = new JLabel("A HERANÇA DO CAOS: ÚLTIMO MAERION");// Título
   tituloinicial.setForeground(Color.white);//cor
   tituloinicial.setFont(fontetitulo);//fonte

   //Botão Start
   fundobstart = new JPanel();
   fundobstart.setBounds(405,350,150,50);
   fundobstart.setBackground(Color.black);

   bstart = new JButton("START");
   bstart.setBackground(Color.black);
   bstart.setForeground(Color.white);
   bstart.setFont(fontecorpo);

   bstart.setFocusPainted(false); //Para tirar as bordas do botão
   bstart.setBorderPainted(false);
   bstart.setContentAreaFilled(false);

    bstart.addMouseListener(new MouseListener() {
        public void mouseEntered(MouseEvent e) {
            bstart.setForeground(Color.yellow);//Muda a cor do botão ao passar o mouse em cima
        }

        public void mouseExited(MouseEvent e) {
            bstart.setForeground(Color.white);//Volta à cor original ao tirar o mouse
        }

        public void mouseClicked(MouseEvent e) {
            bstart.setForeground(Color.green); //Muda a cor ao clicar
        }

       public void mousePressed(MouseEvent e) {}//Metodos não utilizados, mas que precisam estar aqui
       public void mouseReleased(MouseEvent e) {}

    });

    //botão Como Jogar
    fundobcomojogar = new JPanel();
    fundobcomojogar.setBounds(380,400,200,50);
    fundobcomojogar.setBackground(Color.black);

    bcomojogar = new JButton("COMO JOGAR");
    bcomojogar.setBackground(Color.black);
    bcomojogar.setForeground(Color.white);
    bcomojogar.setFont(fontecorpo);

    bcomojogar.setFocusPainted(false); //Para tirar as bordas do botão
    bcomojogar.setBorderPainted(false);
    bcomojogar.setContentAreaFilled(false);

     bcomojogar.addMouseListener(new MouseListener() {
        public void mouseEntered(MouseEvent e) {
            bcomojogar.setForeground(Color.yellow);//Muda a cor do botão ao passar o mouse em cima
        }

        public void mouseExited(MouseEvent e) {
            bcomojogar.setForeground(Color.white);//Volta à cor original ao tirar o mouse
        }

        public void mouseClicked(MouseEvent e) {
            bcomojogar.setForeground(Color.green); //Muda a cor ao clicar
        }

       public void mousePressed(MouseEvent e) {}//Metodos não utilizados, mas que precisam estar aqui
       public void mouseReleased(MouseEvent e) {}

    });

     //Botão créditos
     fundobcreditos = new JPanel();
     fundobcreditos.setBounds(385,450,200,50);
     fundobcreditos.setBackground(Color.black);

     bcreditos = new JButton("CRÉDITOS");
     bcreditos.setBackground(Color.black);
     bcreditos.setForeground(Color.white);
     bcreditos.setFont(fontecorpo);

     bcreditos.setFocusPainted(false);
     bcreditos.setBorderPainted(false);
     bcreditos.setContentAreaFilled(false);

     bcreditos.addMouseListener(new MouseListener(){
         public void mouseEntered(MouseEvent e) {
             bcreditos.setForeground(Color.yellow);
         }
         public void mouseExited(MouseEvent e) {
             bcreditos.setForeground(Color.white);
         }
         public void mouseClicked(MouseEvent e) {
             bcreditos.setForeground(Color.green);
         }

         public void mousePressed(MouseEvent e) {}//Metodos não utilizados, mas que precisam estar aqui
         public void mouseReleased(MouseEvent e) {}
     });

     //Botão sair
     fundobsair = new JPanel();
     fundobsair.setBounds(383,500,200,50);
     fundobsair.setBackground(Color.black);

     bsair = new JButton("SAIR");
     bsair.setBackground(Color.black);
     bsair.setForeground(Color.white);
     bsair.setHorizontalAlignment(SwingConstants.CENTER);
     bsair.setFont(fontecorpo);

     bsair.setFocusPainted(false);
     bsair.setBorderPainted(false);
     bsair.setContentAreaFilled(false);

     bsair.addMouseListener(new MouseListener(){
         public void mouseEntered(MouseEvent e) {
             bsair.setForeground(Color.yellow);
         }
         public void mouseExited(MouseEvent e) {
             bsair.setForeground(Color.white);
         }
         public void mouseClicked(MouseEvent e) {
             bsair.setForeground(Color.green);
         }

         public void mousePressed(MouseEvent e) {}
         public void mouseReleased(MouseEvent e) {}
     });

   fundobstart.add(bstart);//Para adicionar o botão ao painel
   fundobcomojogar.add(bcomojogar);
   fundobcreditos.add(bcreditos);
   fundobsair.add(bsair);
   fundotituloinicial.add(tituloinicial);//Para adicionar o texto ao painel
   con.add(fundotituloinicial);//Adiciona o painel
   con.add(fundobstart);//Adiciona o painel
   con.add(fundobcomojogar);
   con.add(fundobcreditos);
   con.add(fundobsair);


}

}