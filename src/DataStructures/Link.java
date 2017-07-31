package DataStructures;

import Cards.Card;

public class Link {

    private Card card;
    private Link next;

    public Link(Card c, Link n) {
        this.card = c;
        this.next = n;
    }

    public Card getCard(){
        return card;
    }

    public Link getNext(){
        return next;
    }

}
