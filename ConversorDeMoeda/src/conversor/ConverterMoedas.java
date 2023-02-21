package conversor;

import javax.swing.JOptionPane;

public class ConverterMoedas {
	
	public String converter(String pais, double valor) {
		
		double valorConvertido = 0;
		String text = null;
		
		try {
			switch(pais) {
			
			case "Reais para Dólar":
				valorConvertido = valor * 0.19;
				return text = "Você tem USD "+valorConvertido+ " dólares";
			
			case "Reais para Euro":
				valorConvertido = valor * 0.18;
				return text = "Você tem EUR "+valorConvertido+ " euros";
				
			case "Reais para Libras Esterlinas":
				valorConvertido = valor * 0.16;
				return text = "Você tem GBP "+valorConvertido+ " libras esterlinas";
				
			case "Reais para Peso argentino":
				valorConvertido = valor * 37.37;
				return text = "Você tem ARS "+valorConvertido+ " pesos argetinos";
			
			case "Reais para Peso Chileno":
				valorConvertido = valor * 155;
				return text = "Você tem CLP "+valorConvertido+ " pesos chilenos";
				
				
			case "Dólar para Reais":
				valorConvertido = valor * 5.17;
				return text = "Você tem R$ "+valorConvertido+ " reais";
				
			case "Euro para Reais":
				valorConvertido = valor * 5.51;
				return text = "Você tem R$ "+valorConvertido+ " reais";
			
			case "Libras Esterlinas para Reais":
				valorConvertido = valor * 6.21;
				return text = "Você tem R$ "+valorConvertido+ " reais";
				
			case "Peso argentino para  Reais":
				valorConvertido = valor * 0.03;
				return text = "Você tem R$ "+valorConvertido+ " reais";
				
			case "Peso Chileno para Reais":
				valorConvertido = valor * 0.01;
				return text = "Você tem R$ "+valorConvertido+ " reais";
		}
		
		
		} catch (NumberFormatException  e) {
			JOptionPane.showMessageDialog(null, "Erro: Valor digitado não é um número válido");
		}
		
		return text;

	}
}
