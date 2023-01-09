package CoversorMonedas;

import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valorRecibido) {
		
		String opcion = (JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas"
				+ " convertir tu dinero" ,"Monedas", JOptionPane.PLAIN_MESSAGE,null,
				new Object[] {"De pesos a dolar","De pesos a euros"},
				"Seleccion")).toString();
		
		switch (opcion) {
		case "De pesos a dolar": {
			monedas.ConvertirPesosArgentinosADolar(valorRecibido);
			break;	
		}
		
		case "De pesos a euros":{
			
			monedas.ConvertirPesosArgentinosAEuro(valorRecibido);
			break;
			
		}
		
		}
		
	}
	
	public void logica() {
	
	while(true) {
		String opciones = (JOptionPane.showInputDialog(null,"seleccione una opcion"
				+ "de conversión","Menu", JOptionPane.QUESTION_MESSAGE,null,
				new Object[] {"Conversor de moneda","Conversor de temperatura"},
				"Seleccion")).toString();
		switch (opciones) {
		case "Conversor de moneda": {
			String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
			if (!input.matches("[0-9]*")) {
			int eleccion = JOptionPane.showConfirmDialog(null, "Valor inválido, desea continuar?");
			if (eleccion == JOptionPane.OK_OPTION) {
				logica();
				
			} else { 
				JOptionPane.showMessageDialog(null, "Programa terminado");
				
			}	
			}
			
			
			double valorRecibido = Double.parseDouble(input);
			ConvertirMonedas(valorRecibido);
		
			
			int seleccion = JOptionPane.showConfirmDialog(null, "Deseas realizar otra"
					                                         + " conversión?");
			if (seleccion == JOptionPane.OK_OPTION) {
				logica();
				
			} else { 
				JOptionPane.showMessageDialog(null, "Programa terminado");
				
			}	
		
			
		}
		
		
		
		}
		
		break;
		
	}
		
	}
	
}
