/**
 *  Represents a deck of cards for the game of SET.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class ZetDeck extends Deck
{
  /**
   *  Constructs a deck for the Set game.
   */
  public ZetDeck()
  {
    super(81); // create an empty deck that can eventually hold 81 cards
    for (int n = 1; n <= 3; n++)
      for (int s = 1; s <= 3; s++)
        for (int f = 1; f <= 3; f++)
          for (int c = 1; c <= 3; c ++ )
            add(new ZetCard(n, s, f, c));
  }
}
