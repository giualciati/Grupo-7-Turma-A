package PIjogo;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class rpg1 {

 //criação das variáveis
 JFrame janela, janelastart, janelacomojogar, janelacomojogar2, janelacreditos, janeladesafio1, janeladesafio2, janeladesafio3, janeladesafio4, janeladesafio5, janeladesafio6, janeladesafio7, janeladesafio8, janeladesafio9, janeladesafio10, janelaDialogo1, janelaDialogo2, janelaDialogo3, janelaDialogo4, janelaDialogo5, janelaDialogo6, janelaDialogo7, janelaDialogo8, janelaDialogo9, janeladecisao;//janela
 Container con;//conteúdo
 JPanel fundotituloinicial, fundomenu, fundojstart, fundojcomojogar, fundojcomojogar2, fundojcreditos, fundodesafio1, fundoalternativasd1, fundodesafio2, fundoalternativasd2, fundodesafio3, fundoalternativasd3, fundodesafio4, fundoalternativasd4, fundodesafio5, fundoalternativasd5, fundodesafio6, fundoalternativasd6, fundodesafio7, fundoalternativasd7, fundodesafio8, fundoalternativasd8, fundodesafio9, fundoalternativasd9, fundodesafio10, fundoalternativasd10, fundojDialogo1, fundojDialogo2, fundojDialogo3, fundojDialogo4, fundojDialogo5, fundojDialogo6, fundojDialogo7, fundojDialogo8, fundojDialogo9, fundojdecisao, fundobdecisao;//painéis
 JLabel tituloinicial, tstart, tcomojogar, tcreditos, tdesafio1, tdesafio2, tdesafio3, tdesafio4, tdesafio5, tdesafio6, tdesafio7, tdesafio8, tdesafio9, tdesafio10, sistemaVida;//textos
 JButton bstart, bcomojogar, bcreditos, bsair, bvoltar, alternativaadesafio1, alternativabdesafio1, alternativacdesafio1, alternativaddesafio1, alternativaad2, alternativabd2, alternativacd2, alternativadd2, alternativaad3, alternativabd3, alternativacd3, alternativadd3, alternativaad4, alternativabd4, alternativacd4, alternativadd4, alternativaad5, alternativabd5, alternativacd5, alternativadd5, alternativaad7, alternativabd7, alternativacd7, alternativadd7, alternativaad8, alternativabd8, alternativacd8, alternativadd8, alternativaad9, alternativabd9, alternativacd9, alternativadd9, alternativaad10, alternativabd10, alternativacd10, alternativadd10, matar, nmatar;//botões
 JTextArea textocj, textocj2, textoDi1, textoDi2, textoDi3, textodi4, textodi5, textoDi6, textodi7, textodi8, textodi9, textocreditos, textodecisao;
 Font fontetitulo = new Font("Times New Roman", Font.PLAIN, 40);//fonte
 Font fontecorpo = new Font ("Times New Roman", Font.PLAIN, 30);//fonte
 Font fontedesafios = new Font("Times New ROman", Font.PLAIN, 20);
 Font fontecorpo2 = new Font ("Times New Roman", Font.PLAIN, 18);

  int vida = 5;

public void abprimeirajanela(){
   janela = new JFrame(); // cria a janela
   janela.setTitle("A Herança do Caos: Último Maerion");// dá um título
   janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para fechar devidamente a janela
   janela.setSize(1000,700);// define o tamanho
   janela.setResizable(false);
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

   fundomenu = new JPanel();
   fundomenu.setBounds(325, 350, 300, 200);
   fundomenu.setBackground(Color.black);
   fundomenu.setLayout(new GridLayout(4,1));
   con.add(fundomenu);

   //Botão Start
   bstart = new JButton("START");
   bstart.setBackground(Color.black);
   bstart.setForeground(Color.white);
   bstart.setFont(fontecorpo);

   bstart.setFocusPainted(false); //Para tirar as bordas do botão
   bstart.setBorderPainted(false);
   bstart.setContentAreaFilled(false);

    // Adicionando ActionListener para abrir a nova janela ao clicar no botão "COMO JOGAR"
    bstart.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abstart(); // Chama o método que abre a nova janela
            janela.setVisible(false);//fecha a janela inicial
        }
    });

    bstart.addMouseListener(new MouseListener() {
        public void mouseEntered(MouseEvent e) {
            bstart.setForeground(Color.yellow);//Muda a cor do botão ao passar o mouse em cima
        }

        public void mouseExited(MouseEvent e) {
            bstart.setForeground(Color.white);//Volta à cor original ao tirar o mouse
        }

       public void mouseClicked(MouseEvent e) {}
       public void mousePressed(MouseEvent e) {}//Metodos não utilizados, mas que precisam estar aqui
       public void mouseReleased(MouseEvent e) {}

    });

    //botão Como Jogar
    bcomojogar = new JButton("COMO JOGAR");
    bcomojogar.setBackground(Color.black);
    bcomojogar.setForeground(Color.white);
    bcomojogar.setFont(fontecorpo);

    bcomojogar.setFocusPainted(false); //Para tirar as bordas do botão
    bcomojogar.setBorderPainted(false);
    bcomojogar.setContentAreaFilled(false);
    
     // Adicionando ActionListener para abrir a nova janela ao clicar no botão "COMO JOGAR"
        bcomojogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abcomojogar(); // Chama o método que abre a nova janela
                janela.setVisible(false);//fecha a janela inicial
            }
        });

     bcomojogar.addMouseListener(new MouseListener() {
        public void mouseEntered(MouseEvent e) {
            bcomojogar.setForeground(Color.yellow);//Muda a cor do botão ao passar o mouse em cima
        }

        public void mouseExited(MouseEvent e) {
            bcomojogar.setForeground(Color.white);//Volta à cor original ao tirar o mouse
        }

       public void mouseClicked(MouseEvent e) {}//Metodos não utilizados, mas que precisam estar aqui
       public void mousePressed(MouseEvent e) {}
       public void mouseReleased(MouseEvent e) {}

    });

     //Botão créditos

     bcreditos = new JButton("CRÉDITOS");
     bcreditos.setBackground(Color.black);
     bcreditos.setForeground(Color.white);
     bcreditos.setFont(fontecorpo);

     bcreditos.setFocusPainted(false);
     bcreditos.setBorderPainted(false);
     bcreditos.setContentAreaFilled(false);

     bcreditos.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            abcreditos(); // Chama o método que abre a nova janela
            janela.setVisible(false);//fecha a janela inicial
        }
    });
     

     bcreditos.addMouseListener(new MouseListener(){
         public void mouseEntered(MouseEvent e) {
             bcreditos.setForeground(Color.yellow);
         }
         public void mouseExited(MouseEvent e) {
             bcreditos.setForeground(Color.white);
         }
         public void mouseClicked(MouseEvent e) {}//Metodos não utilizados, mas que precisam estar aqui
         public void mousePressed(MouseEvent e) {}
         public void mouseReleased(MouseEvent e) {}
     });


     //Botão sair

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
             System.exit(0); //fecha o programa
         }

         public void mousePressed(MouseEvent e) {}
         public void mouseReleased(MouseEvent e) {}
     });

   fundomenu.add(bstart);//Para adicionar o botão ao painel
   fundomenu.add(bcomojogar);
   fundomenu.add(bcreditos);
   fundomenu.add(bsair);
   fundotituloinicial.add(tituloinicial);//Para adicionar o texto ao painel
   con.add(fundotituloinicial);//Adiciona o painel
    }
      //método para criar um botão "voltar" nas janelas secundárias
    public JButton botaovoltar(JFrame janelaatual) {
        bvoltar = new JButton("VOLTAR");
        bvoltar.setFont(fontecorpo);
        bvoltar.setBackground(Color.black);
        bvoltar.setForeground(Color.white);
        bvoltar.setFocusPainted(false);
        bvoltar.setBorderPainted(false);
        bvoltar.setContentAreaFilled(false);
        
        bvoltar.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              janela.setVisible(true);
              janelaatual.dispose();
          }
        });
     return bvoltar;
        
    }


    public void abstart(){
        janelastart = new JFrame();
        janelastart.setSize(1000, 700);
        janelastart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelastart.setResizable(false);
        janelastart.getContentPane().setBackground(Color.black);
        janelastart.setLocationRelativeTo(null);
        janelastart.setLayout(null);
        con = janelastart.getContentPane();

        fundojstart = new JPanel();
        fundojstart.setBounds(50, 50, 900, 600);
        fundojstart.setBackground(Color.black);
        InputMap mj = fundojstart.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mj1 = fundojstart.getActionMap();
        mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        mj1.put("enterPressed", new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
        abDialogo1();
        janelastart.dispose();
    }
});

        tstart = new JLabel("Jogo começa...");
        tstart.setForeground(Color.white);
        tstart.setFont(fontecorpo);
        fundojstart.add(tstart);
        janelastart.setVisible(true);
        con.add(fundojstart);
        
  }


    private JLabel criarSistemaVida() {
        JLabel sistemaVida = new JLabel("Vida: " + vida);
        sistemaVida.setForeground(Color.white);
        sistemaVida.setFont(fontedesafios);
        sistemaVida.setBounds(10, 10, 200, 30); // Ajuste conforme necessário
        return sistemaVida;
 }
  public void abDialogo1() { 
  
     janelaDialogo1 = new JFrame("");
     janelaDialogo1.setSize(1000, 700);
     janelaDialogo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janelaDialogo1.setResizable(false);
     janelaDialogo1.getContentPane().setBackground(Color.black);
     janelaDialogo1.setLocationRelativeTo(null);
     janelaDialogo1.setLayout(new BorderLayout());

     fundojDialogo1 = new JPanel();
     fundojDialogo1.setBackground(Color.black);
     fundojDialogo1.setLayout(new BoxLayout(fundojDialogo1, BoxLayout.Y_AXIS));
     fundojDialogo1.setBorder(new EmptyBorder(20, 20, 20, 20));

      String texto = """ 
      Feiticeiro: Bem - vindo à biblioteca kote, o que você deseja encontrar aqui?
      
      Kote: Estou procurando um livro que contenha feitiços antigos. Dizem que ele guarda segredos poderosos.
      
      Feiticeiro: Muito bem, siga para a seção mais profunda da biblioteca. Mas cuidado, alguns feitiços podem ter consequências inesperadas.
      
      Narrador: Kote acena com a cabeça e avança, sentindo a atmosfera mágica ao seu redor enquanto se aproxima da sessão proibida.""";


      textoDi1 = new JTextArea(texto);
      textoDi1.setWrapStyleWord(true);
      textoDi1.setLineWrap(true);
      textoDi1.setOpaque(false);
      textoDi1.setEditable(false);
      textoDi1.setForeground(Color.white);
      textoDi1.setFont(fontecorpo);

 
       fundojDialogo1.add(textoDi1);

        InputMap mj = fundojDialogo1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mj1 = fundojDialogo1.getActionMap();
        mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        mj1.put("enterPressed", new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
        abdesafio1();
        janelaDialogo1.dispose();
        }
     });
  
      janelaDialogo1.getContentPane().add(fundojDialogo1);
      janelaDialogo1.setVisible(true);

     }
     public void abdesafio1(){
        janeladesafio1 = new JFrame("Desafio 1");
        janeladesafio1.setSize(1000, 700);
        janeladesafio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio1.setResizable(false);
        janeladesafio1.getContentPane().setBackground(Color.black);
        janeladesafio1.setLocationRelativeTo(null);
        janeladesafio1.setLayout(null);
        con = janeladesafio1.getContentPane();

        fundodesafio1 = new JPanel();
        fundodesafio1.setBounds(50, 50, 900, 600);
        fundodesafio1.setBackground(Color.black);

        tdesafio1 = new JLabel("<html>Após o encontro com o feiticeiro, Kote vai até a biblioteca do palácio, mas o livro que ele precisa<br> encontra-se em uma área restrita que contém os seguintes requisitos:<br><br>" + //
            "<i> if (!(energia < 5 || foco <= 5) && (habilidadeEspecial || sabedoria > 10)) {</i><br>" + 
            "<i>acessarBiblioteca();</i><br><br>" + 
            "Considere os valores para Kote:<br>" + 
            "Energia: 4<br>Foco: 6<br>Habilidade Especial: desativada<br>Sabedoria: 12<br><br>" + 
            "O que acontece quando Kote tenta acessar a biblioteca?</html>");
        tdesafio1.setForeground(Color.white);
        tdesafio1.setFont(fontedesafios);

        fundoalternativasd1 = new JPanel();
        fundoalternativasd1.setBounds(100, 380, 800, 100);
        fundoalternativasd1.setBackground(Color.black);
        fundoalternativasd1.setLayout( new GridLayout(2,2,10,10));
        con.add(fundoalternativasd1);

        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);

        alternativaadesafio1 = new JButton("A) A biblioteca é acessada.");
        alternativaadesafio1.setFont(fontedesafios);
        alternativaadesafio1.setFocusPainted(false);
        alternativaadesafio1.setBackground(Color.black);
        alternativaadesafio1.setForeground(Color.white);
        alternativaadesafio1.setContentAreaFilled(false);
        alternativaadesafio1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            verificarResposta(false);
        }

     });
        alternativabdesafio1 = new JButton("B) A biblioteca permanece fechada.");
        alternativabdesafio1.setFont(fontedesafios);
        alternativabdesafio1.setFocusPainted(false);
        alternativabdesafio1.setBackground(Color.black);
        alternativabdesafio1.setForeground(Color.white);
        alternativabdesafio1.setContentAreaFilled(false);
        alternativabdesafio1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            verificarResposta(true);
            abDialogo2();
            janeladesafio1.dispose();
            
      }
        
     });
        alternativacdesafio1 = new JButton("C) Kote encontra o livro.");
        alternativacdesafio1.setFont(fontedesafios);
        alternativacdesafio1.setFocusPainted(false);
        alternativacdesafio1.setBackground(Color.black);
        alternativacdesafio1.setForeground(Color.white);
        alternativacdesafio1.setContentAreaFilled(false);
        alternativacdesafio1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
     }
       });
        alternativaddesafio1 = new JButton("D) Kote é banido da biblioteca.");
        alternativaddesafio1.setFont(fontedesafios);
        alternativaddesafio1.setFocusPainted(false);
        alternativaddesafio1.setBackground(Color.black);
        alternativaddesafio1.setForeground(Color.white);
        alternativaddesafio1.setContentAreaFilled(false);
        alternativaddesafio1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
     }
    
     });
        
        fundodesafio1.add(tdesafio1);
        fundoalternativasd1.add(alternativaadesafio1);
        fundoalternativasd1.add(alternativabdesafio1);
        fundoalternativasd1.add(alternativacdesafio1);
        fundoalternativasd1.add(alternativaddesafio1);
        con.add(fundodesafio1);
        janeladesafio1.setVisible(true);  
     }
     public void abDialogo2() { 
  
        janelaDialogo2 = new JFrame("");
        janelaDialogo2.setSize(1000, 700);
        janelaDialogo2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaDialogo2.setResizable(false);
        janelaDialogo2.getContentPane().setBackground(Color.black);
        janelaDialogo2.setLocationRelativeTo(null);
        janelaDialogo2.setLayout(new BorderLayout());
    
    
        fundojDialogo2 = new JPanel();
        fundojDialogo2.setBackground(Color.black);
        fundojDialogo2.setLayout(new BoxLayout(fundojDialogo2, BoxLayout.Y_AXIS));
        fundojDialogo2.setBorder(new EmptyBorder(20, 20, 20, 20));
    
    
      String texto = """ 
          Rei Sebastian: O que você está fazendo por aqui kote?
          Kote: Quero entrar na biblioteca, preciso consultar o livro
          Rei: Venha comigo
          Narrador: Rei sebastian leve kote a até a porta da biblioteca.""";
    
    
    
    
      textoDi2 = new JTextArea(texto);
      textoDi2.setWrapStyleWord(true);
      textoDi2.setLineWrap(true);
      textoDi2.setOpaque(false);
      textoDi2.setEditable(false);
      textoDi2.setForeground(Color.white);
      textoDi2.setFont(fontecorpo2);
    
     
      fundojDialogo2.add(textoDi2);
      
      InputMap mj = fundojDialogo2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
      ActionMap mj1 = fundojDialogo2.getActionMap();
      mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
      mj1.put("enterPressed", new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        abdesafio2();
        janelaDialogo2.dispose();
            }
        });
        janelaDialogo2.getContentPane().add(fundojDialogo2);
        janelaDialogo2.setVisible(true);
     }

     public void abdesafio2() {
        janeladesafio2 = new JFrame("Desafio part2 biblioteca");
        janeladesafio2.setSize(1000, 700);
        janeladesafio2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio2.setResizable(false);
        janeladesafio2.getContentPane().setBackground(Color.black);
        janeladesafio2.setLocationRelativeTo(null);
        janeladesafio2.setLayout(null);
        con = janeladesafio2.getContentPane();

        fundodesafio2 = new JPanel();
        fundodesafio2.setBounds(50, 50, 900, 600);
        fundodesafio2.setBackground(Color.black);

        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);

        tdesafio2 = new JLabel("<html>Sebastian abre a biblioteca para Kote, mas ele precisa descobrir em qual prateleira está o livro<br>" + 
                        "<i>if ((conhecimento > 7 && energia > 5) || (habilidadeEspecial && sabedoria >= 12)) {</i><br>" + 
                        "<i>abrirPrateleira();</i><br><br>" + 
                        "Considere os valores para Kote:<br>" + 
                        "Conhecimento: 8<br>Energia: 6<br>Habilidade Especial: ativada<br>Sabedoria: 10<br><br>" + 
                        "Qual será o resultado da condição?</html>");
        tdesafio2.setForeground(Color.white);
        tdesafio2.setFont(fontedesafios);

        fundoalternativasd2 = new JPanel();
        fundoalternativasd2.setBounds(100, 380, 800, 130);
        fundoalternativasd2.setBackground(Color.black);
        fundoalternativasd2.setLayout( new GridLayout(2,2,10,10));
        con.add(fundoalternativasd2);

        alternativaad2 = new JButton("A) Kote consegue abrir a prateleira");
        alternativaad2.setFont(fontedesafios);
        alternativaad2.setFocusPainted(false);
        alternativaad2.setBackground(Color.black);
        alternativaad2.setForeground(Color.white);
        alternativaad2.setContentAreaFilled(false);
        alternativaad2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(true);
                abDialogo3();
                janeladesafio2.dispose();
            }
        });

        alternativabd2 = new JButton("B) Kote não consegue abrir a prateleira");
        alternativabd2.setBounds(400, 400, 500, 50);
        alternativabd2.setFont(fontedesafios);
        alternativabd2.setFocusPainted(false);
        alternativabd2.setBackground(Color.black);
        alternativabd2.setForeground(Color.white);
        alternativabd2.setContentAreaFilled(false);
        alternativabd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });

        alternativacd2 = new JButton("<html>C) Kote consegue abrir a<br> prateleira mas não acha o livro</html>");
        alternativacd2.setBounds(100, 500, 400, 50);
        alternativacd2.setFont(fontedesafios);
        alternativacd2.setFocusPainted(false);
        alternativacd2.setBackground(Color.black);
        alternativacd2.setForeground(Color.white);
        alternativacd2.setContentAreaFilled(false);
        alternativacd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               verificarResposta(false);
            }
        });

        alternativadd2 = new JButton("<html>D) Kote é transportado<br> para o portal do tempo</html>");
        alternativadd2.setBounds(500, 500, 400, 50);
        alternativadd2.setFont(fontedesafios);
        alternativadd2.setFocusPainted(false);
        alternativadd2.setBackground(Color.black);
        alternativadd2.setForeground(Color.white);
        alternativadd2.setContentAreaFilled(false);
        alternativadd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });

        fundodesafio2.add(tdesafio2);
        fundoalternativasd2.add(alternativaad2);
        fundoalternativasd2.add(alternativabd2);
        fundoalternativasd2.add(alternativacd2);
        fundoalternativasd2.add(alternativadd2);
        con.add(fundodesafio2);
        janeladesafio2.setVisible(true);
     }
     public void abDialogo3() { 
        janelaDialogo3 = new JFrame("");
        janelaDialogo3.setSize(1000, 700);
        janelaDialogo3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaDialogo3.setResizable(false);
        janelaDialogo3.getContentPane().setBackground(Color.black);
        janelaDialogo3.setLocationRelativeTo(null);
        janelaDialogo3.setLayout(new BorderLayout());
    
        fundojDialogo3 = new JPanel();
        fundojDialogo3.setBackground(Color.black);
        fundojDialogo3.setLayout(new BoxLayout(fundojDialogo3, BoxLayout.Y_AXIS));
        fundojDialogo3.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        String texto = """ 
            Rei Sebastian: O que você está fazendo por aqui, Kote?
            Kote: Quero entrar na biblioteca, preciso consultar o livro.
            Rei: Venha comigo.
            Narrador: Rei Sebastian leva Kote até a porta da biblioteca.
        """;
    
        textoDi3 = new JTextArea(texto);
        textoDi3.setWrapStyleWord(true);
        textoDi3.setLineWrap(true);
        textoDi3.setOpaque(false);
        textoDi3.setEditable(false);
        textoDi3.setForeground(Color.white);
        textoDi3.setFont(fontecorpo2);
    
        fundojDialogo3.add(textoDi3);
    
         InputMap mj = fundojDialogo3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
         ActionMap mj1 = fundojDialogo3.getActionMap();
         mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
         mj1.put("enterPressed", new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            abdesafio3(); 
            janelaDialogo3.dispose();
             }
        });
    
        janelaDialogo3.getContentPane().add(fundojDialogo3);
        janelaDialogo3.setVisible(true);
    
     }

     public void abdesafio3(){
        janeladesafio3 = new JFrame("Desafio 3");
        janeladesafio3.setSize(1000, 700);
        janeladesafio3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio3.setResizable(false);
        janeladesafio3.getContentPane().setBackground(Color.black);
        janeladesafio3.setLocationRelativeTo(null);
        janeladesafio3.setLayout(null);
        con = janeladesafio3.getContentPane();

        fundodesafio3 = new JPanel();
        fundodesafio3.setBounds(50, 50, 900, 600);
        fundodesafio3.setBackground(Color.black);

        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);

        tdesafio3 = new JLabel("<html>Em uma noite sombria, Kote recebe um chamado de emergência.<br><br>" + 
                        "O reino de Noxterra, um reino noturno onde a lua ilumina segredos e conhecimentos antigos,<br>" + 
                        "abriga o Diário de Arquimedes, uma escrita ancestral que contém segredos poderosos sobre a<br>" + 
                        "manipulação do tempo, porém,  a tranquilidade do reino foi perturbada por uma nova ameaça<br>" + 
                        "o  diário de Arquimedes foi roubado pela a facção do rei o purgatório.Se eles não forem<br> impedidos o equilíbrio do mundo será destruído.<br><br>" + 
                        "Agora, kote embarca em uma jornada através do tempo voltando ao passado para recuperar o<br> diário de Arquimedes antes do purgatório.<br><br>" +
                        "PERGUNTA: WHILE é uma estrutura de repetição que executa  um conjunto de comandos múltiplas vezes?</html>");
        tdesafio3.setForeground(Color.white);
        tdesafio3.setFont(fontedesafios);
        tdesafio3.setVerticalAlignment(SwingConstants.TOP);
        

        fundoalternativasd3 = new JPanel();
        fundoalternativasd3.setBounds(100, 380, 800, 140);
        fundoalternativasd3.setBackground(Color.black);
        fundoalternativasd3.setLayout(new GridLayout(2, 2, 10, 10));
        con.add(fundoalternativasd3);

        alternativaad3 = new JButton("<html>A) Não, while não é uma estrutura de<br> repetição e sim uma classe do java.</html>");
        alternativaad3.setFont(fontedesafios);
        alternativaad3.setFocusPainted(false);
        alternativaad3.setBackground(Color.black);
        alternativaad3.setForeground(Color.white);
        alternativaad3.setContentAreaFilled(false);
        alternativaad3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                verificarResposta(false);
            }
        });
        alternativabd3 = new JButton("<html>B) Não, while não é uma estrutura<br> de repetição e sim uma condicional.</html>");
        alternativabd3.setBounds(400, 400, 500, 50);
        alternativabd3.setFont(fontedesafios);
        alternativabd3.setFocusPainted(false);
        alternativabd3.setBackground(Color.black);
        alternativabd3.setForeground(Color.white);
        alternativabd3.setContentAreaFilled(false);
        alternativabd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
        alternativacd3 = new JButton("<html>C) Sim, o while é uma estrutura de repetição<br> e executa quando já é determinado o número de repetições.</html>");
        alternativacd3.setBounds(100, 500, 400, 50);
        alternativacd3.setFont(fontedesafios);
        alternativacd3.setFocusPainted(false);
        alternativacd3.setBackground(Color.black);
        alternativacd3.setForeground(Color.white);
        alternativacd3.setContentAreaFilled(false);
        alternativacd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
        alternativadd3 = new JButton("<html>D) Sim, while é uma estrutura de repetição<br> e executa quando a condição for verdadeira</html>");
        alternativadd3.setBounds(500, 500, 400, 50);
        alternativadd3.setFont(fontedesafios);
        alternativadd3.setFocusPainted(false);
        alternativadd3.setBackground(Color.black);
        alternativadd3.setForeground(Color.white);
        alternativadd3.setContentAreaFilled(false);
        alternativadd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(true);
                abDialogo4();
                janeladesafio3.dispose();
            }
        });
        fundodesafio3.add(tdesafio3);
        fundoalternativasd3.add(alternativaad3);
        fundoalternativasd3.add(alternativabd3);
        fundoalternativasd3.add(alternativacd3);
        fundoalternativasd3.add(alternativadd3);
        con.add(fundodesafio3);
        janeladesafio3.setVisible(true);

     }
     public void abDialogo4() {
        janelaDialogo4 = new JFrame("");
        janelaDialogo4.setSize(1000, 700);
        janelaDialogo4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaDialogo4.setResizable(false);
        janelaDialogo4.getContentPane().setBackground(Color.black);
        janelaDialogo4.setLocationRelativeTo(null);
        janelaDialogo4.setLayout(new BorderLayout());
    
        // Painel de fundo do diálogo
        fundojDialogo4 = new JPanel();
        fundojDialogo4.setBackground(Color.black);
        fundojDialogo4.setLayout(new BoxLayout(fundojDialogo4, BoxLayout.Y_AXIS));
        fundojDialogo4.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        // Texto do diálogo
        String texto = """ 
        Guardião da biblioteca de Noxxtera: ” - Bem-vindo, Kote, O tempo aqui não é linear, o Diário de Arquimedes está escondido dentro deste baú. Mas para abri-lo, você precisará decifrar o código que mantém o baú fechado.  
        Kote: Um código... isso não será fácil. Que tipo de enigma poderia proteger algo tão poderoso?
        Guardião da Biblioteca de Noxxterra: O código é uma série de perguntas sobre o tempo e os eventos que moldaram este reino.
        Kote: Entendi. Preciso me lembrar da história de Noxterra e de seus segredos.""";
    
        textodi4 = new JTextArea(texto);
        textodi4.setWrapStyleWord(true);
        textodi4.setLineWrap(true);
        textodi4.setOpaque(false);
        textodi4.setEditable(false);
        textodi4.setForeground(Color.white);
        textodi4.setFont(fontecorpo2);
    
        fundojDialogo4.add(textodi4);
    
        // Mapeamento de tecla Enter para avançar
        InputMap mj = fundojDialogo4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mj1 = fundojDialogo4.getActionMap();
        mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        mj1.put("enterPressed", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                abdesafio4(); 
                janelaDialogo4.dispose();
            }
        });
    
        janelaDialogo4.getContentPane().add(fundojDialogo4);
        janelaDialogo4.setVisible(true);
    }
    
    public void abdesafio4(){
        janeladesafio4 = new JFrame("Desafio 4");
        janeladesafio4.setSize(1000, 700);
        janeladesafio4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio4.setResizable(false);
        janeladesafio4.getContentPane().setBackground(Color.black);
        janeladesafio4.setLocationRelativeTo(null);
        janeladesafio4.setLayout(null);
        con = janeladesafio4.getContentPane();

        fundodesafio4 = new JPanel();
        fundodesafio4.setBounds(50, 50, 900, 600);
        fundodesafio4.setBackground(Color.black);
        fundodesafio4.setLayout(new BorderLayout());

        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);

        tdesafio4 = new JLabel("<html>Assim que kote chega ao passado, ele vai direto para a biblioteca principal de Noxxterra, uma imensa estrutura de paredes de pedra e livros antigos<br>" + 
                        "O ambiente é iluminado pelo luar da lua, e um ar misterioso envolve o lugar.<br>" + 
                        "No centro da biblioteca, ele encontra um feiticeiro, uma figura imponente coberta por uma capa de tecido mágico que brilha levemente.<br>" + 
                        "Bem-vindo, Kote, O tempo aqui não é linear, o Diário de Arquimendes está escondido dentro deste baú. Mas para abri-lo, você precisará decifrar o código que mantém o baú fechado.<br>" + 
                        "Somente aqueles que dominam os loops do tempo,  poderão abri-lo.<br>" + 
                        "Você encontrará o código abaixo gravado na lateral do baú.<br>" + 
                        "Este baú está protegido por um feitiço de repetição. O código está escrito nas runas. Decifre-o: o valor de x começa em 10 e diminui continuamente,<br><br>" + 
                        "<i> qual será o valor final de x ao sair do ciclo?</i><br>" + 
                        "<i> int x = 10; </i><br> " +
                        "do { <br>" + 
                        "x =  x - 2;<br>" +
                        "} while (x > 3);</html>");
        tdesafio4.setForeground(Color.white);
        tdesafio4.setFont(fontedesafios);
        tdesafio4.setVerticalAlignment(SwingConstants.TOP);
        tdesafio4.setHorizontalAlignment(SwingConstants.LEFT);
        fundodesafio4.add(tdesafio4, BorderLayout.NORTH);


        fundoalternativasd4 = new JPanel();
        fundoalternativasd4.setBounds(100,480, 800, 140);
        fundoalternativasd4.setBackground(Color.black);
        fundoalternativasd4.setLayout(new GridLayout(2, 2, 10, 10));
        con.add(fundoalternativasd4);

        alternativaad4 = new JButton("A) 2");
        alternativaad4.setFont(fontedesafios);
        alternativaad4.setFocusPainted(false);
        alternativaad4.setBackground(Color.black);
        alternativaad4.setForeground(Color.white);
        alternativaad4.setContentAreaFilled(false);
        alternativaad4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                verificarResposta(true);
                abDialogo5();
                janeladesafio4.dispose();
            }
        });
        alternativabd4 = new JButton("B) 4");
        alternativabd4.setBounds(400, 400, 500, 50);
        alternativabd4.setFont(fontedesafios);
        alternativabd4.setFocusPainted(false);
        alternativabd4.setBackground(Color.black);
        alternativabd4.setForeground(Color.white);
        alternativabd4.setContentAreaFilled(false);
        alternativabd4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
        alternativacd4 = new JButton("C) 3");
        alternativacd4.setBounds(100, 500, 400, 50);
        alternativacd4.setFont(fontedesafios);
        alternativacd4.setFocusPainted(false);
        alternativacd4.setBackground(Color.black);
        alternativacd4.setForeground(Color.white);
        alternativacd4.setContentAreaFilled(false);
        alternativacd4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
        alternativadd4 = new JButton("D) 4");
        alternativadd4.setBounds(500, 500, 400, 50);
        alternativadd4.setFont(fontedesafios);
        alternativadd4.setFocusPainted(false);
        alternativadd4.setBackground(Color.black);
        alternativadd4.setForeground(Color.white);
        alternativadd4.setContentAreaFilled(false);
        alternativadd4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
        fundodesafio4.add(tdesafio4);
        fundoalternativasd4.add(alternativaad4);
        fundoalternativasd4.add(alternativabd4);
        fundoalternativasd4.add(alternativacd4);
        fundoalternativasd4.add(alternativadd4);
        con.add(fundodesafio4);
        janeladesafio4.setVisible(true);
    }
    public void abDialogo5() { 
        janelaDialogo5 = new JFrame("");
        janelaDialogo5.setSize(1000, 700);
        janelaDialogo5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaDialogo5.setResizable(false);
        janelaDialogo5.getContentPane().setBackground(Color.black);
        janelaDialogo5.setLocationRelativeTo(null);
        janelaDialogo5.setLayout(new BorderLayout());
    
        // Painel de fundo do diálogo
        fundojDialogo5 = new JPanel();
        fundojDialogo5.setBackground(Color.black);
        fundojDialogo5.setLayout(new BoxLayout(fundojDialogo5, BoxLayout.Y_AXIS));
        fundojDialogo5.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        // Texto do diálogo
        String texto = """ 
            Narrador: Após horas de leitura, Kote encontra um ritual que o permite viajar no tempo, mas é preciso um sacrifício: uma memória querida.
            Kote: (pensando) Uma memória? Isso é arriscado... mas eu não posso falhar. O reino está em perigo.
            Narrador: Ele fecha os olhos, lembrando-se de momentos felizes com seus amigos e família, pesando a dor da possível perda.
            Kote: (resoluto) Eu farei isso. O futuro de Olin é mais importante.
            Narrador: Com determinação, Kote reúne os ingredientes necessários e começa a traçar o círculo mágico no chão.
        """;
    
        textodi5 = new JTextArea(texto);
        textodi5.setWrapStyleWord(true);
        textodi5.setLineWrap(true);
        textodi5.setOpaque(false);
        textodi5.setEditable(false);
        textodi5.setForeground(Color.white);
        textodi5.setFont(fontecorpo2);
    
        fundojDialogo5.add(textodi5);
    
        // Mapeamento de tecla Enter para avançar
        InputMap mj = fundojDialogo5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mj1 = fundojDialogo5.getActionMap();
        mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        mj1.put("enterPressed", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                abdesafio5(); 
                janelaDialogo5.dispose();
            }
        });
    
        janelaDialogo5.getContentPane().add(fundojDialogo5);
        janelaDialogo5.setVisible(true);
    }
    

    public void abdesafio5() {
    janeladesafio5 = new JFrame("Desafio 5");
    janeladesafio5.setSize(1000, 700);
    janeladesafio5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladesafio5.setResizable(false);
    janeladesafio5.getContentPane().setBackground(Color.black);
    janeladesafio5.setLocationRelativeTo(null);
    janeladesafio5.setLayout(null);
    con = janeladesafio5.getContentPane();

    fundodesafio5 = new JPanel();
    fundodesafio5.setBounds(50, 50, 900, 600);
    fundodesafio5.setBackground(Color.black);
    fundodesafio5.setLayout(new BorderLayout());

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio5 = new JLabel("<html>Com o Diário de Arquimendes finalmente em mãos, Kote sente o poder e o conhecimento antigo fluindo através dele.<br>" + 
                    "páginas brilham com runas misteriosas que começam a se reorganizar em um idioma compreensível<br>" + 
                    "Mas o tempo é curto, e ele sabe que precisa voltar ao futuro antes que o portal se feche para sempre.<br>" + 
                    "Ele se posiciona no centro da sala, cercado pela energia mágica que emana do diário, e se prepara para realizar o feitiço de retorno temporal.<br><br>" + 
                    "KOTE: respira fundo, fecha os olhos, e começa a invocar seu poder mágico. Ele sabe que tem que se concentrar profundamente, pois o sucesso da viagem depende da precisão de sua conjuração.<br>" + 
                    "KOTE: Um... dois.. três<br><br>" + 
                    "PERGUNTA: Qual das seguintes afirmações define corretamente quando se utiliza um laço FOR?</html>");
    tdesafio5.setForeground(Color.white);
    tdesafio5.setFont(fontedesafios);
    tdesafio5.setVerticalAlignment(SwingConstants.TOP);
    tdesafio5.setHorizontalAlignment(SwingConstants.LEFT);
    fundodesafio5.add(tdesafio5, BorderLayout.NORTH);

    fundoalternativasd5 = new JPanel();
    fundoalternativasd5.setBounds(100, 380, 800, 160);
    fundoalternativasd5.setBackground(Color.black);
    fundoalternativasd5.setLayout(new GridLayout(2, 2, 10, 10));
    con.add(fundoalternativasd5); // Adicionei a posição no BorderLayout

    alternativaad5 = new JButton("<html>A) É utilizado quando não se sabe exatamente quantas vezes o código será repetido.</html>");
    alternativaad5.setFont(fontedesafios);
    alternativaad5.setFocusPainted(false);
    alternativaad5.setBackground(Color.black);
    alternativaad5.setForeground(Color.white);
    alternativaad5.setContentAreaFilled(false);
    alternativaad5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });

    alternativabd5 = new JButton("<html>B) É utilizado quando se sabe o<br> número de repetições.</html>");
    alternativabd5.setFont(fontedesafios);
    alternativabd5.setFocusPainted(false);
    alternativabd5.setBackground(Color.black);
    alternativabd5.setForeground(Color.white);
    alternativabd5.setContentAreaFilled(false);
    alternativabd5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(true);
            abDialogo6();
            janeladesafio5.dispose();
        }
    });

    alternativacd5 = new JButton("<html>C) É utilizado quando uma condição<br> é true/verdadeira.</html>");
    alternativacd5.setFont(fontedesafios);
    alternativacd5.setFocusPainted(false);
    alternativacd5.setBackground(Color.black);
    alternativacd5.setForeground(Color.white);
    alternativacd5.setContentAreaFilled(false);
    alternativacd5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });

    alternativadd5 = new JButton("<html>D) É utilizado quando uma condição é true/verdadeira mas a essa condição é<br> verificada apenas no final da repetição.</html>");
    alternativadd5.setFont(fontedesafios);
    alternativadd5.setFocusPainted(false);
    alternativadd5.setBackground(Color.black);
    alternativadd5.setForeground(Color.white);
    alternativadd5.setContentAreaFilled(false);
    alternativadd5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });

    fundoalternativasd5.add(alternativaad5);
    fundoalternativasd5.add(alternativabd5);
    fundoalternativasd5.add(alternativacd5);
    fundoalternativasd5.add(alternativadd5);
    con.add(fundodesafio5);
    janeladesafio5.setVisible(true);
}
public void abDialogo6() { 
    janelaDialogo6 = new JFrame("Dialogo 6");
    janelaDialogo6.setSize(1000, 700);
    janelaDialogo6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janelaDialogo6.setResizable(false);
    janelaDialogo6.getContentPane().setBackground(Color.black);
    janelaDialogo6.setLocationRelativeTo(null);
    janelaDialogo6.setLayout(new BorderLayout());


    fundojDialogo6 = new JPanel();
    fundojDialogo6.setBackground(Color.black);
    fundojDialogo6.setLayout(new BoxLayout(fundojDialogo6, BoxLayout.Y_AXIS));
    fundojDialogo6.setBorder(new EmptyBorder(20, 20, 20, 20));


  String texto = """ 
    Narrador: Kote continua lendo o diário para descobrir o verdadeiro motivo da guerra.
    Feiticeiro: Você conseguiu descobrir a verdade?
    Kote: São tantas verdadeiras que desacredito qual seja a verdade.
    Feiticeiro: A verdade é aquela que você mais acredita.
    Kote: Eu acredito que o Sebastian seja uma boa pessoa e esteja seguindo os passos do pai.
    Feiticeiro: Isso é uma boa verdade.
    """;

  textoDi6 = new JTextArea(texto);
  textoDi6.setWrapStyleWord(true);
  textoDi6.setLineWrap(true);
  textoDi6.setOpaque(false);
  textoDi6.setEditable(false);
  textoDi6.setForeground(Color.white);
  textoDi6.setFont(fontecorpo2);


 
  fundojDialogo6.add(textoDi6);


  InputMap mj = fundojDialogo6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
  ActionMap mj1 = fundojDialogo6.getActionMap();
  mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
  mj1.put("enterPressed", new AbstractAction() {
  public void actionPerformed(ActionEvent e) {
    abdesafio6();
    janelaDialogo6.dispose();
   }
  });

  janelaDialogo6.getContentPane().add(fundojDialogo6);
  janelaDialogo6.setVisible(true);

}
public void abdesafio6(){
    janeladesafio6 = new JFrame("Desafio 6"); 
    janeladesafio6.setSize(1000, 700);
    janeladesafio6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladesafio6.setResizable(false);
    janeladesafio6.getContentPane().setBackground(Color.black);
    janeladesafio6.setLocationRelativeTo(null);
    janeladesafio6.setLayout(null);
    con = janeladesafio6.getContentPane();

    fundodesafio6 = new JPanel();
    fundodesafio6.setBounds(50, 50, 900, 600);
    fundodesafio6.setBackground(Color.black);
    fundodesafio6.setLayout(new BorderLayout()); 

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio6 = new JLabel("<html>Os Guardiões do Tempo aparecem diante do guerreiro e dizem:<br><br>" +
        "Para provar sua coragem e sabedoria, responda: Qual estrutura de controle é usada para decidir<br>" +  
        "se um bloco de código deve ser executado com base em uma condição específica?</html>");
    tdesafio6.setForeground(Color.white);
    tdesafio6.setFont(fontedesafios);
    tdesafio6.setVerticalAlignment(SwingConstants.TOP);
    tdesafio6.setHorizontalAlignment(SwingConstants.LEFT);  // Corrigido para tdesafio6
    fundodesafio6.add(tdesafio6, BorderLayout.NORTH); 

    fundoalternativasd6 = new JPanel();
    fundoalternativasd6.setBounds(100, 380, 800, 100);
    fundoalternativasd6.setBackground(Color.black);
    fundoalternativasd6.setLayout(new GridLayout(2, 2, 10, 10)); 
    con.add(fundoalternativasd6);

    JButton alternativaad6 = new JButton("A) For");
    alternativaad6.setFont(fontedesafios);
    alternativaad6.setFocusPainted(false);
    alternativaad6.setBackground(Color.black);
    alternativaad6.setForeground(Color.white);
    alternativaad6.setContentAreaFilled(false);
    alternativaad6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });

    JButton alternativabd6 = new JButton("B) If");
    alternativabd6.setFont(fontedesafios);
    alternativabd6.setFocusPainted(false);
    alternativabd6.setBackground(Color.black);
    alternativabd6.setForeground(Color.white);
    alternativabd6.setContentAreaFilled(false);
    alternativabd6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });

    JButton alternativacd6 = new JButton("C) Else");
    alternativacd6.setFont(fontedesafios);
    alternativacd6.setFocusPainted(false);
    alternativacd6.setBackground(Color.black);
    alternativacd6.setForeground(Color.white);
    alternativacd6.setContentAreaFilled(false);
    alternativacd6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            verificarResposta(true);
            abDialogo7();
            janeladesafio6.dispose();  // Corrigido o nome da janela aqui
            }
        });

    JButton alternativadd6 = new JButton("D) Do-while");
    alternativadd6.setFont(fontedesafios);
    alternativadd6.setFocusPainted(false);
    alternativadd6.setBackground(Color.black);
    alternativadd6.setForeground(Color.white);
    alternativadd6.setContentAreaFilled(false);
    alternativadd6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });

    fundoalternativasd6.add(alternativaad6);
    fundoalternativasd6.add(alternativabd6);
    fundoalternativasd6.add(alternativacd6);
    fundoalternativasd6.add(alternativadd6);
    con.add(fundodesafio6);
    janeladesafio6.setVisible(true);
}
public void abDialogo7() { 
    janelaDialogo7 = new JFrame("Diálogo 7");
    janelaDialogo7.setSize(1000, 700);
    janelaDialogo7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janelaDialogo7.setResizable(false);
    janelaDialogo7.getContentPane().setBackground(Color.black);
    janelaDialogo7.setLocationRelativeTo(null);
    janelaDialogo7.setLayout(new BorderLayout());

    fundojDialogo7 = new JPanel();
    fundojDialogo7.setBackground(Color.black);
    fundojDialogo7.setLayout(new BoxLayout(fundojDialogo7, BoxLayout.Y_AXIS));
    fundojDialogo7.setBorder(new EmptyBorder(20, 20, 20, 20));

    String texto = """ 
        Narrador: Kote está dividido entre salvar o seu amigo ou matar o rei.
        Kote: Como irei salvar o meu amigo e o rei ao mesmo tempo?
        Feiticeiro: Pense, Kote! O que realmente está em jogo? A vida de um homem ou o futuro de muitos?
        """;

    textodi7 = new JTextArea(texto);
    textodi7.setWrapStyleWord(true);
    textodi7.setLineWrap(true);
    textodi7.setOpaque(false);
    textodi7.setEditable(false);
    textodi7.setForeground(Color.white);
    textodi7.setFont(fontecorpo2);

    fundojDialogo7.add(textodi7);
    janelaDialogo7.add(fundojDialogo7, BorderLayout.CENTER); // Certifica-se de adicionar o painel à janela

    // Configura a tecla Enter para abrir o próximo desafio
    InputMap mj = fundojDialogo7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    ActionMap mj1 = fundojDialogo7.getActionMap();
    mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
    mj1.put("enterPressed", new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            abdesafio7();
            janelaDialogo7.dispose();
        }
    });
    janelaDialogo7.getContentPane().add(fundojDialogo7);
    janelaDialogo7.setVisible(true); // Exibe a janela
}

    public void abdesafio7() {
        janeladesafio7 = new JFrame("Desafio 7"); 
        janeladesafio7.setSize(1000, 700);
        janeladesafio7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio7.setResizable(false);
        janeladesafio7.getContentPane().setBackground(Color.black);
        janeladesafio7.setLocationRelativeTo(null);
        janeladesafio7.setLayout(null);
        con = janeladesafio7.getContentPane();

        fundodesafio7 = new JPanel();
        fundodesafio7.setBounds(50, 50, 900, 600);
        fundodesafio7.setBackground(Color.black);
        fundodesafio7.setLayout(new BorderLayout());

        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);

        tdesafio7 = new JLabel("<html>Os Guardiões do Tempo surgem e desafiam o guerreiro: };");
        tdesafio7.setForeground(Color.white);
        tdesafio7.setFont(fontedesafios);
        fundodesafio7.add(tdesafio7, BorderLayout.NORTH); 

        fundoalternativasd7 = new JPanel();
        fundoalternativasd7.setBounds(100, 380, 800, 100);
        fundoalternativasd7.setBackground(Color.black);
        fundoalternativasd7.setLayout(new GridLayout(2, 2, 10, 10)); 

        alternativaad7 = new JButton("A) else");
        alternativaad7.setFont(fontedesafios);
        alternativaad7.setFocusPainted(false);
        alternativaad7.setBackground(Color.black);
        alternativaad7.setForeground(Color.white);
        alternativaad7.setContentAreaFilled(false);
        alternativaad7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(true);
                abDialogo8();
                janeladesafio7.dispose();
            }
         });
        alternativabd7 = new JButton("B) switch");
        alternativabd7.setFont(fontedesafios);
        alternativabd7.setFocusPainted(false);
        alternativabd7.setBackground(Color.black);
        alternativabd7.setForeground(Color.white);
        alternativabd7.setContentAreaFilled(false);
        alternativabd7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               verificarResposta(false);
            }
        });
        alternativacd7 = new JButton("C) for ");
        alternativacd7.setFont(fontedesafios);
        alternativacd7.setFocusPainted(false);
        alternativacd7.setBackground(Color.black);
        alternativacd7.setForeground(Color.white);
        alternativacd7.setContentAreaFilled(false);
        alternativacd7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
        alternativadd7 = new JButton("D) break");
        alternativadd7.setFont(fontedesafios);
        alternativadd7.setFocusPainted(false);
        alternativadd7.setBackground(Color.black);
        alternativadd7.setForeground(Color.white);
        alternativadd7.setContentAreaFilled(false);
        alternativadd7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarResposta(false);
            }
        });
          
        fundoalternativasd7.add(alternativaad7);
        fundoalternativasd7.add(alternativabd7);
        fundoalternativasd7.add(alternativacd7);
        fundoalternativasd7.add(alternativadd7);
        con.add(fundodesafio7);
        con.add(fundoalternativasd7);
            
        janeladesafio7.setVisible(true);
}
public void abDialogo8() { 
  
    janelaDialogo8 = new JFrame("Dialogo 8");
    janelaDialogo8.setSize(1000, 700);
    janelaDialogo8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janelaDialogo8.setResizable(false);
    janelaDialogo8.getContentPane().setBackground(Color.black);
    janelaDialogo8.setLocationRelativeTo(null);
    janelaDialogo8.setLayout(new BorderLayout());


    fundojDialogo8 = new JPanel();
    fundojDialogo8.setBackground(Color.black);
    fundojDialogo8.setLayout(new BoxLayout(fundojDialogo8, BoxLayout.Y_AXIS));
    fundojDialogo8.setBorder(new EmptyBorder(20, 20, 20, 20));


  String texto = """ 
    Narrador: Kote respira fundo, sentindo a energia pulsante ao seu redor. Ele está prestes a fazer algo que pode mudar tudo.
    Kote: (determinado) "Eu não posso falhar. O reino precisa de mim."
    Narrador: Ele fecha os olhos novamente, a dor da memória se intensificando. Uma imagem clara surge em sua mente: uma tarde ensolarada com seus amigos, rindo e brincando. Ele aperta os punhos, lutando contra a tristeza.
    Kote: (sussurrando) "Eu farei isso. Uma memória por muitas vidas… vale a pena."
    Narrador: Com um gesto ágil, Kote levanta as mãos e começa a entoar as palavras do ritual, cada sílaba vibrando com poder. O ar ao seu redor parece se contrair e expandir, como se o próprio tempo estivesse ouvindo.
    Narrador: Enquanto as palavras mágicas ecoam na sala, uma luz intensa irrompe do círculo, envolvendo-o em um brilho ofuscante. A sensação de perda se intensifica, como se uma parte de sua essência estivesse sendo arrancada.
    Narrador: De repente, a luz se transforma em um turbilhão, e Kote sente seu corpo sendo puxado para um outro lugar e tempo. O último vislumbre que tem é da biblioteca, se dissipando como fumaça.
    """;

  textodi8 = new JTextArea(texto);
  textodi8.setWrapStyleWord(true);
  textodi8.setLineWrap(true);
  textodi8.setOpaque(false);
  textodi8.setEditable(false);
  textodi8.setForeground(Color.white);
  textodi8.setFont(fontecorpo2);


 
  fundojDialogo8.add(textodi8);


  InputMap mj = fundojDialogo8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
  ActionMap mj1 = fundojDialogo8.getActionMap();
  mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
  mj1.put("enterPressed", new AbstractAction() {
public void actionPerformed(ActionEvent e) {
  abseudesafio8();
  janelaDialogo8.dispose();
}
});

  
  janelaDialogo8.getContentPane().add(fundojDialogo8);
  janelaDialogo8.setVisible(true);
}
  
  public void abseudesafio8() {
    janeladesafio8 = new JFrame("Desafio 8"); 
    janeladesafio8.setSize(1000, 700);
    janeladesafio8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladesafio8.setResizable(false);
    janeladesafio8.getContentPane().setBackground(Color.black);
    janeladesafio8.setLocationRelativeTo(null);
    janeladesafio8.setLayout(null);
    con = janeladesafio8.getContentPane();

    fundodesafio8 = new JPanel();
    fundodesafio8.setBounds(50, 50, 900, 600);
    fundodesafio8.setBackground(Color.black);
    fundodesafio8.setLayout(new BorderLayout()); 

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio8 = new JLabel("<html>Cenário: Kote está prestes a entrar em uma batalha e precisa decidir sua ação com base em seu nível de energia.<br><br>" +
                    "Instrução: Determine qual ação Kote deve tomar de acordo com as seguintes condições:<br>" +
 
                    "Se o nível de energia de Kote for maior que 50:<br>" +
                    "Kote decide atacar o inimigo.<br>" +
                    "Se o nível de energia de Kote estiver entre 21 e 50 (inclusive):<br>" +
                    "Kote decide se defender.<br> " +
                    "Se o nível de energia de Kote for 20 ou menos:<br> " +
                    "Kote decide fugir da batalha. <br>" +
                    "Pergunta:<br>" +
                    "Qual ação Kote deve tomar se seu nível de energia for 45?;</html>");
    tdesafio8.setForeground(Color.white);
    tdesafio8.setFont(fontedesafios);
    fundodesafio8.add(tdesafio8, BorderLayout.NORTH); 

    fundoalternativasd8 = new JPanel();
    fundoalternativasd8.setBounds(100, 380, 800, 100);
    fundoalternativasd8.setBackground(Color.black);
    fundoalternativasd8.setLayout(new GridLayout(2, 2, 10, 10)); 

    alternativaad8 = new JButton("A) atacar");
    alternativaad8.setFont(fontedesafios);
    alternativaad8.setFocusPainted(false);
    alternativaad8.setBackground(Color.black);
    alternativaad8.setForeground(Color.white);
    alternativaad8.setContentAreaFilled(false);
    alternativaad8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           verificarResposta(false);
        }
    });
    alternativabd8 = new JButton("B) defender");
    alternativabd8.setFont(fontedesafios);
    alternativabd8.setFocusPainted(false);
    alternativabd8.setBackground(Color.black);
    alternativabd8.setForeground(Color.white);
    alternativabd8.setContentAreaFilled(false);
    alternativabd8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(true);
            abDialogo9();
            janeladesafio8.dispose();
        }
    });

    alternativacd8 = new JButton("C) fugir ");
    alternativacd8.setFont(fontedesafios);
    alternativacd8.setFocusPainted(false);
    alternativacd8.setBackground(Color.black);
    alternativacd8.setForeground(Color.white);
    alternativacd8.setContentAreaFilled(false);
    alternativacd8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });
    alternativadd8 = new JButton("D) parado");
    alternativadd8.setFont(fontedesafios);
    alternativadd8.setFocusPainted(false);
    alternativadd8.setBackground(Color.black);
    alternativadd8.setForeground(Color.white);
    alternativadd8.setContentAreaFilled(false);
    alternativadd8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });
  
    fundoalternativasd8.add(alternativaad8);
    fundoalternativasd8.add(alternativabd8);
    fundoalternativasd8.add(alternativacd8);
    fundoalternativasd8.add(alternativadd8);
    con.add(fundodesafio8);
    con.add(fundoalternativasd8);
    
    janeladesafio8.setVisible(true);
}
public void abDialogo9() { 
  
    janelaDialogo9 = new JFrame("Dialogo 9");
    janelaDialogo9.setSize(1000, 700);
    janelaDialogo9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janelaDialogo9.setResizable(false);
    janelaDialogo9.getContentPane().setBackground(Color.black);
    janelaDialogo9.setLocationRelativeTo(null);
    janelaDialogo9.setLayout(new BorderLayout());


    fundojDialogo9 = new JPanel();
    fundojDialogo9.setBackground(Color.black);
    fundojDialogo9.setLayout(new BoxLayout(fundojDialogo9, BoxLayout.Y_AXIS));
    fundojDialogo9.setBorder(new EmptyBorder(20, 20, 20, 20));


  String texto = """ 
    Narrador: Kote ressurge em uma sala principal, onde o Rei Sebastian aguarda, cercado por guardas e uma aura de poder. A tensão no ar é palpável.
    Kote: "Rei Sebastian, “O Diário de Arquimedes é uma fonte de poder perigosa, e você não pode usá-lo dessa forma!"
    Rei Sebastian: Com um sorriso desdenhoso "E quem é você para me dizer o que fazer? O poder é um direito do rei”.
    Kote: "Proteger? Você está apenas alimentando sua ambição. O que acontecerá quando esse poder corromper sua essência? As vidas de inocentes estarão em suas mãos."
    Rei Sebastian: "Eu conheço meu dever! Este reino precisa de força, e o diário me dará isso. Você é ingênuo se acha que pode me impedir."
    Narrador: De repente, uma sombra se materializa na sala. O Purgatório, uma entidade mágica, aparece, lançando um feitiço que envolve Kote em uma barreira invisível.
    Purgatório: "Você não pode se aproximar do rei, Kote. Este é um espaço sagrado, protegido por um encanto antigo. Para desfazer o feitiço, você deve resolver meu enigma.
    """;

  textodi9 = new JTextArea(texto);
  textodi9.setWrapStyleWord(true);
  textodi9.setLineWrap(true);
  textodi9.setOpaque(false);
  textodi9.setEditable(false);
  textodi9.setForeground(Color.white);
  textodi9.setFont(fontecorpo2);


 
  fundojDialogo9.add(textodi9);

  InputMap mj14 = fundojDialogo9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
  ActionMap mj15 = fundojDialogo9.getActionMap();
  mj14.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
  mj15.put("enterPressed", new AbstractAction() {
public void actionPerformed(ActionEvent e) {
  abseudesafio9();
  janelaDialogo9.dispose();
}
});

  
  janelaDialogo9.getContentPane().add(fundojDialogo9);
  janelaDialogo9.setVisible(true);

}
  public void abseudesafio9() {
    janeladesafio9 = new JFrame("Desafio 9"); 
    janeladesafio9.setSize(1000, 700);
    janeladesafio9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladesafio9.setResizable(false);
    janeladesafio9.getContentPane().setBackground(Color.black);
    janeladesafio9.setLocationRelativeTo(null);
    janeladesafio9.setLayout(null);
    con = janeladesafio9.getContentPane();

    fundodesafio9 = new JPanel();
    fundodesafio9.setBounds(50, 50, 900, 600);
    fundodesafio9.setBackground(Color.black);
    fundodesafio9.setLayout(new BorderLayout()); 

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio9 = new JLabel("Os Guardiões do Tempo exigem que você prove seu valor resolvendo um enigma. Eles perguntam: “Qual método é usado para ordenar um ArrayList?");
    tdesafio9.setForeground(Color.white);
    tdesafio9.setFont(fontedesafios);
    fundodesafio9.add(tdesafio9, BorderLayout.NORTH); 

    fundoalternativasd9 = new JPanel();
    fundoalternativasd9.setBounds(100, 380, 800, 100);
    fundoalternativasd9.setBackground(Color.black);
    fundoalternativasd9.setLayout(new GridLayout(2, 2, 10, 10)); 

    alternativaad9 = new JButton("A) sort()");
    alternativaad9.setFont(fontedesafios);
    alternativaad9.setFocusPainted(false);
    alternativaad9.setBackground(Color.black);
    alternativaad9.setForeground(Color.white);
    alternativaad9.setContentAreaFilled(false);
    alternativaad9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(true);
            abjaneladecisao();
            janeladesafio9.dispose();
        }
    });
    alternativabd9 = new JButton("B) order()");
    alternativabd9.setFont(fontedesafios);
    alternativabd9.setFocusPainted(false);
    alternativabd9.setBackground(Color.black);
    alternativabd9.setForeground(Color.white);
    alternativabd9.setContentAreaFilled(false);
    alternativabd9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Você errou! Tente novamente.");
        }
    });
    alternativacd9 = new JButton("C) Array()");
    alternativacd9.setFont(fontedesafios);
    alternativacd9.setFocusPainted(false);
    alternativacd9.setBackground(Color.black);
    alternativacd9.setForeground(Color.white);
    alternativacd9.setContentAreaFilled(false);
    alternativacd9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Você errou! Tente novamente.");
        }
    });
    alternativadd9 = new JButton("D) add()");
    alternativadd9.setFont(fontedesafios);
    alternativadd9.setFocusPainted(false);
    alternativadd9.setBackground(Color.black);
    alternativadd9.setForeground(Color.white);
    alternativadd9.setContentAreaFilled(false);
    alternativadd9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Você errou! Tente novamente.");
        }
    });
  
    fundoalternativasd9.add(alternativaad9);
    fundoalternativasd9.add(alternativabd9);
    fundoalternativasd9.add(alternativacd9);
    fundoalternativasd9.add(alternativadd9);
    con.add(fundodesafio9);
    con.add(fundoalternativasd9);
    
    janeladesafio9.setVisible(true);
}
public void abjaneladecisao() {
    janeladecisao = new JFrame("Decisão");
    janeladecisao.setSize(1000, 700);
    janeladecisao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladecisao.setResizable(false);
    janeladecisao.getContentPane().setBackground(Color.black);
    janeladecisao.setLocationRelativeTo(null);
    janeladecisao.setLayout(new BorderLayout());

    fundojdecisao = new JPanel();
    fundojdecisao.setBackground(Color.black);
    fundojdecisao.setLayout(new BoxLayout(fundojdecisao, BoxLayout.Y_AXIS));
    fundojdecisao.setBorder(new EmptyBorder(20, 20, 20, 20));

    String texto = """
    Após uma longa jornada, Kote finalmente se encontra diante do rei, o responsável pela guerra que devastou o mundo. Ele sabe que eliminar o rei poderia pôr fim a séculos de sofrimento, mas também entende que uma escolha precipitada pode levar o mundo a uma nova era de caos. O rei, agora desarmado e olhando nos olhos de Kote, não tenta resistir; ele sabe que seu destino está nas mãos do último herdeiro da linhagem Maerion.

    Kote se aproxima do trono, a espada brilhando com um leve reflexo das chamas que iluminam o salão. O rei observa em silêncio, seu rosto uma máscara de resignação, mas em seus olhos há uma mistura de medo e aceitação.

    "Você tem a chance de fazer o que muitos apenas sonharam," o rei murmura, sua voz fria e controlada. "Pode me matar agora e acabar com tudo. Mas lembre-se, as consequências do seu ato vão ecoar por gerações. Há aqueles que dependem de mim... até mesmo inimigos que você desconhece. Se eu cair, quem assumirá o poder? Você? Ou outro tirano mais sanguinário?"

    Kote sente o peso da responsabilidade. Cada fibra do seu ser clama por vingança, mas uma voz sutil, talvez dos ancestrais Maerion, sussurra sobre redenção, sobre dar uma segunda chance, mesmo ao mais vil dos homens.
    """;

    textodecisao = new JTextArea(texto);
    textodecisao.setWrapStyleWord(true);
    textodecisao.setLineWrap(true);
    textodecisao.setOpaque(false);
    textodecisao.setEditable(false);
    textodecisao.setForeground(Color.white);
    textodecisao.setFont(fontecorpo2);

    JScrollPane scrollPane = new JScrollPane(textodecisao);
    scrollPane.setPreferredSize(new Dimension(900, 300));
    scrollPane.setOpaque(false);
    scrollPane.getViewport().setOpaque(false);
    scrollPane.setBorder(null);

    fundobdecisao = new JPanel();
    fundobdecisao.setBounds(100, 380, 800, 150);
    fundobdecisao.setBackground(Color.black);
    fundobdecisao.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); 

    matar = new JButton("Matar Sebastian");
    matar.setFont(fontedesafios);
    matar.setPreferredSize(new Dimension(200, 50));
    matar.setFocusPainted(false);
    matar.setBackground(Color.black);
    matar.setForeground(Color.white);
    matar.setContentAreaFilled(false);
    matar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            executarDecisao("matar");
        }
    });

    nmatar = new JButton("Não matar Sebastian");
    nmatar.setFont(fontedesafios);
    nmatar.setPreferredSize(new Dimension(200, 50));
    nmatar.setFocusPainted(false);
    nmatar.setBackground(Color.black);
    nmatar.setForeground(Color.white);
    nmatar.setContentAreaFilled(false);
    nmatar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            executarDecisao("poupar");
        }
    });

    fundobdecisao.add(matar);
    fundobdecisao.add(nmatar);

    fundojdecisao.add(scrollPane);
    fundojdecisao.add(fundobdecisao);

    janeladecisao.getContentPane().add(fundojdecisao);
    janeladecisao.setVisible(true);
}

