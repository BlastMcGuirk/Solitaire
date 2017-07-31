package Cards;

import java.awt.image.BufferedImage;



public class Card {
    // Global Cards.Card description
    public static final int WIDTH = 79;
    public static final int HEIGHT = 123;

    public static final int ACE = 0;
    public static final int KING = 12;

    public static BufferedImage cardBack;

    // Card descriptions
    // TODO: Add more descriptions for card
    private BufferedImage img;

    // TODO: Add parameters to constructor
    public Card() {

    }

    // TODO: Getters/Setters and upgrade getImg
    public BufferedImage getImg() {
        return img;
    }
}
