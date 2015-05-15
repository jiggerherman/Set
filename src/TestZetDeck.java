/**
 *  A test for the ZetDeck class.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class TestZetDeck
{
  public static void main(String[] args)
  {
    ZetDeck deck = new ZetDeck();
    System.out.println("This deck has " + deck.getNumCards() + " cards");
    System.out.println("Three top cards:");
    System.out.println(deck.takeTop());
    System.out.println(deck.takeTop());
    System.out.println(deck.takeTop());
  }
}