public void executarDecisao(String decisao) {
    switch (decisao) {
        case "matar":
            JOptionPane.showMessageDialog(null, "Você decidiu matar o rei. As consequências de sua escolha reverberarão pelo reino.");
            abseudesafio10();
            janeladesafio9.dispose();
            break;
        case "poupar":
            JOptionPane.showMessageDialog(null, "Você decidiu poupar o rei. Sua compaixão pode ter um impacto inesperado no futuro.");
            // Aqui, você pode adicionar outro método ou ação para a escolha de poupar o rei
            break;
        default:
            JOptionPane.showMessageDialog(null, "Escolha inválida.");
            break;
    }
}




public void abseudesafio10() {
    janeladesafio10 = new JFrame("Desafio 10");
    janeladesafio10.setSize(1000, 700);
    janeladesafio10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladesafio10.setResizable(false);
    janeladesafio10.getContentPane().setBackground(Color.black);
    janeladesafio10.setLocationRelativeTo(null);
    janeladesafio10.setLayout(null);
    con = janeladesafio10.getContentPane();

    fundodesafio10 = new JPanel();
    fundodesafio10.setBounds(50, 50, 900, 600);
    fundodesafio10.setBackground(Color.black);
    fundodesafio10.setLayout(new BorderLayout()); 

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio10 = new JLabel("<html> Quando você precisa armazenar uma lista de elementos que pode mudar de tamanho ao longo do tempo,<br><br>" +
                        "qual classe do Java é mais adequada para essa tarefa, considerando que você deseja acessar os elementos por índice?  E, <br>" +
                        "durante uma negociação entre duas facções rivais, ambas exigem uma prova de lealdade antes de se unir contra os Ceifadores de Sombras. <br>" +
                        "Você tem que escolher uma missão para cada facção. Qual você escolhe?</html>");
    tdesafio10.setForeground(Color.white);
    tdesafio10.setFont(fontedesafios);
    fundodesafio10.add(tdesafio10, BorderLayout.NORTH);

    fundoalternativasd10 = new JPanel();
    fundoalternativasd10.setBounds(100, 380, 800, 100);
    fundoalternativasd10.setBackground(Color.black);
    fundoalternativasd10.setLayout(new GridLayout(2, 2, 10, 10));
    con.add(fundoalternativasd10);

    alternativaad10 = new JButton("A) ArrayList — Recuperar um artefato sagrado para a Facção A.");
    alternativaad10.setFont(fontedesafios);
    alternativaad10.setFocusPainted(false);
    alternativaad10.setBackground(Color.black);
    alternativaad10.setForeground(Color.white);
    alternativaad10.setContentAreaFilled(false);
    alternativaad10.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           verificarResposta(true);
           abstart();
           janeladesafio10.dispose();
        }
    });
    alternativabd10 = new JButton("B) Array — Eliminar um traidor na Facção B.");
    alternativabd10.setFont(fontedesafios);
    alternativabd10.setFocusPainted(false);
    alternativabd10.setBackground(Color.black);
    alternativabd10.setForeground(Color.white);
    alternativabd10.setContentAreaFilled(false);
    alternativabd10.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           verificarResposta(false);
        }
    });
    alternativacd10 = new JButton("C)ArrayList — Eliminar um traidor na Facção B.");
    alternativacd10.setFont(fontedesafios);
    alternativacd10.setFocusPainted(false);
    alternativacd10.setBackground(Color.black);
    alternativacd10.setForeground(Color.white);
    alternativacd10.setContentAreaFilled(false);
    alternativacd10.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           verificarResposta(false);
        }
    });
    alternativadd10 = new JButton("D) Array — Recuperar um artefato sagrado para a Facção A.");
    alternativadd10.setFont(fontedesafios);
    alternativadd10.setFocusPainted(false);
    alternativadd10.setBackground(Color.black);
    alternativadd10.setForeground(Color.white);
    alternativadd10.setContentAreaFilled(false);
    alternativadd10.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            verificarResposta(false);
        }
    });
    fundoalternativasd10.add(alternativaad10);
    fundoalternativasd10.add(alternativabd10);
    fundoalternativasd10.add(alternativacd10);
    fundoalternativasd10.add(alternativadd10);
    con.add(fundodesafio10);
    con.add(fundoalternativasd10);
    
    janeladesafio10.setVisible(true);
}

