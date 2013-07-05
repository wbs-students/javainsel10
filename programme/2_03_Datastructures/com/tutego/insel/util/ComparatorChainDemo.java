package com.tutego.insel.util;

import java.util.*;

public class ComparatorChainDemo
{
  public static class Person
  {
    public String firstname, lastname;

    public Person( String firstname, String lastname )
    {
      this.firstname = firstname;
      this.lastname  = lastname;
    }

    @Override public String toString()
    {
      return firstname + " " + lastname;
    }
  }

  public final static Comparator<Person>
    PERSON_FIRSTNAME_COMPARATOR = new Comparator<Person>() {
      @Override public int compare( Person p1, Person p2 ) {
        return p1.firstname.compareTo( p2.firstname );
      }
    };

  public final static Comparator<Person>
    PERSON_LASTNAME_COMPARATOR = new Comparator<Person>() {
      @Override public int compare( Person p1, Person p2 ) {
        return p1.lastname.compareTo( p2.lastname );
      }
    };

  public static void main( String[] args )
  {
    List<Person> persons = Arrays.asList(
      new Person( "Onkel", "Ogar" ), new Person( "Olga", "Ogar" ),
      new Person( "Peter", "Lustig" ), new Person( "Lara", "Lustig" ) );

    Collections.sort( persons, PERSON_LASTNAME_COMPARATOR );
    System.out.println( persons );

    Collections.sort( persons, PERSON_FIRSTNAME_COMPARATOR );
    System.out.println( persons );

    Collections.sort( persons, new ComparatorChain<Person>(
        PERSON_LASTNAME_COMPARATOR, PERSON_FIRSTNAME_COMPARATOR ) );
    System.out.println( persons );
  }
}