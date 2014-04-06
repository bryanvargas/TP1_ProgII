package com.ejercicio.uno;

import java.util.ArrayList;

public class ListaTuplas<E1,E2> {
	private ArrayList<Tupla<E1,E2>> lTuplas;
	
	public ListaTuplas()
	{
		lTuplas = new ArrayList<Tupla<E1,E2>>(); 
	}
	
	public void agregar(Tupla<E1,E2> tupla)
	{
		lTuplas.add(tupla);
	}


	public E2 buscar(E1 elem1){
		
		E2 ret=null;
		for (int i = 0; i < lTuplas.size(); i++)
			if (lTuplas.get(i).getE1().equals(elem1))
				ret = lTuplas.get(i).getE2();
		return ret;		
		
	}
	
	public int tamaño(){
		return lTuplas.size();
	}

	public Tupla<E1,E2> iesimo(int i){
		return lTuplas.get(i);
	}
	public int pos (int num){
		return lTuplas.indexOf(num);

	}
	
	@Override
	public String toString()
	{
		String ret = "";
		for (int i=0; i<lTuplas.size(); i++)
			ret = ret + lTuplas.get(i).toString() + "\n";
		return ret;
	}
	
	
	/*
	 * Metodos implementados pro el grupo:
	 */
	//Eliminar Tupla:Implemenado por Alvaro
	public void eliminar(Tupla<E1,E2> tupla){
		lTuplas.remove(tupla);
	}
	
	//Comprueba que en la lista todos los elementos sean distintos
	public boolean norepeatElement() {
		int acumulador=0;
		int tiger= 0;
		for (int i = 0; i < lTuplas.size(); i++) {
			for (int j = 0; j < lTuplas.size(); j++) {
				if (lTuplas.get(j).getE1().equals(lTuplas.get(i).getE1()) || lTuplas.get(j).getE2().equals(lTuplas.get(i).getE1()) ||
					lTuplas.get(j).getE1().equals(lTuplas.get(i).getE2()) || lTuplas.get(j).getE2().equals(lTuplas.get(i).getE2())){
					acumulador++;
				}}
			tiger= tiger+acumulador;
			acumulador= 0;
		}
		if (tiger==3)
			return true;
		tiger=0;
		return false;
	}

}
