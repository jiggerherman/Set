/**
 *  A test for the ZetTable class.
 *
 *  Copyright (C) 2004 by Maria Litvin, Gary Litvin, and
 *  Skylight Publishing.  All rights reserved.
 *  Teachers may make a limited number of copies of this file
 *  for noncommercial, face-to-face teaching purposes.
 *
 *  SET® is a registered trademark of SET Enterprises, Inc.
 *
 */

public class TestZetTable
{
  public static void main(String[] args)
  {
    boolean done = false;

    ZetTable table = new ZetTable();
    while (!done)
    {
      // Print the table

      System.out.println(table + "\n");

      // Try to find a "set"; open three more cards until a set is found:

      int[] zet = table.findZet();
      while (zet == null && !done)
      {
        if (!table.open3Cards())
          done = true;
        else
          zet = table.findZet();
      }

      // Display the found set

      if (zet != null)
      {
        // Display the found set:

        System.out.println("Found set:\n");
        System.out.println(table.getOpenCard(zet[0]));
        System.out.println(table.getOpenCard(zet[1]));
        System.out.println(table.getOpenCard(zet[2]));
        System.out.println();

        // Remove the found set; compact the remaining cards and open
        //   three more cards if not enough cards are open.

        table.remove3Cards(zet);
        table.compactOpenCards();
        if (!table.enoughOpen())
          table.open3Cards();
      }
    }
  }
}
