package com.ejercicio.juego.sye;

import java.util.LinkedList;
public final class Juego {
	 private LinkedList<Jugador > jugadores = new LinkedList<Jugador>();	 
	 private Tablero tablero = null ;
	 private Jugador jugadorGanador ;
	 

	 public Juego ( String [] nombreJugadores , int numCasilleros ,
			 int [][] serpientes , int [][] escaleras ) {
		 crearTablero(numCasilleros , escaleras , serpientes);	
		 crearJugadores(nombreJugadores);
	 }	 
	 
	 public void moverJugador (int tiro ) {
		 Jugador jugadorActual = jugadores.remove(); 
		 jugadorActual . avanzar (tiro);
		 jugadores.add(jugadorActual);
		 if (jugadorActual.getCasillero()==tablero.ultimoCasillero())			 
			 jugadorGanador = jugadorActual ;		 
	}

	 public void crearTablero (int numCasilleros , int [][] escaleras ,
			 int [][] serpientes ) {
		 tablero = new Tablero ( numCasilleros , escaleras , serpientes );
	 }

	 public void crearJugadores (String [] nombreJugadores ) {
		 assert nombreJugadores . length >1 : "Debe tener dos jugadores como minimo" ;
		 System . out. println ("Los jugadores son: ");
		 int i=1;
		 for ( String str : nombreJugadores ) {
			 Jugador jugador = new Jugador ( str );
			 jugadores.add( jugador );
			 System . out. println (i + ". " + str );
			 i++;			 
		 }
		 System.out.println("****************");
	 }

	 public void play () {
		 assert ! jugadores . isEmpty () : "No hay jugadores para jugar";
		 assert tablero != null : "no hay tablero para jugar";

		 Dado dado = new Dado ();
		 comenzarJuego ();

		 System . out. println ("Estado inicial : \n" + this );
		 while ( noFinalizado ()) {
			 int tiro = dado.tiro ();
			 System . out. println ("El jugador actual es: " + jugadorActual ()
					 + " y el tiro del dado es " + tiro );
			 moverJugador(tiro);
			 System.out.println("Estado actual: \n" + this );
		 }
		 System.out.println("***********************");
		 System.out.println ("* "+ jugadorGanador + " HA GANADO!!! *");
		 System.out.println("***********************");
	 }

	 public void comenzarJuego () {
		 posicionarJugadoresAlComienzoJuego ();
		 jugadorGanador = null ;
	}

	 public void posicionarJugadoresAlComienzoJuego() {
		 for ( Jugador player : jugadores ) {
			 tablero.primerCasillero().ingresar( player );
		 }
	 }

	 public boolean noFinalizado() {
		 System.out.println(jugadorGanador);
		 return jugadorGanador == null ;
	 }	


	 public Jugador jugadorActual () {
		 assert jugadores.size () >0;
		 return jugadores.peek ();
	 }
	 

	 @Override
	 public String toString () {
		 String str = new String ();
		 for ( Jugador jugador : jugadores ) {
			 str += jugador.getNomJugador()+ " esta en el casillero "
			 + ( jugador . posicion ()+1) + "\n";
		 }
		 System.out.println();
		 return str;
		
	 }
}
