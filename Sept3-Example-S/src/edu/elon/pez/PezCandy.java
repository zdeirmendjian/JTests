/*
 * PezCandy.java 1.0 Aug 27, 2015
 *
 * Copyright (c) 2015 David J. Powell, Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.pez;

import java.io.Serializable;

/**
 * Famous PezCandy that keeps dentists in business.
 * 
 * @author dpowell2
 * @version 1.0
 * @since 1.0
 * 
 */
public class PezCandy implements Serializable, Comparable<PezCandy> {

  private static final String DEFAULT_FLAVOR = "orange";

  private static final long serialVersionUID = 1L;

  private String flavor;

  /**
   * Default constuctor sets flavor to value provided in
   * <code>DEFAULT_FLAVOR</code>.
   * 
   */
  public PezCandy() {
    this(DEFAULT_FLAVOR);
  }

  /**
   * Copy constructor to make a copy of <code>PezCandy</code> passed
   * as an instance.
   * 
   * @param candy PezCandy instance to copy
   */
  public PezCandy(PezCandy candy) {
    flavor = candy.getFlavor();
  }

  /**
   * Constructor setting flavor to value passed as argument.
   * 
   * @param flavor String representing Pez flavor
   */
  public PezCandy(String flavor) {
    this.setFlavor(flavor);
  }

  /**
   * test application to validate works as expected.
   * 
   * @param args String array of command line arguments
   */
  public static void main(String[] args) {
    PezCandy pc;
    if (args.length == 1) {
      pc = new PezCandy(args[0]);
    } else {
      pc = new PezCandy();
    }
    System.out.println(pc);
  }

  /**
   * Create a PezInstance copy of this.
   * 
   * @return PezCandy instance clone
   * @throws CloneNotSupportedException checked exception required to
   *         support cloning
   * @see java.lang.Object#clone()
   */
  @Override
  public PezCandy clone() throws CloneNotSupportedException {
    return new PezCandy(this);
  }

  /**
   * compare passed PezCandy against this to determine if passed
   * PezCandy flavor is less than, equal to or greater than this
   * <code>flavor</code>.
   * 
   * @param aCandy PezCandy instance to compare against current
   *        instance
   * 
   * @return int negative if instance flavor is less than instance
   *         passed.
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   * 
   */
  @Override
  public int compareTo(PezCandy aCandy) {
    return this.getFlavor().compareTo(aCandy.getFlavor());
  }

  /**
   * Test for equality of two instances based on flavor.
   * 
   * @param obj PezCandy
   * @return true if contain same flavor otherwise false
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final PezCandy other = (PezCandy) obj;
    if (flavor == null) {
      if (other.flavor != null) {
        return false;
      }
    } else if (!flavor.equals(other.flavor)) {
      return false;
    }
    return true;
  }

  /**
   * Return flavor of PezCandy.
   * 
   * @return String representing flavor of PezCandy
   */
  public String getFlavor() {
    return flavor;
  }

  /**
   * Override default hashCode behavior based on flavor.
   * 
   * @return int hashCode for PezCandy
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int PRIME = 31;
    int result = 1;
    result = PRIME * result + ((flavor == null) ? 0 : flavor.hashCode());
    return result;
  }

  /**
   * Set flavor attribute to the value passed as argument.
   * 
   * @param flavor String representing flavor to set instance to.
   */
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  /**
   * Override toString to provide ease of debugging and printing state
   * of the instance.
   * 
   * @return String representing flavor.
   */
  @Override
  public String toString() {
    return "Flavor is " + this.getFlavor();
  }
}
