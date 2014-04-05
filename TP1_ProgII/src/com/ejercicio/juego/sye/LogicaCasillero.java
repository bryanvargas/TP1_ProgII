package com.ejercicio.juego.sye;


public abstract class LogicaCasillero{
	 protected Casillero casillero = null ;
	 protected boolean fin = false ;
	
	 public LogicaCasillero (Casillero s) {
	 assert s!= null;
	 casillero = s;
	 }
	
	 public boolean estaOcupado () {
		 return casillero.getJugador() != null ;
	 }
	
	 public boolean esElPrimerCasillero () {
		 return false ;
	 }
	
	 public boolean esUltimoCasillero () {
		 return fin ;
}
	 
	 //moveAndLand
	 public Casillero moverHastaNuevaPosicion (int movimiento ) {
		  int ultimaPosicion = casillero.encontrarUltimoCasillero().getPosicion();
		  int posicionActual = casillero.getPosicion ();
		  if ( posicionActual + movimiento > ultimaPosicion ) {
			  //System . out. println ("Deberia ir a "
					 // + ( posicionActual + movimiento +1)
					  //+ " mas alla del ultimo casillero " + ( ultimaPosicion +1)
					  //+ " así que no te muevas");
			  fin = true;			  
			  return casillero;
		  }
		  else {
			  System . out. println ("se mueve del " + ( casillero . getPosicion ()+1) + " al "		 
					  + ( casillero.encontrarCasilleroRelativo( movimiento ). getPosicion ()+1));
			  return casillero.encontrarCasilleroRelativo(movimiento).posicionarORetroceder();
		  }
	 }
	 
	 public Casillero posicionarORetroceder() {
		  if (casillero.estaOcupado()) {
			  System . out. println ("casillero " + ( casillero . getPosicion ()+1)
					  + "esta ocupado ");
		  } else {
			  System . out. println ("se mueve hasta el " + ( casillero . getPosicion ()+1));
		  	}
		  return casillero.estaOcupado () ? casillero.encontrarPrimerCasillero() : casillero;
		  }
		 
	 public void ingresar ( Jugador player ) {
		 casillero.setJugador( player );
		 player . setCasillero ( casillero );
	  }
	 
	  public void abandonar ( Jugador player ) {
		  casillero . setJugador ( null );
	  }
		  
}