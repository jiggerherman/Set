/**
 *  Provides static methods for finding sets.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class ZetAnalyzer
{
  /**
   *  Returns true if card1, card2, and card3 form a "set," false otherwise.
   *  @param card1 the first card.
   *  @param card2 the second card.
   *  @param card3 the third card.
   *  @return true if card1, card2, and card3 form a "set"; false otherwise.
   */
  public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
  {
    return !card1.equals(card2) && !card1.equals(card3) && !card2.equals(card3) &&
       (card1.getNumber() + card2.getNumber() + card3.getNumber()) % 3 == 0 &&
       (card1.getColor() + card2.getColor() + card3.getColor()) % 3 == 0 &&
       (card1.getShape() + card2.getShape() + card3.getShape()) % 3 == 0 &&
       (card1.getFill() + card2.getFill() + card3.getFill()) % 3 == 0;
  }

  /**
   *  Finds the indices of three cards from a given array that form
   *  a "set".  cards may contain nulls.
   *  @param cards an array of "set" cards.
   *  @return An array that contains the indices of the three
   *  cards that form a "set," or null if no sets are found.
   */
  public static int[] findZet(ZetCard[] cards)
  {
    for (int i = 0; i < cards.length; i++)
      for (int j = i + 1; j < cards.length; j++)
        for (int k = j + 1; k < cards.length; k++)
          if (cards[i] != null && cards[j] != null && cards[k] != null &&
                                             isZet(cards[i], cards[j], cards[k]))
            return new int[] {i, j, k};

    return null;
  }
}
