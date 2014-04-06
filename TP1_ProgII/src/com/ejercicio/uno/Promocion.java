package com.ejercicio.uno;

import java.util.ArrayList;



public class Promocion {
	ListaTuplas<String,String> listaMateriales;
	ListaTuplas<String,Integer> listaPrecios;

	public Promocion(ListaTuplas<String,String> listaMateriales, ListaTuplas<String,Integer> listaPrecios){
		this.listaMateriales = listaMateriales;
		this.listaPrecios = listaPrecios;
	}
	
	ListaTuplas<String,String> resolver_ej1(){
		//implementar
		//Se debe pisar listaMateriales.
		return listaMateriales;
	}
	
	
	
	ListaTuplas<String,String> resolver_ej3(){
		ArrayList<String> materialesPromo = new ArrayList<String>();//lista ordenada!!
		ListaTuplas<String,Integer> listPreOrdenada = new ListaTuplas<String,Integer>();
		String materiales="";
		Integer mayor = 0;
		int pos = 0;
		int cantMateriales = listaPrecios.tamaño();
		for (int i = 0; i < cantMateriales; i++) {
			for (int j = 0; j <listaPrecios.tamaño(); j++){
				if (mayor < listaPrecios.iesimo(j).getE2()){
					mayor=listaPrecios.iesimo(j).getE2();
					materiales=listaPrecios.iesimo(j).getE1();
				}
					if(mayor == listaPrecios.iesimo(j).getE2())
						pos=j;
			}
			listPreOrdenada.agregar(new Tupla<String,Integer>(listaPrecios.iesimo(pos).getE1(),listaPrecios.iesimo(pos).getE2()));
			materialesPromo.add(materiales);
			listaPrecios.eliminar(listaPrecios.iesimo(pos));
			mayor=0;
		}
		System.out.println(listPreOrdenada);
		ListaTuplas<String,String> listaPromo = new ListaTuplas<String,String>();
		int sumaPrecios=0;
		for (int i = 0; i < materialesPromo.size(); i = i + 2) {
			String nombreMat = listPreOrdenada.iesimo(i).getE1();
			int precioMat = listPreOrdenada.iesimo(i).getE2();
			sumaPrecios=sumaPrecios+listPreOrdenada.iesimo(i).getE2();
			Tupla<String,String> TuplaMateriales = new Tupla<String,String>
			(materialesPromo.get(i),materialesPromo.get(i+1));
			listaPromo.agregar(TuplaMateriales);
			System.out.println(nombreMat +" = " + precioMat + "$");
		}
		System.out.println("Total = "+ sumaPrecios + "$");
		System.out.println("Esta es la promocion mas barata para el Cliente:");
		return listaPromo;
	}
	
	
	
	@Override
	public String toString()
	{
		String ret = "";
		Integer precioM1=0;
		Integer precioM2=0;
		
		for (int i=0; i<listaMateriales.tamaño(); i++){
			precioM1 = listaPrecios.buscar(listaMateriales.iesimo(i).getE1());
			precioM2 = listaPrecios.buscar(listaMateriales.iesimo(i).getE2());
		
			if (precioM1 > precioM2){
				ret = ret + listaMateriales.iesimo(i).getE1().toString() +" "+ precioM1 + "\n";
			}else{
				ret = ret + listaMateriales.iesimo(i).getE2().toString() +" "+ precioM2 + "\n";				
			}
			//ret = ret + listaMateriales.iesimo(i).toString() + "\n";

		}
		
		return ret;
	}
	
		
	

}
