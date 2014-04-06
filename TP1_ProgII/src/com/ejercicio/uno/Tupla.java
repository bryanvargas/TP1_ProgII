package com.ejercicio.uno;



public class Tupla<E1,E2> {
	E1 e1;
	E2 e2;
	
	//Constructor
	public Tupla(E1 e1, E2 e2)
	{
		this.e1=e1;
		this.e2=e2;
	}	
	
	public E1 getE1() {
		return e1;
	}
	public void setE1(E1 e1) {
		
		this.e1 = e1;
	}
	public E2 getE2() {
		return e2;
	}
	public void setE2(E2 e2) {
		this.e2 = e2;
	}
	
	@Override
	public String toString()
	{
		return "<"+e1.toString() +","+ e2.toString()+">";
	}
	
	/*
	 * Metodos implementado por el Grupo
	 */
	
	//devolver el precio mas caro de la tupla de materiales
	public int valueMax(ListaTuplas<String, Integer> listaPrecios) {
			
			int valueOne= 0;
			int valueTwo= 0;
			for (int i = 0; i < listaPrecios.tamaño(); i++) {
				if (listaPrecios.iesimo(i).getE1().equals(this.e1)){
					valueOne= listaPrecios.buscar(listaPrecios.iesimo(i).getE1());
				}
				if (listaPrecios.iesimo(i).getE1().equals(this.e2)){
					valueTwo= listaPrecios.buscar(listaPrecios.iesimo(i).getE1());
				}
			}
			if (valueOne>=valueTwo)
				return valueOne;
			return valueTwo;
		}

}
