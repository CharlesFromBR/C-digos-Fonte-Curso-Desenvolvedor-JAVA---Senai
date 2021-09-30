package br.com.entrada;

import java.util.Scanner; 

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//instaniciando o objeto da classe pessoa
		  pessoa gente = new pessoa();
		  
		 //instanciar um obejto da classe Scanner
		  Scanner leia = new Scanner(System.in);
		   
		   
		  
		 //repassar os valores dos atributos
		   System.out.println("Informe o nome: ");
		   gente.nome = leia.nextLine();
		   System.out.println("Informe a idade: ");
		   gente.idade = leia.nextInt();
		   
		   //fazer a limpeza de butter
		   leia.nextLine();
		  
		   
		   System.out.println("Informe o genero: ");
		   gente.genero = leia.nextLine();
		   System.out.println("Informe a nacionalidade: ");
		   gente.nacionalidade = leia.nextLine();
		   
		   //imprimir os dados na tela
		   gente.apresentar();
		   
		   
		   
		   
	}

}
