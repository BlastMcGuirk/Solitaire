package DataStructures;

import Cards.Card;

public class LinkedList {
    private Link firstLink;

    public LinkedList()
    {
        firstLink = null;
    }

    // true if empty, false otherwise
    public boolean empty()
    {
        return firstLink == null;
    }

    // add an Object to our list
    public void add (Card newCard)
    {
        firstLink = new Link(newCard, firstLink);
    }

    // inspect front of list
    public Card front()
    {
        if (firstLink == null)
            return null;

        return firstLink.getCard();
    }

    // pop front of list
    public Card pop()
    {
        if (firstLink == null)
            return null;

        Card result = firstLink.getCard();
        firstLink = firstLink.getNext();
        return result;
    }

    // return an iterator for the list
    public ListIterator iterator()
    {
        return new ListIterator(firstLink);
    }
}
