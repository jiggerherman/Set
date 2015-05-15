/**
 *  Represents a generic Card with a given int ID.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class Card implements Comparable<Card>
{
  private final int id;

  /**
   *  Construcs a card with a given id.
   *  @param id this card's id.
   */
  public Card (int id)
  {
    this.id = id;
  }

  /**
   *  Returns this card's id.
   *  @return this card's id.
   */
  public int getId()
  {
    return id;
  }

  /**
   *  Indicates whether some other object is "equal to" this one.
   *  @param other the reference object with which to compare.
   *  @return true if this object is the same as other; false otherwise.
   */
  public boolean equals(Object other)
  {
    return other != null && getId() == ((Card)other).getId();
  }

  /**
   *  Compares this card with the specified object for order.
   *  @param other the card to be compared.
   *  @return a negative integer, zero, or a positive integer as this card
   *  is less than, equal to, or greater than the specified object.
   *  @precondition: other is an instance of Card
   */
  public int compareTo(Card other)
  {
    return getId() - other.getId();
  }

  /**
   *  Returns a String representation of this card.
   *  @return a String representation of this card.
   */
  public String toString()
  {
    return "Card [id=" + id + "]";
  }
}
