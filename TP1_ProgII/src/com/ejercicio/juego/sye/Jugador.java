package com.ejercicio.juego.sye;





public class Jugador {
	private Casillero casillero;
	private String nomJugador;
	
	public Jugador(String nomJugador){
		this.nomJugador = nomJugador;
		this.casillero = null;		
	}
	
	public Casillero getCasillero() {
		 return casillero ;
	 	}
		
 	public void setCasillero(Casillero casillero) {
		 this.casillero = casillero ;
 		}
 	
 	public String getNomJugador(){
 		return nomJugador;
 	}
 	
 	public int posicion(){
		return casillero.getPosicion(); 		
 	}
 	
 	public void avanzar(int tiro){
 		assert tiro >0 : "no hay moviientos negativos";
 		casillero.abandonarCasillero(this);
 		
 		casillero = casillero.moverYPosicionar(tiro);
 		casillero.ingresarACasillero(this);
 		
 	}
 	
 	@Override
 	public String toString() { 		
 		return this.nomJugador;
 	}

	public boolean wins() {
		return casillero.esUltimoCasillero();
		
	}
	
	
	

}

