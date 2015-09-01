/*
 * PezDispenser.java 1.0 Aug 27, 2015
 *
 * Copyright (c) 2015 David J. Powell, Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */

package edu.elon.pez;

import java.util.ArrayList;
import java.util.List;

public class PezDispenser {
  public static final int SIZE = 12;
  private List<PezCandy> pezCandies;

  public PezDispenser() {
    pezCandies = new ArrayList<PezCandy>();
    for (int i = 1; i <= 12; i++) {
      pezCandies.add(new PezCandy());
    }

  }

  public static void main(String[] args) {
    PezDispenser dispenser = new PezDispenser();
    while (!dispenser.isEmpty()) {
      System.out.println(dispenser.eat());
    }

  }

  public PezCandy eat() {
    PezCandy aCandy = null;
    if (!this.isEmpty()) {
      aCandy = pezCandies.remove(0);
    }
    return aCandy;
  }

  public int getSize() {
    return pezCandies.size();
  }

  public boolean isEmpty() {
    return pezCandies.isEmpty();
  }

  public void load() {
    while (this.getSize() < 12) {
      pezCandies.add(new PezCandy());
    }

  }

  public PezCandy peek() {
    PezCandy candy = null;
    if (!this.isEmpty()) {
      candy = pezCandies.get(0);
    }
    return candy;
  }

}
