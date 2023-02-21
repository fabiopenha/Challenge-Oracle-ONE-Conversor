package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;


public class Conversor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		executarConversor();
		frame.dispose();
	}
	
	
	private void executarConversor( ) {
		String type = (JOptionPane.showInputDialog(null, "Escolha uma opção:","Menu",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de moeda", "Conversor de temperatura"},null)).toString();
		
		if(type == null) {
			System.exit(0);
		}
		
		Object[] opcoes = new Object[] {
				"Reais para Dólar",
				"Reais para Euro",
				"Reais para Libras Esterlinas",
				"Reais para Peso argentino",
				"Reais para Peso Chileno",
				"Dólar para Reais",
				"Euro para Reais",
				"Libras Esterlinas para Reais",
				"Peso argentino para  Reais",
				"Peso Chileno para Reais"
		};

		
		if(type == "Conversor de moeda") {
			String input = JOptionPane.showInputDialog(null, "Insira um valor:");
			
			if(input == null) {
				System.exit(0);
			}
			
			String dinheiro = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro","Moeda",
					JOptionPane.PLAIN_MESSAGE, null, opcoes,null)).toString();
			
			if(dinheiro == null) {
				System.exit(0);
			}
			
			try {
				double numeroDouble  = Double.parseDouble(input);
				
				ConverterMoedas converterMoeda =  new ConverterMoedas();
				
				String moedaConvertida = converterMoeda.converter(dinheiro, numeroDouble);
				
				JOptionPane.showMessageDialog(frame, moedaConvertida, "Message", JOptionPane.INFORMATION_MESSAGE);
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				
				if (escolha == JOptionPane.YES_OPTION) {
		    
		            executarConversor();
		            
		        } else if (escolha == JOptionPane.NO_OPTION) {
		            JOptionPane.showMessageDialog(frame, "Programa finalizado", "Message", JOptionPane.INFORMATION_MESSAGE);
		            System.exit(0);
		        } else if (escolha == JOptionPane.CANCEL_OPTION) {
		            
		            System.exit(0);
		        }
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Erro: Valor digitado não é um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
				executarConversor();
			}	

		} else {
			String tipoDeConversor = (JOptionPane.showInputDialog(null, "Escolha uma opção:","Conversor de temperatura",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celsius para Fahrenheit", "Fahrenheit para Celsius"},null)).toString();
			
			if(tipoDeConversor == null) {
				System.exit(0);
			}
			
			if(tipoDeConversor == "Celsius para Fahrenheit") {
				
				try {
					String input = JOptionPane.showInputDialog(null, "Insira um valor:");
					
					if(input == null) {
						System.exit(0);
					}
					
					double numeroDouble  = Double.parseDouble(input);
					ConversorDeTemperatura converter = new ConversorDeTemperatura();
					String retorno = converter.celsiusParaFahrenheit(numeroDouble);
					
					JOptionPane.showMessageDialog(frame, retorno, "Message", JOptionPane.INFORMATION_MESSAGE);
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
					if (escolha == JOptionPane.YES_OPTION) {
			            
			            executarConversor();
			            
			        } else if (escolha == JOptionPane.NO_OPTION) {
			            JOptionPane.showMessageDialog(frame, "Programa finalizado", "Message", JOptionPane.INFORMATION_MESSAGE);
			            System.exit(0);
			        } else if (escolha == JOptionPane.CANCEL_OPTION) {
			            
			            System.exit(0);
			        }
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Erro: Valor digitado não é um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
					executarConversor();
				}
				
			} else {
				try {
					String input = JOptionPane.showInputDialog(null, "Insira um valor:");
					
					if(input == null) {
						System.exit(0);
					}
					
					double numeroDouble  = Double.parseDouble(input);
					ConversorDeTemperatura converter = new ConversorDeTemperatura();
					String retorno = converter.FahrenheitParaCelsius(numeroDouble);
					
					JOptionPane.showMessageDialog(frame, retorno, "Message", JOptionPane.INFORMATION_MESSAGE);
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					if (escolha == JOptionPane.YES_OPTION) {
			            
			            executarConversor();
			            
			        } else if (escolha == JOptionPane.NO_OPTION) {
			           
			            JOptionPane.showMessageDialog(frame, "Programa finalizado", "Message", JOptionPane.INFORMATION_MESSAGE);
			            System.exit(0);
			        } else if (escolha == JOptionPane.CANCEL_OPTION) {
			            
			            System.exit(0);
			        }
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Erro: Valor digitado não é um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
					executarConversor();
				}
			}
		}
	}
}
