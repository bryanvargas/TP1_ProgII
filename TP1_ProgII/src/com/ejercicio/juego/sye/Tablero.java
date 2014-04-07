package com.ejercicio.juego.sye;

import java.util.ArrayList;
public final class Tablero {
	
	
	 private ArrayList <Casillero > casilleros = new ArrayList <Casillero >();
	 private static int MINNUMCASILLeros = 10;
	
	 public Tablero ( int numCasillero , int[][] escaleras , int[][] serpientes ) {
	
	 assert numCasillero > MINNUMCASILLeros : " Debe ser mayor a 10 "
	 + MINNUMCASILLeros + " casilleros ";
	 crearCasilleros ( numCasillero );
	 crearEscaleras ( escaleras );
	 crearSerpientes ( serpientes );
	 }
	
	 public void crearCasilleros (int numCasilleros ) {
		 System .out . println ("Hay: " + numCasilleros + " casillros");
		 System.out.println("*******************");
		 for (int posicion =0 ; posicion < numCasilleros ; posicion ++) {
			 Casillero casillero = new Casillero ( posicion , this );
			 casilleros.add(casillero);
			 casillero.setLogicaCasillero(new LogicaCasillero(casillero) );
		 }
		 primerCasillero();
	 }
	 
	 public void crearSerpientes(int [][] serpientes ) {
		 for (int i=0; i< serpientes . length ; i++) {
			 assert serpientes [i]. length == 2;
			
			 int posicionDesde = serpientes [i ][0] -1;
			 int posicionHasta = serpientes [i ][1] -1;
			 int transportar = posicionHasta - posicionDesde ;
			
			 //assert transportar <0 ;
			 //assert ( posicionHasta > 0) && ( posicionHasta < numeroCasillas () -1);
			 //assert ( posicionDesde < numeroCasillas () -1) && ( posicionDesde >0);
			
			 System . out. println ("serpiente desde " + ( posicionDesde +1)
			 + " hasta " + ( posicionHasta +1));
			 System.out.println("*******************");
			
			 Casillero casilleroSerpiente = casilleros . get( posicionDesde );
			 casilleroSerpiente.setLogicaCasillero (new LogicaSerpiente ( casilleroSerpiente , transportar ));
		 	}
		 }
	
	 public void crearEscaleras(int [][] escaleras ) {
		 System.out.println(casilleros.size()+"esto es el tamanio casillero");
		 for (int i=0; i< escaleras . length ; i++) {
			 assert escaleras [i]. length == 2;
			
			 int posicionDesde = escaleras [i ][0] -1;
			 int posicionHasta = escaleras [i ][1] -1;
			
			 int transportar = posicionHasta - posicionDesde ;
			
			 assert transportar >0;
			 //assert ( posicionHasta < numeroCasillas ()) && ( posicionHasta > 0);
			 //assert ( posicionDesde > 0) && ( posicionDesde < numeroCasillas ());
			
			 System . out. println ("Escalera desde " + ( posicionDesde +1)
			 + " hasta " + ( posicionHasta +1));
			
			 Casillero casilleroEscalera = casilleros.get( posicionDesde );
			 casilleroEscalera.setLogicaCasillero ( new LogicaEscalera ( casilleroEscalera , transportar ));
		}
	 }
		 
	
	 public Casillero primerCasillero () {
		 return casilleros.get(0);
	 }
	
	 public Casillero ultimoCasillero () {
		
		 return casilleros.get(casilleros.size()-1);
	 }
	
	
	 public Casillero iesimoCasillero(int posicion) { 
		
		 //assert ( posicion >0) && ( posicion < numeroCasillas ()) : " no exixte el casillero ";
		 return casilleros.get(posicion);
	 }
	 
	 public int sizeTablero(){
		 System.out.println(casilleros.size());
		 return casilleros.size();
	 }
	
//	 public int numeroCasillas() {
//		 assert ! casilleros.isEmpty ();
//		 return casilleros.size ();
//	 }	 
	 
}



