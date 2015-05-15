/**
 *  Represents a generic deck of cards.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

import java.util.*;

public class Deck
{
  private ArrayList<Card> cards;

  /**
   *  Constructs an empty deck of cards.
   */
  public Deck()
  {
    cards = new ArrayList<Card>();
  }

  /**
   *  Constructs an empty deck of cards with a given capacity.
   *  @param capacity the number of cards this deck can hold
   *  without expanding the ArrayList that holds the cards.
   */
  public Deck(int capacity)
  {
    cards = new ArrayList<Card>(capacity);
  }

  /**
   *  Returns the number of cards in this deck.
   *  @return the number of cards in this deck.
   */
  public int getNumCards()
  {
    return cards.size();
  }

  /**
   *  Indicates whether this deck is empty.
   *  @return true if the deck is empty; false otherwise.
   */
  public boolean isEmpty()
  {
    return cards.isEmpty();
  }

  /**
   *  Adds a given card at the top of this deck.
   *  @param card to be added.
   */
  public void add(Card card)
  {
    cards.add(card);
  }

  /**
   *  Removes and returns the top card from this deck.
   *  @return the top card.
   *  @throws NoSuchElementException if this deck is empty.
   */
  public Card takeTop()
  {
    if (isEmpty())
      throw new NoSuchElementException();
    return cards.remove(cards.size() - 1);
  }

  /**
   *  Shuffles this deck.
   */
  public void shuffle()
  {
    Collections.shuffle(cards);
  }

  /**
   *  Sorts this deck in acsending order of IDs.
   */
  public void sort()
  {
    Collections.sort(cards);
  }

  /*** Or code your own shuffle and sort implementations:

  public void sort()
  {
    int n = getNumCards();
    while (n >= 2)
    {
      int i = 0;
      for (int j = 1; j < n; j++)
        if (cards.get(j).compareTo(cards.get(i)) > 0) i = j;
      Card temp = cards.get(i);
      cards.set(i, cards.get(n - 1));
      cards.set(n - 1, temp);
      n--;
    }
  }

  public void shuffle()
  {
    int n = getNumCards();
    while (n >= 2)
    {
      int i = (int)(n * Math.random());
      Card temp = cards.get(i);
      cards.set(i, cards.get(n - 1));
      cards.set(n - 1, temp);
      n--;
    }
  }

  ***/

  /**
   *  Returns a string representation of this deck.
   *  @return a String representation of this deck.
   */
  public String toString()
  {
    String s = "";
    for (int i = cards.size() - 1; i >= 0; i--)
      s += cards.get(i) + "\n";
    return s;
  }
}
