package com.tutego.insel.util.concurrent;

import java.util.Date;

class Ticket implements Comparable<Ticket>
{
  static enum Priority { SEVERE, NORMAL }

  private final Priority priority;
  private final String   message;
  private final Date     arrivalDate;

  Ticket( Priority priority, String message )
  {
    this( priority, message, new Date() );
  }

  Ticket( Priority priority, String message, Date arrivalDate )
  {
    this.priority    = priority;
    this.message     = message;
    this.arrivalDate = arrivalDate;
  }

  @Override public int compareTo( Ticket that )
  {
    int ticketPriority = this.priority.compareTo( that.priority );
    // Wenn Ticket-Priorität ungleich 0, dann ist ein Ticket wichtiger als das
    // andere und die Zeit spielt keine Rolle.
    if ( ticketPriority != 0 )
      return ticketPriority;
    // Wenn Ticket-Priorität gleich 0, dann sind beide Tickets
    // gleich wichtig. Die Zeit kommt dann als Kriterium hinzu.
    return this.arrivalDate.compareTo( that.arrivalDate );
  }

  @Override public String toString()
  {
    return String.format( "%tT.%1$TL (%s) kam '%s'",
                          arrivalDate, priority, message );
  }
}
