import GUI.Screen;

import javax.swing.*;

public class Solitaire {

    public static void main(String[] args) {

        JFrame window = new JFrame("Solitaire");
        window.setContentPane(new Screen());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);

    }

}
