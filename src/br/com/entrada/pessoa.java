package br.com.entrada;

public class pessoa {
	//atributo 
	public String nome;
	public String genero;
	public String nacionalidade;
	public int idade;
	
	 //métodos
	  public void apresentar() {
		  System.out.println("Olá! Meu nome é " + this.nome + ".");
		  System.out.println("Sou do genero " + this.genero + ".");
		  System.out.println("Sou " + this.nacionalidade + ".");
		  System.out.println("e tenho " + this.idade + ".");
		  
	  }

}
