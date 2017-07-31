package Cards;

import Decks.CardPile;
import Decks.DeckFacade;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageParser {
    // Singleton Pattern
    public static ImageParser ip;

    // File paths
    private final String cardsPath = "./res/cards/cards.png";
    private final String backPath  = "./res/cards/back.png";
    private final String blankPath = "./res/cards/blank.png";
    private final String bgPath = "./res/bg/green.png";

    // Images
    private BufferedImage wholeImage;
    private BufferedImage[][] splitImages;

    private ImageParser() {
        splitImages = new BufferedImage[4][13];
        try {
            wholeImage = ImageIO.read(new File(cardsPath));
            Card.cardBack = ImageIO.read(new File(backPath));
            CardPile.blankPile = ImageIO.read(new File(blankPath));
            DeckFacade.background = ImageIO.read(new File(bgPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 13; c++) {
                splitImages[r][c] = wholeImage.getSubimage(c * Card.WIDTH, r * Card.HEIGHT, Card.WIDTH, Card.HEIGHT);
            }
        }
    }

    public BufferedImage getImage(int suit, int rank) {
        return splitImages[suit][rank];
    }

    public static ImageParser getInstance() {
        if (ip == null)
            ip = new ImageParser();
        return ip;
    }
}
