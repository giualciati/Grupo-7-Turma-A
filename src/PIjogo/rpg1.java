package PIjogo;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class rpg1 {

 JFrame janela, janelastart, janelacomojogar, janelacomojogar2, janelacreditos, janeladesafio1, janeladesafio2;//janela
 Container con;//conteúdo
 JPanel fundotituloinicial, fundomenu, fundojstart, fundojcomojogar, fundojcomojogar2, fundojcreditos, fundodesafio1, fundoalternativasd1, fundodesafio2, fundoalternativasd2;//painéis
 JLabel tituloinicial, tstart, tcomojogar, tcreditos, tdesafio1, tdesafio2;//textos
 JButton bstart, bcomojogar, bcreditos, bsair, bvoltar, alternativaadesafio1, alternativabdesafio1, alternativacdesafio1, alternativaddesafio1, alternativaad2, alternativabd2, alternativacd2, alternativadd2;//botões
 JTextArea textocj, textocj2;
 Font fontetitulo = new Font("Times New Roman", Font.PLAIN, 40);//fonte
 Font fontecorpo = new Font ("Times New Roman", Font.PLAIN, 30);//fonte
 Font fontedesafios = new Font("Times New ROman", Font.PLAIN, 20);
 Font fontecorpo2 = new Font ("Times New Roman", Font.PLAIN, 18);

public static void main(String[] args) {
    new rpg1();
 }

public rpg1(){
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
        abrirdesafio1();
    }
});

        tstart = new JLabel("Jogo começa...");
        tstart.setForeground(Color.white);
        tstart.setFont(fontecorpo);
        fundojstart.add(tstart);
        janelastart.setVisible(true);
        con.add(fundojstart);
        
    }
    
    public void abrirdesafio1() {
    abdesafio1(); // Abre a janela do desafio 1
    janelastart.dispose(); // Fecha a janela atual
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

        alternativaadesafio1 = new JButton("A) A biblioteca é acessada.");
        alternativaadesafio1.setFont(fontedesafios);
        alternativaadesafio1.setFocusPainted(false);
        alternativaadesafio1.setBackground(Color.black);
        alternativaadesafio1.setForeground(Color.white);
        alternativaadesafio1.setContentAreaFilled(false);
        alternativaadesafio1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Resposta incorreta! Tente novamente!");
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
            JOptionPane.showMessageDialog(null, "Correto! A biblioteca permanece fechada.");
            abdesafio2(); //exemplo, vamos colocar outra janela aqui
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
                JOptionPane.showMessageDialog(null, "Resposta incorreta! Tente novamente!");
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
                JOptionPane.showMessageDialog( null, "Resposta incorreta! Tente novamente!");
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

    public void abrirdesafio2() {
        abdesafio2(); // Abre a janela do desafio 1
        janeladesafio1.dispose(); // Fecha a janela atual
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
        alternativaad2.setBounds(100, 400, 300, 50);
        alternativaad2.setFont(fontedesafios);
        alternativaad2.setFocusPainted(false);
        alternativaad2.setBackground(Color.black);
        alternativaad2.setForeground(Color.white);
        alternativaad2.setContentAreaFilled(false);
        alternativaad2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resposta correta!");
                abstart();
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
                JOptionPane.showMessageDialog(null, "Resposta incorreta! Tente novamente!");
            }
        });

        alternativacd2 = new JButton("C) Kote consegue abrir a prateleira mas não acha o livro");
        alternativacd2.setBounds(100, 500, 400, 50);
        alternativacd2.setFont(fontedesafios.deriveFont(15f));
        alternativacd2.setFocusPainted(false);
        alternativacd2.setBackground(Color.black);
        alternativacd2.setForeground(Color.white);
        alternativacd2.setContentAreaFilled(false);
        alternativacd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resposta incorreta! Tente novamente!");
            }
        });

        alternativadd2 = new JButton("D) Kote é transportado para o portal do tempo");
        alternativadd2.setBounds(500, 500, 400, 50);
        alternativadd2.setFont(fontedesafios.deriveFont(15f));
        alternativadd2.setFocusPainted(false);
        alternativadd2.setBackground(Color.black);
        alternativadd2.setForeground(Color.white);
        alternativadd2.setContentAreaFilled(false);
        alternativadd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resposta incorreta! Tente novamente!");
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
    
        // Texto explicativo em JTextArea
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

        fundojcreditos = new JPanel();
        fundojcreditos.setBounds(50, 50, 900, 600);
        fundojcreditos.setBackground(Color.black);

        tcreditos = new JLabel("Esse jogo foi desenvolvido por ...");
        tcreditos.setForeground(Color.white);
        tcreditos.setFont(fontecorpo);
        fundojcreditos.add(tcreditos);
        JButton bvoltar = botaovoltar(janelacreditos);
        fundojcreditos.add(bvoltar);
        janelacreditos.setVisible(true);
        con.add(fundojcreditos);


    }

}