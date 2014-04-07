package com.ejercicio.juego.sye;




public class LogicaCasillero{
	 protected Casillero casillero = null ;
	 private Tablero tablero = null;
	
	 private boolean fin = false ;
	
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
	 public Casillero moverHastaNuevaPosicion (int tiro ) {		
		 
//		 System.out.println(casillero.encontrarUltimoCasillero().getPosicion()+"ESTE ES EL TAMAINIO");
//		 int ultimaPosicion = tablero.sizeTablero();
		  int ultimaPosicion = casillero.encontrarUltimoCasillero().getPosicion();
		  int posicionActual = casillero.getPosicion();
		  if ( posicionActual + tiro > ultimaPosicion) {
			  System . out. println ("Deberia ir a "
					  + ( posicionActual + tiro +1)
					  + " mas alla del ultimo casillero " + ( ultimaPosicion +1)
					  + " por lom tanto Has Ganado");
			 
			  fin = true;	
			  
			  return casillero ;
		  }
		  else {
			  System.out.println ("se mueve del " + ( casillero . getPosicion ()+1) + " al "		 
					  + ( casillero.encontrarCasilleroRelativo(tiro).getPosicion ()+1));
			  System.out.println("OOOO Aca se kedo");
			  return casillero.encontrarCasilleroRelativo(tiro).posicionarORetroceder();
		  }
	 }
	 
	 

	 
	 public Casillero posicionarORetroceder() {
		  if (casillero.estaOcupado()) {
			  System . out. println ("casillero " + ( casillero . getPosicion ()+1)
					  + "esta ocupado ");
		  } else {
			  System . out. println ("se mueve hasta el " + ( casillero . getPosicion ()+1));
		  	}
		  return casillero;
		  //return casillero.estaOcupado () ? casillero.encontrarPrimerCasillero() : casillero;
		  }
		 
	 public void ingresarACasillero(Jugador jugador) {
		 casillero.setJugador(jugador);
		 jugador.setCasillero (casillero);
	  }
	 
	  public void abandonarCasillero(Jugador jugador) {
		  casillero.setJugador ( null );
	  }
		  
}

