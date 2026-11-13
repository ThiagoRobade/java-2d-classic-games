package br.com.mvbos.lgj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InterativoMouse extends JFrame {

    private JPanel tela;
    private int px;
    private int py;
    private Point mouseClick = new Point();
    private boolean jogando = true;
    private final int FPS = 1000 / 20; // 50ms

    public InterativoMouse() {
        tela = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, tela.getWidth(), tela.getHeight());

                int x = px - 20;
                int y = py - 20;

                g.setColor(Color.BLUE);
                g.fillRect(x, y, 40, 40);
                g.drawString("Agora eu estou em " + x + "x" + y, 5, 10);
            }
        };

        tela.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                mouseClick = e.getPoint();
            }
        });

        getContentPane().add(tela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }

    public void inicia() {
        long prxAtualizacao = 0;

        while (jogando) {
            if (System.currentTimeMillis() >= prxAtualizacao) {
                atualizaJogo();
                tela.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;
            }
        }
    }

    private void atualizaJogo() {
        px = mouseClick.x;
        py = mouseClick.y;
    }

    public static void main(String[] args) {
        InterativoMouse jogo = new InterativoMouse();
        jogo.inicia();
    }
}
