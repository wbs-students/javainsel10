package com.tutego.web;

public class EMailChecker
{
  private String email = "";

  public void setEmail( String email )
  {
    this.email = email;
  }

  public String getEmail()
  {
    return email;
  }

  public boolean isValidEmail()
  {
    return email.matches( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
  }
}
