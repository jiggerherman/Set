/**
 *  Represents a card for the game of SET.  A card has four attributes:
 *  number: (1, 2, or 3), shape: (oval, squiggle, or diamond),
 *  fill (outlined, solid, or striped), and color (red, green, or blue).

 *  Each attribute is represented by an integer code from 1 to 3.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class ZetCard extends Card
{
  private final int number;
  private final int shape;
  private final int fill;
  private final int color;


  /**
   *  Constructs a Set game card with given attributes.
   *  @param n number
   *  @param s shape
   *  @param f fill
   *  @param c color
   *
   */
  public ZetCard(int n, int s, int f, int c)
  {
    super((n - 1) + (s - 1) * 3 + (f - 1) * 9 + (c - 1) * 27);
    number = n;
    shape = s;
    fill = f;
    color = c;
  }

  /**
   *  Returns the number of symbols on this card.
   *  @return the number of symbols on this card.
   */
  public int getNumber()
  {
    return number;
  }

  /**
   *  Returns this card's shape code: 1 for oval, 2 for squiggle, 3 for diamond.
   *  @return this card's shape code.
   */
  public int getShape()
  {
    return shape;
  }

  /**
   *  Returns this card's fill code: 1 for outlined, 2 for solid, 3 for striped.
   *  @return this card's fill code.
   */
  public int getFill()
  {
    return fill;
  }

  /**
   *  Returns this card's color code: 1 for red, 2 for green, 3 for blue.
   *  @return this card's color code.
   */
  public int getColor()
  {
    return color;
  }

  /**
   *  Returns a String representation of this card.
   *  @return a String representation of this card.
   */
  public String toString()
  {
    return "SetCard [number = " + number + " shape = " + shape +
                      " fill = " + fill + " color = " + color + "]";
  }
}
