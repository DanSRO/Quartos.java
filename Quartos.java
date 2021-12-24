package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Quartos {
	
	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		AluguelDosQuartos[] lista = new AluguelDosQuartos[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int N = sc.nextInt();
				
		for(int i=1; i<= N; i++) {
			
			System.out.println();
			System.out.println("Aluguel #"+i+": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email= sc.nextLine();
			System.out.print("Sala: ");
			int sala = sc.nextInt();
			
			lista[sala]= new AluguelDosQuartos(nome, email);
		}
			System.out.println(); 
			System.out.println("Quartos ocupados:");
			
			for (int i=0; i<10; i++) {
				if (lista[i] != null) {
					System.out.println(i + ": " + lista[i]);
					}
				}
		sc.close();
		}
		}