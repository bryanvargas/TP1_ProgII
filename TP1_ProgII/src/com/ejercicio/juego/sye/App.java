package com.ejercicio.juego.sye;



public final class App {
	
	
	 public static void main ( String [] args ) {	
	 String [] nombreJugadores = {"Bryan Vargas", "Alvaro Choque"};
	 //Aumetar el numero de casilleros del tablero a eleccion
	 int numCasileros = 12;
	 //Aumentar la cantidad de serpientes y escaleras a eleccion
	 int [][] serpientes = { {11 ,5} };
	 int [][] escaleras = { {2 ,6} , {7 ,9} };
	
	 Juego juego = new Juego ( nombreJugadores , numCasileros , serpientes ,
	 escaleras );
	 juego.play ();
	 }
}