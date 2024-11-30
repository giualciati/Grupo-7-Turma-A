package PIjogo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class rpg1 {

 //criação das variáveis
 JFrame janela, janelastart, janelacomojogar, janelacomojogar2, janelacreditos, janeladesafio1, janeladesafio2, janeladesafio3, janeladesafio4, janeladesafio5, janeladesafio6, janeladesafio7, janeladesafio8, janeladesafio9, janeladesafio10, janelaDialogo1, janelaDialogo2, janelaDialogo3, janelaDialogo4, janelaDialogo5, janelaDialogo6, janelaDialogo7, janelaDialogo8, janelaDialogo9, janeladecisao, janelaDialogo101, janelaDialogo102, janelanoxterra, janelaDormir;//janela
 Container con;//conteúdo
 JPanel fundotituloinicial, fundomenu, fundojstart, fundojcomojogar, fundojcomojogar2, fundojcreditos, fundodesafio1, fundoalternativasd1, fundodesafio2, fundoalternativasd2, fundodesafio3, fundoalternativasd3, fundodesafio4, fundoalternativasd4, fundodesafio5, fundoalternativasd5, fundodesafio6, fundoalternativasd6, fundodesafio7, fundoalternativasd7, fundodesafio8, fundoalternativasd8, fundodesafio9, fundoalternativasd9, fundodesafio10, fundoalternativasd10, fundojDialogo1, fundojDialogo2, fundojDialogo3, fundojDialogo4, fundojDialogo5, fundojDialogo6, fundojDialogo7, fundojDialogo8, fundojDialogo9, fundojdecisao, fundobdecisao, fundojDialogo101, fundojDialogo102, fundobjstart, fundojnoxterra, fundoDormir;//painéis
 JLabel tituloinicial, tcomojogar, tcreditos, tdesafio1, tdesafio2, tdesafio3, tdesafio4, tdesafio5, tdesafio6, tdesafio7, tdesafio8, tdesafio9, tdesafio10, sistemaVida;//textos
 JButton bstart, bcomojogar, bcreditos, bsair, bvoltar, biblioteca, nbiblioteca, matar, nmatar;//botões
 JTextArea textostart, textocj, textocj2, textoDi1, textoDi2, textoDi3, textodi4, textodi5, textoDi6, textodi7, textodi8, textodi9, textocreditos, textodecisao, textodi101, textodi102, textonox, textoAreaDormir;
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
            janela.dispose();//fecha a janela atual
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

    bcomojogar.setFocusPainted(false); 
    bcomojogar.setBorderPainted(false);
    bcomojogar.setContentAreaFilled(false);
    bcomojogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abcomojogar(); // Chama o método que abre a nova janela
                janela.setVisible(false);//fecha a janela inicial
            }
        });

     bcomojogar.addMouseListener(new MouseListener() {
        public void mouseEntered(MouseEvent e) {
            bcomojogar.setForeground(Color.yellow);
        }

        public void mouseExited(MouseEvent e) {
            bcomojogar.setForeground(Color.white);
        }

       public void mouseClicked(MouseEvent e) {}
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
            abcreditos(); 
            janela.setVisible(false);
        }
    });
     

     bcreditos.addMouseListener(new MouseListener(){
         public void mouseEntered(MouseEvent e) {
             bcreditos.setForeground(Color.yellow);
         }
         public void mouseExited(MouseEvent e) {
             bcreditos.setForeground(Color.white);
         }
         public void mouseClicked(MouseEvent e) {}
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
        bvoltar.setFont(fontedesafios);
        bvoltar.setBackground(Color.black);
        bvoltar.setForeground(Color.white);
        bvoltar.setFocusPainted(false);
        bvoltar.setContentAreaFilled(false);
        
        bvoltar.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              janela.setVisible(true);
              janelaatual.dispose();
          }
        });
     return bvoltar;
        
    }
    //primeira janela start
    public void abstart() {
        janelastart = new JFrame("A Herança do Caos: Visão de Kote");
        janelastart.setSize(1000, 700);
        janelastart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelastart.setResizable(false);
        janelastart.getContentPane().setBackground(Color.black);
        janelastart.setLocationRelativeTo(null);
        janelastart.setLayout(new BorderLayout());
    
        // Painel para a visão
        JPanel fundojstart = new JPanel();
        fundojstart.setBackground(Color.black);
        fundojstart.setLayout(new BoxLayout(fundojstart, BoxLayout.Y_AXIS));
        fundojstart.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        // Texto da visão
        String textoVisao = """
    Narrador: Na quietude da noite, Kote dorme profundamente, exausto de suas últimas batalhas. A chama de uma vela tremeluzente ilumina seu rosto, mas, enquanto ele descansa, algo estranho começa a acontecer.
    Em seu sonho, ele se vê em uma paisagem desolada, um mundo coberto por sombras. O céu é de um vermelho ameaçador, e a terra parece gritar de dor. Kote caminha sem rumo, até que uma figura envolta em sombras surge diante dele, seus olhos brilhando como brasa.
    
    Figura Misteriosa: Kote... você é o último herdeiro dos Maerion. O sangue dos antigos flui em você, e com ele, o poder de mudar o destino deste mundo. Mas saiba que o grande Caos se aproxima. Se você não agir, tudo que conhece será consumido pelas chamas da destruição.
    
    Narrador: As imagens ao seu redor começam a se deformar, revelando cidades em ruínas, tempestades de fogo consumindo florestas e rios de cinzas cobrindo a terra. Kote sente um arrepio percorrer seu corpo enquanto a figura misteriosa se aproxima, sua voz ecoando como um trovão.
    
    Figura Misteriosa: Se quer salvar o que ainda resta, vá até a biblioteca. Busque a seção proibida que o Rei esconde, lá você vai encontrar os segredos de sua linhagem e do poder que só você pode despertar.
    
    Narrador: De repente, Kote desperta com o coração acelerado, o eco das palavras da visão ainda vibrando em sua mente. Ele compreende que essa não foi uma simples fantasia noturna, mas uma mensagem dos antigos. Ele precisa ir à biblioteca, e lá, na seção restrita do Rei, talvez encontre as respostas para o apocalipse que o aguarda – e para o poder oculto que precisará para enfrentá-lo.
        """;
    
        JTextArea textostart = new JTextArea(textoVisao);
        textostart.setWrapStyleWord(true);
        textostart.setLineWrap(true);
        textostart.setOpaque(false);
        textostart.setEditable(false);
        textostart.setForeground(Color.white);
        textostart.setFont(fontecorpo2);
    
        JPanel fundobjstart = new JPanel();
        fundobjstart.setBounds(100, 380, 800, 150);
        fundobjstart.setBackground(Color.black);
        fundobjstart.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
    
        biblioteca = new JButton("Ir imediatamente para a Biblioteca");
        biblioteca.setFont(fontedesafios);
        biblioteca.setPreferredSize(new Dimension(350, 50));
        biblioteca.setFocusPainted(false);
        biblioteca.setBackground(Color.black);
        biblioteca.setForeground(Color.white);
        biblioteca.setContentAreaFilled(false);
        biblioteca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executarBiblioteca("ir");
            }
        });
    
        nbiblioteca = new JButton("Voltar a dormir");
        nbiblioteca.setFont(fontedesafios);
        nbiblioteca.setPreferredSize(new Dimension(350, 50));
        nbiblioteca.setFocusPainted(false);
        nbiblioteca.setBackground(Color.black);
        nbiblioteca.setForeground(Color.white);
        nbiblioteca.setContentAreaFilled(false);
        nbiblioteca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executarBiblioteca("não ir");
            }
        });
    
        fundojstart.add(textostart);
        fundobjstart.add(biblioteca);
        fundobjstart.add(nbiblioteca);
        fundojstart.add(fundobjstart);
    
        janelastart.getContentPane().add(fundojstart);
        janelastart.setVisible(true);
    }
    
    public void executarBiblioteca(String decisaob) {
        switch (decisaob) {
            case "ir":
                JOptionPane.showMessageDialog(null, "Você decidiu ir à biblioteca.");
                abDialogo1();
                janelastart.dispose();
                break;
            case "não ir":
                JOptionPane.showMessageDialog(null, "Você decidiu ignorar o sonho e voltar a dormir.");
                abjanelastart2();
                janelastart.dispose();
                break;
        }
    }
    //janela de escolha voltar a dormir
    public void abjanelastart2() {
        janelaDormir = new JFrame("Sonhos Inquietos");
        janelaDormir.setSize(1000, 700);
        janelaDormir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaDormir.setResizable(false);
        janelaDormir.getContentPane().setBackground(Color.black);
        janelaDormir.setLocationRelativeTo(null);
        
        fundoDormir = new JPanel();
        fundoDormir.setBackground(Color.black);
        fundoDormir.setLayout(new BoxLayout(fundoDormir, BoxLayout.Y_AXIS));
        fundoDormir.setBorder(new EmptyBorder(20, 20, 20, 20));
    
        String textoDormir = """
    Narrador: Kote se vira para o lado, tentando afastar a estranha visão. Ele respira fundo e se cobre com seu manto, buscando o conforto do sono. Mas, assim que fecha os olhos, a voz da figura misteriosa ecoa em sua mente, ainda mais forte.

    Figura Misteriosa: Kote... o tempo está se esgotando. Sua hesitação pode custar mais do que imagina.

    Narrador: Kote se mexe inquieto, os sussurros ressoando em seus pensamentos. Ele tenta ignorar, convencendo-se de que tudo não passa de um pesadelo. Contudo, após várias tentativas, ele percebe que não consegue escapar das visões. Sente-se observado e, ao fechar os olhos novamente, a paisagem desolada volta a assombrá-lo.

    Figura Misteriosa: Você realmente acredita que pode fugir de seu destino, Kote?

    Narrador: Finalmente, Kote abre os olhos, incapaz de ignorar a voz que o atormenta. Ele se levanta, sentindo o peso da responsabilidade sobre seus ombros. As imagens de destruição e caos invadem sua mente, e ele entende que precisa atender ao chamado dos antigos.

    Narrador: A decisão está tomada: Kote irá até a biblioteca, pronto para enfrentar o destino que tanto hesitou em aceitar.
    
    """;
    
        textoAreaDormir = new JTextArea(textoDormir);
        textoAreaDormir.setWrapStyleWord(true);
        textoAreaDormir.setLineWrap(true);
        textoAreaDormir.setOpaque(false);
        textoAreaDormir.setEditable(false);
        textoAreaDormir.setForeground(Color.white);
        textoAreaDormir.setFont(new Font("Serif", Font.PLAIN, 18));
        fundoDormir.add(textoAreaDormir);

        InputMap mj = fundoDormir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap mj1 = fundoDormir.getActionMap();
        mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
        mj1.put("enterPressed", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                abDialogo1(); 
                janelaDormir.dispose();
            }
        });
    
        janelaDormir.getContentPane().add(fundoDormir);
        janelaDormir.setVisible(true);
    }
     
    //Criação do sistema de vida
    private JLabel criarSistemaVida() {
        JLabel sistemaVida = new JLabel("Vida: " + vida);
        sistemaVida.setForeground(Color.white);
        sistemaVida.setFont(fontedesafios);
        sistemaVida.setBounds(10, 10, 200, 30); 
        return sistemaVida;
 }
  public void abDialogo1() { 
  
     janelaDialogo1 = new JFrame("Dialogo 1");
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
      Feiticeiro: Bem-vindo Kote, o que você deseja encontrar aqui?
      
      Kote: Estou procurando um livro que contenha informações sobre os Maerion. Você sabe me dizer onde fica?
      
      Feiticeiro: Maerion? Eles desapareceram há muito tempo, antes mesmo do rei Sebastian governar. Não acredito que vá encontrar muita coisa, mas siga para a seção restrita da biblioteca. Se você já conversou com o Rei, saberá como entrar.
      
      Narrador: Kote acena com a cabeça e avança, sentindo a atmosfera intensificando ao seu redor enquanto se aproxima da sessão proibida.""";


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
     
     @SuppressWarnings("unused")
    public void abdesafio1() {
        janeladesafio1 = new JFrame("Desafio 1");
        janeladesafio1.setSize(1000, 700);
        janeladesafio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio1.setResizable(false);
        janeladesafio1.getContentPane().setBackground(Color.black);
        janeladesafio1.setLocationRelativeTo(null);
        janeladesafio1.setLayout(null);
        con = janeladesafio1.getContentPane();
        

        fundodesafio1 = new JPanel();
        fundodesafio1.setBounds(10, 50, 900, 600);
        fundodesafio1.setBackground(Color.black);
    
        
        String pergunta = "<html>Após o encontro com o feiticeiro, Kote observa a magia que preserva a seção restrita.<br>Para entrar, ele precisa possuir alguns requisitos:<br><br>" +
                "<i>if (!(energia < 5 || foco <= 5) && (habilidadeEspecial || sabedoria > 10)) {</i><br>" +
                "<i>acessarBiblioteca();</i><br><br>" +
                "Considere os valores para Kote:<br>" +
                "Energia: 4<br>Foco: 6<br>Habilidade Especial: desativada<br>Sabedoria: 12<br><br>" +
                "O que acontece quando Kote tenta acessar a biblioteca?</html>";
        tdesafio1 = new JLabel(pergunta);
        tdesafio1.setForeground(Color.white);
        tdesafio1.setFont(fontedesafios);
    
        String[] alternativas = {
            "A biblioteca é acessada.",           // Errada
            "A biblioteca permanece fechada.",    // Certa
            "Kote encontra o livro.",             // Errada
            "Kote é banido da biblioteca."        // Errada
        };
        int respostaCorreta = 1; // Índice da resposta correta
    
        fundoalternativasd1 = new JPanel();
        fundoalternativasd1.setBounds(100, 400, 800, 100);
        fundoalternativasd1.setBackground(Color.black);
        fundoalternativasd1.setLayout(new GridLayout(2, 2, 10, 10));
        con.add(fundoalternativasd1);
    
        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);
    
        
        final Runnable[] embaralharAlternativas = new Runnable[1];
    
        embaralharAlternativas[0] = () -> {
            fundoalternativasd1.removeAll(); // Remove botões anteriores
    
            // Embaralha as alternativas
            List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
            Collections.shuffle(alternativasEmbaralhadas);
    
            for (String alternativa : alternativasEmbaralhadas) {
                JButton botaoAlternativa = new JButton(alternativa);
                botaoAlternativa.setFont(fontedesafios);
                botaoAlternativa.setFocusPainted(false);
                botaoAlternativa.setBackground(Color.black);
                botaoAlternativa.setForeground(Color.white);
                botaoAlternativa.setContentAreaFilled(false);

                botaoAlternativa.addActionListener(a -> {
                    if (alternativa.equals(alternativas[respostaCorreta])) {
                        abDialogo2(); //abre a próxima janela
                        janeladesafio1.dispose(); // Fecha a janela do desafio atual
                    } else {
                        verificarResposta(false); 
                        embaralharAlternativas[0].run(); // Embaralha as alternativas se errar
                        
                    }
                });
                
                fundoalternativasd1.add(botaoAlternativa);
            }
    
            fundoalternativasd1.revalidate(); // atualiza o layout 
            fundoalternativasd1.repaint();  
        };
    
        
        embaralharAlternativas[0].run();
    
        fundodesafio1.add(tdesafio1);
        con.add(fundodesafio1);
        janeladesafio1.setVisible(true);
        
    }
    
    

     public void abDialogo2() { 
  
        janelaDialogo2 = new JFrame("Dialogo 2");
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
         Rei Sebastian: O que você está fazendo por aqui, Kote?

         Narrador: Kote se assusta com a presença repentina do rei e se vira cuidadosamente, ponderando sobre o que deveria dizer.

         Kote: Majestade... Eu estava sem sono e decidi procurar algo para ocupar a mente. Não foi minha intenção interromper sua leitura. Com licença...

         Rei Sebastian: Espere. Você e eu crescemos juntos, Kote, não há necessidade de tanta formalidade. Você quer algo desta seção, não é? Venha, eu abrirei a porta para você.

         Narrador: Sebastian para em frente à porta, que se abre automaticamente ao seu comando.

         Rei Sebastian: Aqui está... Lembre-se, Kote, você sempre poderá contar com minha ajuda. Somos como irmãos, e foi por isso que te escolhi como minha Mão.

         Kote: Agradeço, Majestade. Pegarei o livro e voltarei ao meu quarto.

         Narrador: Kote faz uma reverência e entra, observando as prateleiras.

          """;
    
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

     @SuppressWarnings("unused")
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
        fundodesafio2.setBounds(20, 50, 900, 600);
        fundodesafio2.setBackground(Color.black);
    
    
        tdesafio2 = new JLabel("<html>Kote encontra a prateleira certa mas ela também está protegida com um feitiço<br>" +
                "<i>if ((conhecimento > 7 && energia > 5) || (habilidadeEspecial && sabedoria >= 12)) {</i><br>" +
                "<i>abrirPrateleira();</i><br><br>" +
                "Considere os valores para Kote:<br>" +
                "Conhecimento: 8<br>Energia: 6<br>Habilidade Especial: ativada<br>Sabedoria: 10<br><br>" +
                "Qual será o resultado da condição?</html>");
        tdesafio2.setForeground(Color.white);
        tdesafio2.setFont(fontedesafios);

        String[] alternativas = {
            "Kote consegue abrir a prateleira", // Correta
            "Kote não consegue abrir a prateleira", // Errada
            "<html>Kote consegue abrir a prateleira<br> mas não acha o livro</html>", // Errada
            "Kote é transportado para o portal do tempo" // Errada
        };
        int respostaCorreta = 0; 
    
        fundoalternativasd2 = new JPanel();
        fundoalternativasd2.setBounds(100, 380, 800, 130);
        fundoalternativasd2.setBackground(Color.black);
        fundoalternativasd2.setLayout(new GridLayout(2, 2, 10, 10));
        con.add(fundoalternativasd2);

        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);
    
         
        final Runnable[] embaralharAlternativas = new Runnable[1];
    
        embaralharAlternativas[0] = () -> {
            fundoalternativasd2.removeAll(); // Remove botões antigos
    
            // Embaralha as alternativas
            List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
            Collections.shuffle(alternativasEmbaralhadas);
    
            
            for (String alternativa : alternativasEmbaralhadas) {
                JButton botaoAlternativa = new JButton(alternativa);
                botaoAlternativa.setFont(fontedesafios);
                botaoAlternativa.setFocusPainted(false);
                botaoAlternativa.setBackground(Color.black);
                botaoAlternativa.setForeground(Color.white);
                botaoAlternativa.setContentAreaFilled(false);
    
               
                botaoAlternativa.addActionListener(a -> {
                    if (alternativa.equals(alternativas[respostaCorreta])) {
                        abDialogo3(); // abre a próxima janela
                        janeladesafio2.dispose(); // fecha a janela do desafio atual
                    } else {
                        verificarResposta(false); 
                        embaralharAlternativas[0].run(); // embaralha novamente se errar
                    }
                });
    
                fundoalternativasd2.add(botaoAlternativa); 
            }
    
            fundoalternativasd2.revalidate(); // atualiza o layout
            fundoalternativasd2.repaint();   
        };
    
        
        embaralharAlternativas[0].run();
    
        fundodesafio2.add(tdesafio2);
        con.add(fundodesafio2);
        janeladesafio2.setVisible(true);
    }
    
     public void abDialogo3() { 
        janelaDialogo3 = new JFrame("Dialogo 3");
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
            Narrador: Kote segura o livro em suas mãos e começa a folhear com cuidado enquanto caminha para fora da seção. Já em seus aposentos, ele descobre que os Maerion eram um povo capaz de viajar no tempo, mas foram acusados de traição ao último rei e condenados a morte.
            Arquimedes era o líder desse povo e seu diário continha os ensinamentos para alcançar esse poder, além de contar toda a história por trás dos segredos que a nobreza mantinha.

            Feiticeiro: Kote! Acorde! O rei precisa que você vá até Noxterra para garantir um acordo.

            Narrador: Kote acorda assustado com as batidas fortes na porta, percebendo que dormiu enquanto lia sobre Arquimedes.

            Kote: Um momento! Eu vou me trocar e pegar a primeira carruagem!

            Feiticeiro: Venha rápido. Eles estão cogitando a separação do reino.
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

     @SuppressWarnings("unused")
    public void abdesafio3() {
        janeladesafio3 = new JFrame("Desafio 3");
        janeladesafio3.setSize(1000, 700);
        janeladesafio3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janeladesafio3.setResizable(false);
        janeladesafio3.getContentPane().setBackground(Color.black);
        janeladesafio3.setLocationRelativeTo(null);
        janeladesafio3.setLayout(null);
        con = janeladesafio3.getContentPane();
    
        fundodesafio3 = new JPanel();
        fundodesafio3.setBounds(20, 50, 900, 600);
        fundodesafio3.setBackground(Color.black);
    
        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);
    
        tdesafio3 = new JLabel("<html>Agora, Kote embarca em uma jornada até Noxterra para fechar o acordo com seus líderes,<br> mas ao chegar é ameaçado pelos guardas antes mesmo de se apresentar.<br> Ele precisa lutar para sobreviver<br><br>" +
                "PERGUNTA: WHILE é uma estrutura de repetição que executa um conjunto de comandos múltiplas vezes?</html>");
        tdesafio3.setForeground(Color.white);
        tdesafio3.setFont(fontedesafios);
        tdesafio3.setVerticalAlignment(SwingConstants.TOP);
    
        fundoalternativasd3 = new JPanel();
        fundoalternativasd3.setBounds(100, 380, 800, 140);
        fundoalternativasd3.setBackground(Color.black);
        fundoalternativasd3.setLayout(new GridLayout(2, 2, 10, 10));
        con.add(fundoalternativasd3);
    
        String[] alternativas = {
                "<html>Não, while não é uma estrutura de<br> repetição e sim uma classe do java.</html>",  // Errada
                "<html>Não, while não é uma estrutura de<br> repetição e sim uma condicional.</html>",     // Errada
                "<html>Sim, o while é uma estrutura de <br>repetição e executa quando já é determinado<br> o número de repetições.</html>", // Errada
                "<html>Sim, while é uma estrutura de<br> repetição e executa quando a<br> condição for verdadeira.</html>" // Correta
        };
        int respostaCorreta = 3; 
    
        
        final Runnable[] embaralharAlternativas = new Runnable[1];
    
        embaralharAlternativas[0] = () -> {
            fundoalternativasd3.removeAll(); 
    
            
            List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
            Collections.shuffle(alternativasEmbaralhadas);
    
            
            for (String alternativa : alternativasEmbaralhadas) {
                JButton botaoAlternativa = new JButton(alternativa);
                botaoAlternativa.setFont(fontedesafios);
                botaoAlternativa.setFocusPainted(false);
                botaoAlternativa.setBackground(Color.black);
                botaoAlternativa.setForeground(Color.white);
                botaoAlternativa.setContentAreaFilled(false);
    
                
                botaoAlternativa.addActionListener(a -> {
                    if (alternativa.equals(alternativas[respostaCorreta])) {
                        verificarResposta(true); 
                        abnoxterra(); 
                        janeladesafio3.dispose(); 
                    } else {
                        verificarResposta(false); 
                        embaralharAlternativas[0].run(); 
                    }
                });
    
                fundoalternativasd3.add(botaoAlternativa); 
            }
    
            fundoalternativasd3.revalidate(); 
            fundoalternativasd3.repaint();   
        };
    
        
        embaralharAlternativas[0].run();
    
        fundodesafio3.add(tdesafio3);
        con.add(fundodesafio3);
        janeladesafio3.setVisible(true);
    }
        public void abnoxterra(){
        janelanoxterra = new JFrame("Dialogo 2");
        janelanoxterra.setSize(1000, 700);
        janelanoxterra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelanoxterra.setResizable(false);
        janelanoxterra.getContentPane().setBackground(Color.black);
        janelanoxterra.setLocationRelativeTo(null);
        janelanoxterra.setLayout(new BorderLayout());
    
    
        fundojnoxterra = new JPanel();
        fundojnoxterra.setBackground(Color.black);
        fundojnoxterra.setLayout(new BoxLayout(fundojnoxterra, BoxLayout.Y_AXIS));
        fundojnoxterra.setBorder(new EmptyBorder(20, 20, 20, 20));
    
    
      String texto = """ 
        Guardião: Parem! O que pensam que estão fazendo? Este é a Mão do Rei de Olin!

        Narrador: Os guardas param imediatamente e se ajoelham, pedindo perdão.

        Kote: Não sabia que vocês recebiam visitantes de forma tão calorosa.

        Guardião: Peço desculpas pelo ocorrido. Posso garantir que eles serão punidos severamente.

        Kote: Não será necessário. Estou aqui para propor um acordo com Noxterra. Nós não queremos que vocês se isolem, e acredito que vocês também não queiram perder o acesso pelo Porto Real.

        Guardião: Esse não é um assunto que podemos discutir aqui fora. Venha, entre, e lhe explicarei o motivo de nossa hesitação.

        Narrador: Kote lança um olhar desconfiado para o homem à sua frente, mas decide segui-lo para dentro da torre.

          """;
    
      textonox = new JTextArea(texto);
      textonox.setWrapStyleWord(true);
      textonox.setLineWrap(true);
      textonox.setOpaque(false);
      textonox.setEditable(false);
      textonox.setForeground(Color.white);
      textonox.setFont(fontecorpo2);
    
     
      fundojnoxterra.add(textonox);
      
      InputMap mj = fundojnoxterra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
      ActionMap mj1 = fundojnoxterra.getActionMap();
      mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
      mj1.put("enterPressed", new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        abdesafio4();
        janelanoxterra.dispose();
            }
        });
        janelanoxterra.getContentPane().add(fundojnoxterra);
        janelanoxterra.setVisible(true);
     }

     public void abDialogo4() {
        janelaDialogo4 = new JFrame("Dialogo 4");
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
        Guardião de Noxxtera: ” - Bem-vindo, Kote, O tempo aqui não é linear, o Diário de Arquimedes está escondido dentro deste baú. Mas para abri-lo, você precisará decifrar o código que mantém o baú fechado.  
        Kote: Um código... isso não será fácil. Que tipo de enigma poderia proteger algo tão poderoso?
        Guardião de Noxxterra: O código é uma série de perguntas sobre o tempo e os eventos que moldaram este reino.
        Kote: Entendi. Preciso me lembrar da história de Noxterra e de seus segredos.""";
    
        textodi4 = new JTextArea(texto);
        textodi4.setWrapStyleWord(true);
        textodi4.setLineWrap(true);
        textodi4.setOpaque(false);
        textodi4.setEditable(false);
        textodi4.setForeground(Color.white);
        textodi4.setFont(fontecorpo);
    
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
    
    @SuppressWarnings("unused")
    public void abdesafio4() {
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
    
        tdesafio4 = new JLabel("<html> O ambiente é iluminado pelo luar da lua, e um ar misterioso envolve o lugar.<br>" + 
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
        fundoalternativasd4.setBounds(80, 480, 800, 140);
        fundoalternativasd4.setBackground(Color.black);
        fundoalternativasd4.setLayout(new GridLayout(2, 2, 10, 10));
        con.add(fundoalternativasd4);
    
        String[] alternativas = {
            "2", // Correta
            "4", // Errada
            "3", // Errada
            "4"  // Errada
        };
        int respostaCorreta = 0;
    
        final Runnable[] embaralharAlternativas = new Runnable[1];
    
        embaralharAlternativas[0] = () -> {
            fundoalternativasd4.removeAll();
    
            List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
            Collections.shuffle(alternativasEmbaralhadas);
    
            for (String alternativa : alternativasEmbaralhadas) {
                JButton botaoAlternativa = new JButton(alternativa);
                botaoAlternativa.setFont(fontedesafios);
                botaoAlternativa.setFocusPainted(false);
                botaoAlternativa.setBackground(Color.black);
                botaoAlternativa.setForeground(Color.white);
                botaoAlternativa.setContentAreaFilled(false);
    
                botaoAlternativa.addActionListener(a -> {
                    if (alternativa.equals(alternativas[respostaCorreta])) {
                        verificarResposta(true);
                        abDialogo5();
                        janeladesafio4.dispose();
                    } else {
                        verificarResposta(false);
                        embaralharAlternativas[0].run();
                    }
                });
    
                fundoalternativasd4.add(botaoAlternativa);
            }
    
            fundoalternativasd4.revalidate();
            fundoalternativasd4.repaint();
        };
    
        embaralharAlternativas[0].run();
    
        fundodesafio4.add(tdesafio4);
        con.add(fundodesafio4);
        janeladesafio4.setVisible(true);
    }
    
    
    public void abDialogo5() { 
        janelaDialogo5 = new JFrame("Dialogo 5");
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
        textodi5.setFont(fontecorpo);
    
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
    

    @SuppressWarnings("unused")
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
        fundodesafio5.setBounds(20, 50, 900, 600);
        fundodesafio5.setBackground(Color.black);
        fundodesafio5.setLayout(new BorderLayout());
    
        sistemaVida = criarSistemaVida();
        con.add(sistemaVida);
    
        tdesafio5 = new JLabel("<html>Com o Diário de Arquimendes finalmente em mãos, Kote sente o poder e o conhecimento antigo fluindo através dele.<br>" + 
                        "Páginas brilham com runas misteriosas que começam a se reorganizar em um idioma compreensível<br>" + 
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
        con.add(fundoalternativasd5);
    
        String[] alternativas = {
            "<html>É utilizado quando não se sabe<br> exatamente quantas vezes o código será repetido.</html>", // Errada
            "<html>É utilizado quando se sabe o número<br> de repetições.</html>", // Correta
            "<html>É utilizado quando uma condição é true/verdadeira.</html>", // Errada
            "<html>É utilizado quando uma condição é true/verdadeira mas essa condição é verificada apenas no final da repetição.</html>" // Errada
        };
        int respostaCorreta = 1;
    
        final Runnable[] embaralharAlternativas = new Runnable[1];
    
        embaralharAlternativas[0] = () -> {
            fundoalternativasd5.removeAll(); 
    
            List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
            Collections.shuffle(alternativasEmbaralhadas);
    
            for (String alternativa : alternativasEmbaralhadas) {
                JButton botaoAlternativa = new JButton(alternativa);
                botaoAlternativa.setFont(fontedesafios);
                botaoAlternativa.setFocusPainted(false);
                botaoAlternativa.setBackground(Color.black);
                botaoAlternativa.setForeground(Color.white);
                botaoAlternativa.setContentAreaFilled(false);
    
                botaoAlternativa.addActionListener(a -> {
                    if (alternativa.equals(alternativas[respostaCorreta])) {
                        verificarResposta(true); 
                        abDialogo6(); 
                        janeladesafio5.dispose();
                    } else {
                        verificarResposta(false); 
                        embaralharAlternativas[0].run(); 
                    }
                });
    
                fundoalternativasd5.add(botaoAlternativa); 
            }
    
            fundoalternativasd5.revalidate();
            fundoalternativasd5.repaint();   
        };
    
        embaralharAlternativas[0].run(); 
    
        fundodesafio5.add(tdesafio5);
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
  textoDi6.setFont(fontecorpo);


 
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
@SuppressWarnings("unused")
public void abdesafio6() {
    janeladesafio6 = new JFrame("Desafio 6"); 
    janeladesafio6.setSize(1000, 700);
    janeladesafio6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janeladesafio6.setResizable(false);
    janeladesafio6.getContentPane().setBackground(Color.black);
    janeladesafio6.setLocationRelativeTo(null);
    janeladesafio6.setLayout(null);
    con = janeladesafio6.getContentPane();

    fundodesafio6 = new JPanel();
    fundodesafio6.setBounds(20, 50, 900, 600);
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
    tdesafio6.setHorizontalAlignment(SwingConstants.LEFT);
    fundodesafio6.add(tdesafio6, BorderLayout.NORTH);

    fundoalternativasd6 = new JPanel();
    fundoalternativasd6.setBounds(100, 380, 800, 100);
    fundoalternativasd6.setBackground(Color.black);
    fundoalternativasd6.setLayout(new GridLayout(2, 2, 10, 10)); 
    con.add(fundoalternativasd6);

    String[] alternativas = {
        "For", // Errada
        "If",  // Errada
        "Else", // Correta
        "Do-while" // Errada
    };
    int respostaCorreta = 2; 

    final Runnable[] embaralharAlternativas = new Runnable[1];

    embaralharAlternativas[0] = () -> {
        fundoalternativasd6.removeAll();

        List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
        Collections.shuffle(alternativasEmbaralhadas);

        for (String alternativa : alternativasEmbaralhadas) {
            JButton botaoAlternativa = new JButton(alternativa);
            botaoAlternativa.setFont(fontedesafios);
            botaoAlternativa.setFocusPainted(false);
            botaoAlternativa.setBackground(Color.black);
            botaoAlternativa.setForeground(Color.white);
            botaoAlternativa.setContentAreaFilled(false);

            botaoAlternativa.addActionListener(a -> {
                if (alternativa.equals(alternativas[respostaCorreta])) {
                    verificarResposta(true); 
                    abDialogo7();
                    janeladesafio6.dispose(); 
                } else {
                    verificarResposta(false);
                    embaralharAlternativas[0].run(); 
                }
            });

            fundoalternativasd6.add(botaoAlternativa);
        }

        fundoalternativasd6.revalidate();
        fundoalternativasd6.repaint();
    };

    embaralharAlternativas[0].run(); // Executa o embaralhamento inicial

    fundodesafio6.add(tdesafio6);
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
    textodi7.setFont(fontecorpo);

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
    janelaDialogo7.setVisible(true);
}

@SuppressWarnings("unused")
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
    fundodesafio7.setBounds(30, 50, 900, 600);
    fundodesafio7.setBackground(Color.black);
    fundodesafio7.setLayout(new BorderLayout());

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio7 = new JLabel("<html>Os Guardiões do Tempo surgem e desafiam o guerreiro:<br>" + 
                        "Responda corretamente:<br>" + 
                        "Qual estrutura de controle é utilizada para executar um bloco de código apenas quando uma condição não é verdadeira?</html>");
    tdesafio7.setForeground(Color.white);
    tdesafio7.setFont(fontedesafios);
    tdesafio7.setVerticalAlignment(SwingConstants.TOP);
    tdesafio7.setHorizontalAlignment(SwingConstants.LEFT);
    fundodesafio7.add(tdesafio7, BorderLayout.NORTH); 

    fundoalternativasd7 = new JPanel();
    fundoalternativasd7.setBounds(80, 380, 800, 100);
    fundoalternativasd7.setBackground(Color.black);
    fundoalternativasd7.setLayout(new GridLayout(2, 2, 10, 10)); 
    con.add(fundoalternativasd7);

    String[] alternativas = {
        "Switch", // Errada
        "Break", // Errada
        "For", // Errada
        "Else" // Correta
    };
    int respostaCorreta = 3; 

    final Runnable[] embaralharAlternativas = new Runnable[1];

    embaralharAlternativas[0] = () -> {
        fundoalternativasd7.removeAll(); 

        List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
        Collections.shuffle(alternativasEmbaralhadas);

        for (String alternativa : alternativasEmbaralhadas) {
            JButton botaoAlternativa = new JButton(alternativa);
            botaoAlternativa.setFont(fontedesafios);
            botaoAlternativa.setFocusPainted(false);
            botaoAlternativa.setBackground(Color.black);
            botaoAlternativa.setForeground(Color.white);
            botaoAlternativa.setContentAreaFilled(false);

            botaoAlternativa.addActionListener(a -> {
                if (alternativa.equals(alternativas[respostaCorreta])) {
                    verificarResposta(true); 
                    abDialogo8(); 
                    janeladesafio7.dispose(); 
                } else {
                    verificarResposta(false); 
                    embaralharAlternativas[0].run(); 
                }
            });

            fundoalternativasd7.add(botaoAlternativa);
        }

        fundoalternativasd7.revalidate();
        fundoalternativasd7.repaint();
    };

    embaralharAlternativas[0].run();

    fundodesafio7.add(tdesafio7);
    con.add(fundodesafio7);    
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
    Enquanto as palavras mágicas ecoam na sala, uma luz intensa irrompe do círculo, envolvendo-o em um brilho ofuscante. A sensação de perda se intensifica, como se uma parte de sua essência estivesse sendo arrancada.De repente, a luz se transforma em um turbilhão, e Kote sente seu corpo sendo puxado para um outro lugar e tempo. O último vislumbre que tem é da biblioteca, se dissipando como fumaça.
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
  
@SuppressWarnings("unused")
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
    fundodesafio8.setBounds(20, 50, 900, 600);
    fundodesafio8.setBackground(Color.black);
    fundodesafio8.setLayout(new BorderLayout());

    sistemaVida = criarSistemaVida();
    con.add(sistemaVida);

    tdesafio8 = new JLabel("<html>Cenário: Kote está prestes a entrar em uma batalha e precisa decidir sua ação com base em seu nível de energia.<br><br>" +
                "Instrução: Determine qual ação Kote deve tomar de acordo com as seguintes condições:<br><br>" +
                "if(energia>50){<br>" +
                "Atacar o inimigo.<br>" +
                "}else if(energia>= 21 && energia<= 50){<br>" +
                "Kote decide se defender.<br> " +
                "}else if(energia <= 20) {<br> " +
                "Kote decide fugir da batalha. <br>" +
                "}<br>" +
                "Pergunta:<br>" +
                "Qual ação Kote deve tomar se seu nível de energia for 45?;</html>");
    tdesafio8.setForeground(Color.white);
    tdesafio8.setFont(fontedesafios);
    tdesafio8.setVerticalAlignment(SwingConstants.TOP);
    tdesafio8.setHorizontalAlignment(SwingConstants.LEFT);
    fundodesafio8.add(tdesafio8, BorderLayout.NORTH); 

    fundoalternativasd8 = new JPanel();
    fundoalternativasd8.setBounds(80, 380, 800, 100);
    fundoalternativasd8.setBackground(Color.black);
    fundoalternativasd8.setLayout(new GridLayout(2, 2, 10, 10)); 
    con.add(fundoalternativasd8);

    String[] alternativas = {
        "Atacar",  // Errada
        "Defender", // Correta
        "Fugir",  // Errada
        "Parado"   // Errada
    };
    int respostaCorreta = 1; // A resposta correta é "Defender"

    final Runnable[] embaralharAlternativas = new Runnable[1];

    embaralharAlternativas[0] = () -> {
        fundoalternativasd8.removeAll(); // Remove botões anteriores

        List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
        Collections.shuffle(alternativasEmbaralhadas);

        for (String alternativa : alternativasEmbaralhadas) {
            JButton botaoAlternativa = new JButton(alternativa);
            botaoAlternativa.setFont(fontedesafios);
            botaoAlternativa.setFocusPainted(false);
            botaoAlternativa.setBackground(Color.black);
            botaoAlternativa.setForeground(Color.white);
            botaoAlternativa.setContentAreaFilled(false);

            botaoAlternativa.addActionListener(a -> {
                if (alternativa.equals(alternativas[respostaCorreta])) {
                    verificarResposta(true); 
                    abDialogo9(); 
                    janeladesafio8.dispose(); 
                } else {
                    verificarResposta(false); 
                    embaralharAlternativas[0].run(); // Embaralha novamente se errar
                }
            });

            fundoalternativasd8.add(botaoAlternativa);
        }

        fundoalternativasd8.revalidate(); // Atualiza o layout
        fundoalternativasd8.repaint();    // Redesenha o painel
    };

    embaralharAlternativas[0].run(); // Executa o embaralhamento inicial

    fundodesafio8.add(tdesafio8);
    con.add(fundodesafio8);
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
@SuppressWarnings("unused")
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

    tdesafio9 = new JLabel("<html>Os Guardiões do Tempo exigem que você prove seu valor resolvendo um enigma.<br>"+ 
                             "Eles perguntam: “Qual método é usado para ordenar um ArrayList?</html>");
    tdesafio9.setForeground(Color.white);
    tdesafio9.setFont(fontedesafios);
    tdesafio9.setVerticalAlignment(SwingConstants.TOP);
    tdesafio9.setHorizontalAlignment(SwingConstants.LEFT);
    fundodesafio9.add(tdesafio9, BorderLayout.NORTH); 

    fundoalternativasd9 = new JPanel();
    fundoalternativasd9.setBounds(100, 380, 800, 100);
    fundoalternativasd9.setBackground(Color.black);
    fundoalternativasd9.setLayout(new GridLayout(2, 2, 10, 10)); 
    con.add(fundoalternativasd9);

    String[] alternativas = {
        "Sort()",  // Correta
        "Order()", // Errada
        "Array()", // Errada
        "Add()"    // Errada
    };
    int respostaCorreta = 0; 

    final Runnable[] embaralharAlternativas = new Runnable[1];

    embaralharAlternativas[0] = () -> {
        fundoalternativasd9.removeAll(); 

        List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
        Collections.shuffle(alternativasEmbaralhadas);

        for (String alternativa : alternativasEmbaralhadas) {
            JButton botaoAlternativa = new JButton(alternativa);
            botaoAlternativa.setFont(fontedesafios);
            botaoAlternativa.setFocusPainted(false);
            botaoAlternativa.setBackground(Color.black);
            botaoAlternativa.setForeground(Color.white);
            botaoAlternativa.setContentAreaFilled(false);

            botaoAlternativa.addActionListener(a -> {
                if (alternativa.equals(alternativas[respostaCorreta])) {
                    verificarResposta(true); 
                    abjaneladecisao(); 
                    janeladesafio9.dispose(); 
                } else {
                    verificarResposta(false); 
                    embaralharAlternativas[0].run(); 
                }
            });

            fundoalternativasd9.add(botaoAlternativa);
        }

        fundoalternativasd9.revalidate(); 
        fundoalternativasd9.repaint();    
    };

    embaralharAlternativas[0].run(); 

    fundodesafio9.add(tdesafio9);
    con.add(fundodesafio9);
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


    fundobdecisao = new JPanel();
    fundobdecisao.setBounds(100, 380, 800, 150);
    fundobdecisao.setBackground(Color.black);
    fundobdecisao.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

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

    fundojdecisao.add(textodecisao);
    fundojdecisao.add(fundobdecisao);

    janeladecisao.getContentPane().add(fundojdecisao);
    janeladecisao.setVisible(true);
}

public void executarDecisao(String decisao) {
    switch (decisao) {
        case "matar":
            JOptionPane.showMessageDialog(null, "Você decidiu matar o rei. As consequências de sua escolha reverberarão pelo reino.");
            abDialogo101();
            janeladecisao.dispose();
            break;
        case "poupar":
            JOptionPane.showMessageDialog(null, "Você decidiu poupar o rei. Sua compaixão pode ter um impacto inesperado no futuro.");
            abDialogo102();
            janeladecisao.dispose();
            break;
    }
}

public void abDialogo101(){
    janelaDialogo101 = new JFrame("Dialogo 10");
    janelaDialogo101.setSize(1000, 700);
    janelaDialogo101.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janelaDialogo101.setResizable(false);
    janelaDialogo101.getContentPane().setBackground(Color.black);
    janelaDialogo101.setLocationRelativeTo(null);
    janelaDialogo101.setLayout(new BorderLayout());


    fundojDialogo101 = new JPanel();
    fundojDialogo101.setBackground(Color.black);
    fundojDialogo101.setLayout(new BoxLayout(fundojDialogo101, BoxLayout.Y_AXIS));
    fundojDialogo101.setBorder(new EmptyBorder(20, 20, 20, 20));


  String texto = """ 
    Kote: "Já resolvi o enigma do fôlego. Agora, para proteger Olin, preciso agir."


    Rei Sebastian: "Você acha que pode me deter? Eu sou o rei!"


    Kote: "Por Noxterra, eu não hesitarei."


    Rei Sebastian: "Você não pode me derrotar!"


    Narrador: Kote, impulsionado pelo poder do diário e sua determinação, lança um feitiço poderoso, atingindo o rei diretamente no coração.


    O brilho do diário resplandece enquanto Sebastian cai, sua expressão de desespero se transforma em uma expressão de compreensão.


    Kote: "Que isso sirva de lição. O poder sem sabedoria é um caminho para a destruição."


    Narrador: O rei cai, e a sala se silencia. Kote observa o corpo do rei, ciente do peso de sua decisão, mas também da necessidade de um novo começo para Olin.


    Kote: "Agora, Olin  terá a chance de renascer, guiado por aqueles que realmente se importam."
    """;

  textodi101 = new JTextArea(texto);
  textodi101.setWrapStyleWord(true);
  textodi101.setLineWrap(true);
  textodi101.setOpaque(false);
  textodi101.setEditable(false);
  textodi101.setForeground(Color.white);
  textodi101.setFont(fontecorpo2);


 
  fundojDialogo101.add(textodi101);
  janelaDialogo101.getContentPane().add(fundojDialogo101);
  janelaDialogo101.setVisible(true);


  
  InputMap mj = fundojDialogo101.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
  ActionMap mj1 = fundojDialogo101.getActionMap();
  mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
  mj1.put("enterPressed", new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        abseudesafio10(); 
        janelaDialogo101.dispose();
      }
  });


}
 public void abDialogo102(){
    janelaDialogo102 = new JFrame("Dialogo 10");
    janelaDialogo102.setSize(1000, 700);
    janelaDialogo102.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janelaDialogo102.setResizable(false);
    janelaDialogo102.getContentPane().setBackground(Color.black);
    janelaDialogo102.setLocationRelativeTo(null);
    janelaDialogo102.setLayout(new BorderLayout());


    fundojDialogo102 = new JPanel();
    fundojDialogo102.setBackground(Color.black);
    fundojDialogo102.setLayout(new BoxLayout(fundojDialogo102, BoxLayout.Y_AXIS));
    fundojDialogo102.setBorder(new EmptyBorder(20, 20, 20, 20));


  String texto = """ 
    Narrador: Com a resposta certa, a barreira se dissolve, permitindo que Kote se aproxime do rei.


    Kote: (olhando nos olhos de Sebastian) "Rei Sebastian, o poder pode ser tentador, mas ele deve ser equilibrado com sabedoria e compaixão."


    Rei Sebastian: (refletindo) "Você fala verdade, Kote. O poder não é um fardo leve."


    Kote: "Juntos, podemos governar OLIN com justiça. Você pode usar o Diário de Arquimedes para o bem, e eu estarei ao seu lado, como conselheiro."


    Rei Sebastian: (sorrindo) "Talvez sua ingênua bravura possa ser a chave que precisamos. Um rei e seu conselheiro, unidos pelo propósito."

    Narrador: E assim, com a sabedoria de Kote e a determinação de Sebastian, OLIN renasce sob uma nova era de prosperidade, onde o poder é usado para proteger,
    e a ambição é guiada pelo amor ao povo.
    """;


  textodi102 = new JTextArea(texto);
  textodi102.setWrapStyleWord(true);
  textodi102.setLineWrap(true);
  textodi102.setOpaque(false);
  textodi102.setEditable(false);
  textodi102.setForeground(Color.white);
  textodi102.setFont(fontecorpo2);


 
  fundojDialogo102.add(textodi102);
  janelaDialogo102.getContentPane().add(fundojDialogo102);
  janelaDialogo102.setVisible(true);


  
  InputMap mj = fundojDialogo102.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
  ActionMap mj1 = fundojDialogo102.getActionMap();
  mj.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterPressed");
  mj1.put("enterPressed", new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        abseudesafio10();
        janelaDialogo102.dispose(); 
      }
  });


 }



 @SuppressWarnings("unused")
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
    tdesafio10.setVerticalAlignment(SwingConstants.TOP);
    tdesafio10.setHorizontalAlignment(SwingConstants.LEFT);
    fundodesafio10.add(tdesafio10, BorderLayout.NORTH);

    fundoalternativasd10 = new JPanel();
    fundoalternativasd10.setBounds(80, 380, 800, 100);
    fundoalternativasd10.setBackground(Color.black);
    fundoalternativasd10.setLayout(new GridLayout(2, 2, 10, 10));
    con.add(fundoalternativasd10);

    String[] alternativas = {
        "<html>ArrayList — Recuperar um artefato sagrado para a Facção A.</html>", // Correta
        "<html>Array — Eliminar um traidor na Facção B.</html>", // Errada
        "<html>ArrayList — Eliminar um traidor na Facção B.</html>", // Errada
        "<html>Array — Recuperar um artefato sagrado para a Facção A.</html>" // Errada
    };
    int respostaCorreta = 0; 

    final Runnable[] embaralharAlternativas = new Runnable[1];

    embaralharAlternativas[0] = () -> {
        fundoalternativasd10.removeAll(); 

        List<String> alternativasEmbaralhadas = new ArrayList<>(List.of(alternativas));
        Collections.shuffle(alternativasEmbaralhadas);

        for (String alternativa : alternativasEmbaralhadas) {
            JButton botaoAlternativa = new JButton(alternativa);
            botaoAlternativa.setFont(fontedesafios);
            botaoAlternativa.setFocusPainted(false);
            botaoAlternativa.setBackground(Color.black);
            botaoAlternativa.setForeground(Color.white);
            botaoAlternativa.setContentAreaFilled(false);

            botaoAlternativa.addActionListener(a -> {
                if (alternativa.equals(alternativas[respostaCorreta])) {
                    verificarResposta(true); 
                    abprimeirajanela(); 
                    janeladesafio10.dispose(); 
                } else {
                    verificarResposta(false); 
                    embaralharAlternativas[0].run(); 
                }
            });

            fundoalternativasd10.add(botaoAlternativa);
        }

        fundoalternativasd10.revalidate(); 
        fundoalternativasd10.repaint();  
    };

    embaralharAlternativas[0].run(); 

    fundodesafio10.add(tdesafio10);
    con.add(fundodesafio10);
    janeladesafio10.setVisible(true);
}


private void verificarResposta(boolean respostaCorreta) {
    if (respostaCorreta) {
        JOptionPane.showMessageDialog(null, "Resposta correta!");
    } else {
        vida--; // Subtrai 1 da vida
        sistemaVida.setText("Vida: " + vida); // atualiza vida

        if (vida <= 0) {
            JOptionPane.showMessageDialog(null, "Você morreu!");
            abprimeirajanela(); // Reinicia o jogo
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

                                                                                        *clique ENTER para continuar
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
    
        
        fundojcomojogar2.add(textocj2);
    
        JButton bvoltar = botaovoltar(janelacomojogar2);
        fundojcomojogar2.add(bvoltar);
        
        
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
        fundojcreditos.setBackground(Color.black);
        fundojcreditos.setLayout(new BoxLayout(fundojcreditos, BoxLayout.Y_AXIS));
        fundojcreditos.setBorder(new EmptyBorder(20, 20, 20, 20));
        fundojcreditos.setBounds(100, 100, 800, 500); 
    
        
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