private void verificarResposta(boolean respostaCorreta) {
    if (respostaCorreta) {
        JOptionPane.showMessageDialog(null, "Resposta correta!");
    } else {
        vida--; // Subtrai 1 da vida
        sistemaVida.setText("Vida: " + vida); // Atualiza o JLabel

        if (vida <= 0) {
            JOptionPane.showMessageDialog(null, "Você morreu!");
            abstart();//reinicia o jogo
        } else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta! Tente novamente!");
        }
    }
}

    public void abcomojogar() { // Método que abre a nova janela 
        // Criando uma nova janela
        janelacomojogar = new JFrame("Como Jogar");
        janelacomojogar.setSize(1000, 700);
        janelacomojogar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelacomojogar.setResizable(false);
        janelacomojogar.getContentPane().setBackground(Color.black);
        janelacomojogar.setLocationRelativeTo(null);
        janelacomojogar.setLayout(new BorderLayout());
        
        fundojcomojogar = new JPanel();
        fundojcomojogar.setBackground(Color.black);
        fundojcomojogar.setLayout(new BoxLayout(fundojcomojogar, BoxLayout.Y_AXIS));
        fundojcomojogar.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        String texto = """
        Este é um jogo RPG de texto, projetado para expandir seu conhecimento na linguagem de programação Java! Aqui, você não apenas se divertirá com uma narrativa envolvente, mas também enfrentará uma série de desafios que testarão suas habilidades de programação.
    
            **Desafios Interativos**
        
            Ao longo do jogo, você encontrará 10 perguntas cuidadosamente elaboradas que abordam conceitos fundamentais da programação em Java. As questões incluem:
        
            - Operadores: Entenda como funcionam os operadores matemáticos e lógicos.
            - Condicionais: Aprenda a estruturar decisões no seu código usando condicionais.
            - Laços de Repetição: Explore a utilização de loops para realizar ações repetitivas de forma eficiente.
            - Arrays e Collections: Descubra como armazenar e manipular conjuntos de dados.
        
            Cada pergunta é apresentada em um formato de múltipla escolha, tornando a experiência interativa e desafiadora. Você terá a oportunidade de aplicar seu conhecimento enquanto avança pela história.
        
            **O Desafio da Sobrevivência**
        
            A cada escolha errada, sua vida será reduzida e você morrerá se atingir 5, fazendo com que o jogo reinicie. Pense com cuidado e utilize suas habilidades de programação e lógica para responder corretamente!
        """;
    
        textocj = new JTextArea(texto);
        textocj.setWrapStyleWord(true);
        textocj.setLineWrap(true);
        textocj.setOpaque(false);
        textocj.setEditable(false);
        textocj.setForeground(Color.white);
        textocj.setFont(fontecorpo2);
        
        // Adicionando JTextArea ao painel
        fundojcomojogar.add(textocj);
    
        JButton bvoltar = botaovoltar(janelacomojogar);
        fundojcomojogar.add(bvoltar);
        
        // Adicionando o painel à janela
        janelacomojogar.getContentPane().add(fundojcomojogar);
        janelacomojogar.setVisible(true);
    
        // Configurando InputMap e ActionMap para o Enter
        InputMap mj = fundojcomojogar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mj1 = fundojcomojogar.getActionMap();
        
        mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        mj1.put("enterPressed", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                abrircomojogar2(); // Chama o método para abrir a segunda janela
            }
        });
    }
    
    public void abrircomojogar2() {
        janelacomojogar.dispose(); // Fecha a janela anterior
        abcomojogar2(); // Abre a nova janela
    }
    
    public void abcomojogar2() {
        janelacomojogar2 = new JFrame("Interface do Jogo");
        janelacomojogar2.setSize(1000, 700);
        janelacomojogar2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelacomojogar2.setResizable(false);
        janelacomojogar2.getContentPane().setBackground(Color.black);
        janelacomojogar2.setLocationRelativeTo(null);
        janelacomojogar2.setLayout(new BorderLayout());
        
        fundojcomojogar2 = new JPanel();
        fundojcomojogar2.setBackground(Color.black);
        fundojcomojogar2.setLayout(new BoxLayout(fundojcomojogar2, BoxLayout.Y_AXIS));
        fundojcomojogar2.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        String texto = """
        **Interface do Jogo**
    
        Durante a sua aventura, você terá acesso a um menu informativo que exibe suas vidas restantes e atributos, permitindo que você acompanhe seu progresso e esteja sempre ciente de sua situação. Use essas informações para tomar decisões estratégicas ao longo do caminho.
    
        **Boa Sorte!**
    
        Este jogo não é apenas uma oportunidade de aprendizado; é uma experiência emocionante que combina diversão e educação.
        """;
    
        textocj2 = new JTextArea(texto);
        textocj2.setWrapStyleWord(true);
        textocj2.setLineWrap(true);
        textocj2.setOpaque(false);
        textocj2.setEditable(false);
        textocj2.setForeground(Color.white);
        textocj2.setFont(fontecorpo2);
    
        // Adicionando JTextArea ao painel
        fundojcomojogar2.add(textocj2);
    
        JButton bvoltar = botaovoltar(janelacomojogar2);
        fundojcomojogar2.add(bvoltar);
        
        // Adicionando o painel à nova janela
        janelacomojogar2.getContentPane().add(fundojcomojogar2);
        janelacomojogar2.setVisible(true);
    }

    public void abcreditos(){
        janelacreditos = new JFrame();
        janelacreditos.setSize(1000, 700);
        janelacreditos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelacreditos.setResizable(false);
        janelacreditos.getContentPane().setBackground(Color.black);
        janelacreditos.setLocationRelativeTo(null);
        janelacreditos.setLayout(null);
        con = janelacreditos.getContentPane();
    
        // Painel de créditos com BoxLayout
        fundojcreditos = new JPanel();
        fundojcreditos.setBackground(Color.black);
        fundojcreditos.setLayout(new BoxLayout(fundojcreditos, BoxLayout.Y_AXIS));
        fundojcreditos.setBorder(new EmptyBorder(20, 20, 20, 20));
        fundojcreditos.setBounds(100, 100, 800, 500); // Define a posição e o tamanho do painel de créditos
    
        // Texto de créditos
        String texto = """
            Este jogo foi desenvolvido pelo Grupo 7 da turma A do curso de Análise e Desenvolvimento de Sistemas do Centro Universitário Senac, formado por Giulia Alciati, Sabrina Aparecida, Arielly Bispo e Eduardo Sampaio. O projeto, criado para a disciplina de Projeto Integrador, visa ensinar conceitos básicos de programação na linguagem Java.
        """;
    
        textocreditos = new JTextArea(texto);
        textocreditos.setForeground(Color.white);
        textocreditos.setFont(fontecorpo);
        textocreditos.setWrapStyleWord(true);
        textocreditos.setLineWrap(true);
        textocreditos.setOpaque(false);
        textocreditos.setEditable(false);
    
        fundojcreditos.add(textocreditos);
        
        // Botão Voltar
        JButton bvoltar = botaovoltar(janelacreditos);
        bvoltar.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão dentro do painel
        fundojcreditos.add(Box.createVerticalStrut(20)); // Espaço entre o texto e o botão
        fundojcreditos.add(bvoltar);
        
        con.add(fundojcreditos);
        janelacreditos.setVisible(true);
    }
    
   
}
