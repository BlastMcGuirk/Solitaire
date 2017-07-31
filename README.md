# Solitaire

Hey Joe and Vitali! Lets make Solitaire!

We should be using git to save progress so we can each work on a part, and then have it available for others to use. Git isn't too hard, but is really confusing at first.

## Git

So basically, your code is stored in a Repository, and that repository is stored on github. Your repository has all your code and files and stuff. If you can, download IntelliJ IDEA Community edition, it's wicked good, and free! https://www.jetbrains.com/idea/download/#section=windows So once you open up your IDE, go to File -> New -> Project from Version Control -> Git, and enter in this URL https://github.com/BlastMcGuirk/Solitaire.git Name it whatever (something like... Solitaire?). Once it opens up, you should have all the code. If it doesn't work, text me... :/

Now that you have it open, you can begin to code and whatnot. Once you have coded something and you think it's right, go up to the top bar and click VCS -> Commit. There you select the files that you changed, and checkmark those boxes. Then you type a message in the Commit part, something informative about what you changed, and click commit at the bottom right. The message should be short and concise, so like, if you worked on Card class, write "Added select method to Card". Then select VCS -> Git -> Push.

The code should then (hopefully) be pushed on to the repository back on github, and then anyone can get the code from there. If you wanna get someone else's changes, first commit any work you have done (if you haven't changed anything then don't commit anything), and click VCS -> Git -> Pull. This will update your code to look like this repository.

## TODO

Currently, nothing needs to be done to Solitaire.java, GUI/Screen.java, Cards/ImageParser.java or anything in DataStructures/\*.java. Decks/CardPile.java should also be good. Everyting else needs stuff done to it.

#### Files to work on
Cards/Card.java
Decks/...
  DeckFacade.java
  DeckPile.java
  DiscardPile.java
  MulticardPile.java
  StackPile.java
  SuitPile.java

Card:
  Card needs to be made from (almost) scratch. Think about what traits a card has. What can it be, what can it have, etc. I had 3 more Card descriptions than what you see there, but you can use as many as you want. Also, make the Constructor adapt to whatever you add. Finally, add getters and setters, and upgrade getImg() so it returns exactly what you want it to return (you'll understand later).

DeckFacade:
  This holds all the decks, and acts as the "manager" for all the decks. It handles mouse clicks too. You gotta add the decks, finish the constructor (I left some obvious hints in comments), finish the drawing of the decks, and finish the click handler.
  
THE REST:
  Each pile has a different function, and it's up to you to implement these functions. The DeckPile is what you draw from, DiscardPile is that you put the cards from the DeckPile in to, StackPile is the main decks thats on the bottom row, like where you try to make big stacks of cards, SuitPile are the ace stacks, where you build up on the same suit, and MulticardPile is sort of a "temporary" pile used to transfer cards between piles (useful for moving a lot of cards, but also capable of moving just one).
  
## Sah

Hmu if u need help with git/code.
