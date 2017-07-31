package Decks;

import Cards.ImageParser;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DeckFacade {

    // Background
    public static BufferedImage background;

    // Images
    private ImageParser ip;

    // Decks
    // TODO: add decks

    // TODO: Finish constructor
    public DeckFacade() {
        ip = ImageParser.getInstance();
        // initialize the decks

        // Fill the deck with cards and shuffle

        // deal cards to the board
    }

    // TODO: Finish draw
    public void draw(Graphics2D g) {
        g.drawImage(background, 0, 0, null);
        // draw your decks
    }

    // Called whenever the mouse is clicked
    // @param p     the point where the mouse was clicked
    // TODO: finish click method
    public void clickedIn(Point p) {
        // do work
    }

}
