/**
 *  Represents a card table with a deck and an array
 *  of open cards for the game of SET.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class ZetTable
{
  private ZetDeck deck;

  private final int maxOpenCards = 21;
  private final int dfltOpenCards = 12;
  private ZetCard[] openCards;
  private int numOpenCards;

  /**
   *  Creates a new deck and opens dfltOpenCards cards.
   */
  public ZetTable()
  {
    deck = new ZetDeck();
    deck.shuffle();

    openCards = new ZetCard[maxOpenCards];

    for (int i = 0; i < dfltOpenCards; i++)
      openCards[i] = (ZetCard)deck.takeTop();

    numOpenCards = dfltOpenCards;
  }

  /**
   *  Returns the number of cards left in the deck.
   *  @return the number of cards left in the deck.
   */
  public int cardsInDeck()
  {
    return deck.getNumCards();
  }

  /**
   *  Returns the open card with a given index. If the index is out of bounds
   *  or the card with this index is not open, returns null.
   *  @return the open card with a given index, or null if the index
   *  is out of bounds.
   */
  public ZetCard getOpenCard(int i)
  {
    ZetCard card = null;

    if (i >= 0 && i < maxOpenCards)
       card = openCards[i];

    return card;
  }

  /**
   *  Indicates whether there is a sufficient number of open cards.
   *  @return true if numOpenCards >= dfltOpenCards; false otherwise.
   */
  public boolean enoughOpen()
  {
    return numOpenCards >= dfltOpenCards;
  }

  /**
   *  Finds a "set" in the open cards.
   *  @return an array of the indices of the three "set" cards,
   *  or null if no sets are found.
   */
  public int[] findZet()
  {
    return ZetAnalyzer.findZet(openCards);
  }

  /**
   *  Opens three cards from the deck if three cards are available in the deck.
   *  @return true if the cards are opened; false otherwise.
   */
  public boolean open3Cards()
  {
    if (cardsInDeck() < 3)
      return false;

    int i = 0;
    for (int count = 1; count <= 3; count++)
    {
      // Find the next empty spot:
      while (i < maxOpenCards && openCards[i] != null)
        i++;
      if (i < maxOpenCards)
      {
        openCards[i] = (ZetCard)deck.takeTop();
        numOpenCards++;
      }
      else // should never happen in the game!
        return false;
    }
    return true;
  }

 /**
   *  Removes three cards with given indices from the open cards.
   *  @precondition The cards with indices[0], indices[1], indices[2] are open.
   */
  public void remove3Cards(int[] indices)
  {
    openCards[indices[0]] = null;
    openCards[indices[1]] = null;
    openCards[indices[2]] = null;
    numOpenCards -= 3;
  }

  /**
   *  If there are gaps in the first dfltOpenCards and some open cards
   *  beyond dfltOpenCards, the latter are moved to fill the gaps.
   */
  public void compactOpenCards()
  {
    // Partitioning algorithm (proceed from both ends):
    int i = 0, j = maxOpenCards - 1;

    while (i < dfltOpenCards && j >= dfltOpenCards)
    {
      if (openCards[i] != null)
        i++;
      else if (openCards[j] == null)
        j--;
      else
      {
        openCards[i] = openCards[j];
        openCards[j] = null;
        i++;
        j--;
      }
    }
  }

  /**
   *  Returns a string representation of this "set table".
   *  @return a string that lists all the open cards (including null cards)
   *  followed by an '\n' character, and finally the count of cards
   *  left in the deck.
   */
  public String toString()
  {
    String s = "Set table:\n";

    for (int i = 0; i < maxOpenCards; i++)
      s += openCards[i] + "\n";

    s += "Cards left in deck: " + cardsInDeck() + "\n";
    return s;
  }
}
