package br.com.mvbos.lgj;
import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    private JPanel tela;

    public Janela() {

        tela = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                // TODO: A pintura ocorre aqui
            }
        };

        super.getContentPane().add(tela);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }

    static void main() {
        new Janela();
    }
}
