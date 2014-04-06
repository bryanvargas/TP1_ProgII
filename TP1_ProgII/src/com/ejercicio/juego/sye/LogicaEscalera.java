package com.ejercicio.juego.sye;



public final class LogicaEscalera extends LogicaCasillero {
	 private int transportar ;
	
	 public LogicaEscalera ( Casillero s, int t) {
		 super (s);
		 assert t >0 : "el movimiento debe ser hacia adelante ";
		 transportar = t;
	 }
	
	 @Override
	 public Casillero posicionarORetroceder () {
		 System . out. println ("PISO!! :) escalera avanza desde " + ( casillero . getPosicion ()+1)
				 + " hasta " + ( destino (). getPosicion ()+1));
		 return destino().posicionarORetroceder();
	 }
	
	 private Casillero destino() {
		 return casillero . encontrarCasilleroRelativo ( transportar );
	 }

	 //solo implementado para que no de error
	public boolean esElUltimoCasilero() {
		// TODO Auto-generated method stub
		return false;
	}
}