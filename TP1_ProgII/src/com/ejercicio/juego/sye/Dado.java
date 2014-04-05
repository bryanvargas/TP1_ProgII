package com.ejercicio.juego.sye;
public class Dado {
	 private static final int MINVALUE = 1;
	 private static final int MAXVALUE = 6;
	
	 public int tiro() {
		 return aleatorio ( MINVALUE , MAXVALUE );
	 }

	 private int aleatorio (int min , int max ) {
		 //assert min < max;		 
		 return (int)( min + Math.round (( max - min) * Math.random ()));
	 	}
	 }