/**
 *  A test for the ZetAnalyzer class.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class TestZetAnalyzer
{
  public static void main(String[] args)
  {
    final int NUM_CARDS = 12;

    ZetDeck deck = new ZetDeck();
    deck.shuffle();

    // Open NUM_CARDS random cards:

    ZetCard[] openCards = new ZetCard[NUM_CARDS];
    for (int i = 0; i < NUM_CARDS; i++)
    {
      Card card = (ZetCard)deck.takeTop();
      System.out.println(i + ": " + card);
      openCards[i] = (ZetCard)card;
    }

    System.out.println("\nFind all sets:");

    for (int i = 0; i < NUM_CARDS; i++)
      for (int j = i + 1; j < NUM_CARDS; j++)
        for (int k = j + 1; k < NUM_CARDS; k++)
          if (ZetAnalyzer.isZet(openCards[i], openCards[j], openCards[k]))
            System.out.println(i + ", " + j + ", " + k);

    System.out.println("\nFind a set:");

    int zet[] = ZetAnalyzer.findZet(openCards);
    if (zet != null)
      System.out.println(zet[0] + ", " + zet[1] + ", " + zet[2]);
    else
      System.out.println("not found.");
  }
}
