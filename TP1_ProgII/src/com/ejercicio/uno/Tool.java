package com.ejercicio.uno;


public class Tool {
	
	// Devueve la lista que mas dinero ahorra ahorra
	public static ListaTuplas<String, String> SaveMoreMoney (ListaTuplas<String, String> bestPromocionFinal,
				ListaTuplas<String, String> bestPromocion, ListaTuplas<String, Integer> listaPrecios) {

		if (totalMoney(bestPromocionFinal, listaPrecios)>=totalMoney(bestPromocion, listaPrecios)
				|| totalMoney(bestPromocionFinal, listaPrecios)==0)
			return bestPromocion;
		return bestPromocionFinal;
	}
	
	//Retorna el valor total de la promocion que se esta evaluando
	public static int totalMoney (ListaTuplas<String, String> listaPromocion,
			ListaTuplas<String, Integer> listaPrecios) {
		
		int precioPromocion= 0;
		for (int i = 0; i < listaPromocion.tamaño(); i++) {
			
			if (listaPrecios.buscar(listaPromocion.iesimo(i).e1)>=listaPrecios.buscar(listaPromocion.iesimo(i).e2))
				precioPromocion+= listaPrecios.buscar(listaPromocion.iesimo(i).e1);
			else
				precioPromocion+= listaPrecios.buscar(listaPromocion.iesimo(i).e2);
		}
		return precioPromocion;
	}

}

