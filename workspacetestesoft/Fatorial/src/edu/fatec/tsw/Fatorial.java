package edu.fatec.tsw;

public class Fatorial {

  public int fatorial(int num) throws InvalidNumberException {
	 
	  if (num < 0)
		  return 0;
      if (num <= 1) {
          return 1;
      } else {
          return fatorial(num - 1) * num;
      }
  }
}

