
package projeto2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestauranteGUI extends JFrame {
    private JTextArea cardapioTextArea;
    private String[] cardapioSemanal;
    private JButton[] buttons;

    public RestauranteGUI() {
        setTitle("Restaurante Universitário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        cardapioSemanal = new String[5]; // 5 dias úteis da semana

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 5));

        buttons = new JButton[5];
        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(diasSemana[i]);
            panel.add(buttons[i]);
        }

        cardapioTextArea = new JTextArea();
        cardapioTextArea.setEditable(false);
        cardapioTextArea.setOpaque(false);
        cardapioTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        cardapioTextArea.setForeground(Color.GRAY);
        cardapioTextArea.setWrapStyleWord(true);
        cardapioTextArea.setLineWrap(true);
        cardapioTextArea.setText("Escolha o dia do almoço que você deseja ver.");

        JScrollPane scrollPane = new JScrollPane(cardapioTextArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        criarCardapioSemanal();

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    exibirCardapio(index);
                }
            });
        }

        setVisible(true);
    }

    private void criarCardapioSemanal() {
        // Cardápios para cada dia da semana
        cardapioSemanal[0] = "Tipos de Arroz: arroz branco ou integral\n"
                + "Tipo de feijão: Feijão preto\n"
                + "Tipo de carne: Carne moída c/ milho\n"
                + "Opção ovolactovegetariano: Fritada c/ cheiro verde\n"
                + "Acompanhamento: Macarrão parafuso ao sugo\n"
                + "Salada: Mix de folhas, tomate em rodelas, pepino em cubos\n"
                + "Suco: Acerola\n"
                + "Suco sem açúcar: Abacaxi\n"
                + "Sobremesa: Banana";

        cardapioSemanal[1] = "Tipos de Arroz: arroz branco\n"
                + "Tipo de feijão: Feijão carioca\n"
                + "Tipo de carne: Filé de frango grelhado\n"
                + "Opção ovolactovegetariano: Hambúrguer de soja\n"
                + "Acompanhamento: Purê de batatas\n"
                + "Salada: Alface, cenoura ralada, beterraba ralada\n"
                + "Suco: Laranja\n"
                + "Suco sem açúcar: Limonada\n"
                + "Sobremesa: Pudim de leite";
    cardapioSemanal[2] = "Tipos de Arroz: arroz branco ou integral\n"
            + "Tipo de feijão: Feijão\n"
            + "Tipo de carne: Bisteca acebolada ou Cubos de frango ao molho\n"
            + "Opção Ovolactovegetariano: Lentilha à bolonhesa\n"
            + "Acompanhamento: Cabotiá Assada\n"
            + "Salada: Chicória, Vinagrete, Berinjela refogada\n"
            + "Suco: Maracujá\n"
            + "Suco sem açúcar: Manga\n"
            + "Sobremesa: Maça";
    cardapioSemanal[3] = "Tipos de Arroz: arroz branco ou integral\n"
            + "Tipo de feijão: Feijão\n"
            + "Tipo de carne: Estrogonofe de Frango\n"
            + "Opção Ovolactovegetariano: Ervilha c/ vinagrete\n"
            + "Acompanhamento: Batata Palha\n"
            + "Salada: Alface, Pepino em rodelas, Cenoura cozida\n"
            + "Suco: Laranja\n"
            + "Suco sem açúcar: Laranja\n"
            + "Sobremesa: Melão";
    cardapioSemanal[4] = "Tipos de Arroz: arroz branco ou integral\n"
            + "Tipo de feijão: Feijão\n"
            + "Tipo de carne: Iscas bovina ao molho madeira\n"
            + "Opção Ovolactovegetariano: Ovos cozidos\n"
            + "Acompanhamento: Cenoura grelhada\n"
            + "Salada: Rúcula, Tomate meia lua, Beterraba ralada\n"
            + "Suco: Caju\n"
            + "Suco sem açúcar: Caju\n"
            + "Sobremesa: Melancia";
    
    cardapioTextArea.setText("Escolha o dia do almoço que você deseja ver.");
    }
    private void exibirCardapio(int dia){
        String cardapioTexto="Almoço - " + buttons[dia].getText() + "\n\n" + cardapioSemanal[dia];
        cardapioTextArea.setText(cardapioTexto);
    }
}




