/**
 *  A test for the Deck class.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class TestDeck
{
  public static void main(String[] args)
  {
    Deck deck = new Deck();
    deck.add(new Card(1));
    deck.add(new Card(2));
    deck.add(new Card(3));
    deck.add(new Card(4));
    deck.add(new Card(5));

    System.out.println("Original:");
    System.out.println(deck);

    deck.shuffle();
    System.out.println("Shuffled:");
    System.out.println(deck);

    deck.sort();
    System.out.println("Sorted back:");
    System.out.println(deck);

    System.out.println("Three top cards:");
    System.out.println(deck.takeTop());
    System.out.println(deck.takeTop());
    System.out.println(deck.takeTop());
  }
}