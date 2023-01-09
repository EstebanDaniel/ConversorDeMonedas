package CoversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosArgentinosADolar(double valorRecibido){
		
		double monedaDolar = valorRecibido / 178.60;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " Dolares");
	
	}
	
public void ConvertirPesosArgentinosAEuro(double valorRecibido){
		
		double monedaEuro = valorRecibido / 189.41;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " Euros");
	
	}
	

}
