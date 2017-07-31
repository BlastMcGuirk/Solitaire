package Decks;

import Cards.Card;
import DataStructures.LinkedList;
import DataStructures.ListIterator;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CardPile {

    // Blank image
    public static BufferedImage blankPile;

    // Location
    protected int x;
    protected int y;

    // Actual pile of cards
    protected LinkedList pile;

    public CardPile(int x, int y) {
        this.x = x;
        this.y = y;
        pile = new LinkedList();
    }

    ////////////////////////////////
    //
    //    Non-overridable methods
    //
    ////////////////////////////////
    public final boolean isEmpty() { return pile.empty(); }
    public final Card popCard() { return pile.pop(); }
    public final Card frontCard() { return pile.front(); }
    public int getNumCards() {
        int count = 0;
        ListIterator iterator = pile.iterator();
        while (!iterator.atEnd()) {
            count++;
            iterator.next();
        }
        return count;
    }

    ////////////////////////////////
    //
    //    Possibly overridden methods
    //
    ////////////////////////////////
    public void addCard(Card c) {
        pile.add(c);
    }

    public boolean contains(Point point) {
        return (point.x > x && point.x < x + Card.WIDTH &&
                point.y > y && point.y < y + Card.HEIGHT);
    }

    public void draw(Graphics2D g) {
        if (!pile.empty()) {
            g.drawImage(frontCard().getImg(), x, y, null);
        } else {
            g.drawImage(CardPile.blankPile, x, y, null);
        }
    }

    public boolean canTake(Card c) {
        return false;
    }

}
