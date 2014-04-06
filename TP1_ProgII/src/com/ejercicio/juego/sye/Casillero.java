package com.ejercicio.juego.sye;



public class Casillero {
	 private Tablero tablero = null ;
	 private Jugador jugador = null ;
	 private int posicion ;
	 private LogicaCasillero logicaCasillero = null ;
	
	 public Casillero ( int pos , Tablero b) {
		 //assert pos >=0 : "El numero de casilleros debe ser >= a cero " ;
		 posicion = pos;
		 tablero = b;
	 }
	
	 public Jugador getJugador () {
		 return jugador ;
	 }
	
	 public void setJugador ( Jugador p) {
		 jugador = p;
	 }

	 public int getPosicion () {
		 return posicion ;
	 }
	
	 public void setLogicaCasillero (LogicaCasillero sr) {
		 assert sr != null ;
		 logicaCasillero = sr;
	 }
	
	 public boolean estaOcupado () {
	 return logicaCasillero.estaOcupado();
	}
	
	 public boolean esUltimoCasillero() {
		 return logicaCasillero.esUltimoCasillero();
	 }
	
	 public Casillero moverYPosicionar(int movimiento) {
	 return logicaCasillero . moverHastaNuevaPosicion ( movimiento );
	 }
	
	 public Casillero posicionarORetroceder () {
		 return logicaCasillero.posicionarORetroceder ();
	
	 }
	
	public void ingresarACasillero(Jugador p) {
		logicaCasillero.ingresarACasillero (p);
	 }
	
	 public void abandonarCasillero( Jugador p) {
		 logicaCasillero.abandonarCasillero(p);
	}
	
	 public Casillero encontrarCasilleroRelativo (int desplazamiento ) {
		return tablero.encontrarCasillero( posicion + desplazamiento );
	}
	
	public Casillero encontrarPrimerCasillero() {
		return tablero.primerCasillero();
	 }
	
	 public Casillero encontrarUltimoCasillero () {
		 return tablero.ultimoCasillero();
	 }
	 
}