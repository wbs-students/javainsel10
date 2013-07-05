package com.tutego.insel.enumeration;

public enum GameCurrency
{
  EURO() {
    @Override double convertTo( GameCurrency targetCurrency, double value )
    {
      return targetCurrency == EURO ? value : value / 2;
    }
  },
  PONRODOLLAR() {
    @Override
    double convertTo( GameCurrency targetCurrency, double value )
    {
      return targetCurrency == PONRODOLLAR ? value : value * 2;
    }
  };  
 
  abstract double convertTo( GameCurrency targetCurrency, double value );
}
