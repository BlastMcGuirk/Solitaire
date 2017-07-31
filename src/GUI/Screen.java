package GUI;

import Decks.DeckFacade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Screen extends JPanel implements Runnable, MouseListener {

    // Global panel description
    private static final int WIDTH = 700;
    private static final int HEIGHT = 600;

    // Graphics
    private BufferedImage image;
    private Graphics2D g;

    // Game thread
    private Thread thread;
    private boolean running;
    private int FPS = 60;
    private long targetTime = 1000 / FPS;

    // Facade pattern holding decks
    private DeckFacade decks;

    public Screen() {
        super();
        setPreferredSize(
                new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
    }

    public void addNotify() {
        super.addNotify();
        if(thread == null) {
            thread = new Thread(this);
            addMouseListener(this);
            thread.start();
        }
    }

    private void init() {
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) image.getGraphics();
        running = true;
        decks = new DeckFacade();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Used for single click card movement
        //System.out.println("mouseClicked!");
        decks.clickedIn(e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Used with mouseReleased for drag card movement
        //System.out.println("mousePressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Used with mousePressed for drag card movement
        //System.out.println("mouseReleased!");
    }

    @Override
    public void mouseEntered(MouseEvent e) { /* Not used */ }
    @Override
    public void mouseExited(MouseEvent e) { /* Not used */ }

    @Override
    public void run() {
        init();

        long start;
        long elapsed;
        long wait;

        // game loop
        while(running) {

            start = System.nanoTime();

            decks.draw(g);
            drawToScreen();

            elapsed = System.nanoTime() - start;

            wait = targetTime - elapsed / 1000000;
            if(wait < 0) wait = 5;

            try {
                Thread.sleep(wait);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void drawToScreen() {
        Graphics g2 = getGraphics();
        g2.drawImage(image, 0, 0, WIDTH, HEIGHT, null);
        g2.dispose();
    }
}
