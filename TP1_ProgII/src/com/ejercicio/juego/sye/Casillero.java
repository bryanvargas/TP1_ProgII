package com.ejercicio.juego.sye;



public class Casillero {
	 private Tablero tablero = null ;
	 private Jugador jugador = null ;
	 private int posicion ;
	 private LogicaCasillero rolCasillero = null ;
	
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
	
	 public void setRolCasillero ( LogicaCasillero sr) {
		 assert sr != null ;
		 rolCasillero = sr;
	 }
	
	 public boolean estaOcupado () {
	 return rolCasillero.estaOcupado();
	}
	
	 public boolean esUltimoCasillero() {
		 return rolCasillero.esUltimoCasillero();
	 }
	
	 public Casillero moveAndLand ( int movimiento ) {
	 return rolCasillero . moverHastaNuevaPosicion ( movimiento );
	 }
	
	 public Casillero landHereOrGoHome () {
		 return rolCasillero . posicionarORetroceder ();
	
	 }
	
	public void ingresar( Jugador p) {
		rolCasillero.ingresar (p);
	 }
	
	 public void abandonar( Jugador p) {
		 rolCasillero.abandonar(p);
	}
	
	 public Casillero encontrarCasilleroRelativo ( int shift ) {
		return tablero.encontrarCasillero( posicion + shift );
	}
	
	public Casillero encontrarPrimerCasillero() {
		return tablero.primerCasillero();
	 }
	
	 public Casillero encontrarUltimoCasillero () {
		 return tablero.ultimoCasillero();
	 }
	 
}