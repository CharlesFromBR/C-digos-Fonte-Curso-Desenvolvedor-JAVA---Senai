package br.com.entrada;

public class pessoa {
	//atributo 
	public String nome;
	public String genero;
	public String nacionalidade;
	public int idade;
	
	 //m�todos
	  public void apresentar() {
		  System.out.println("Ol�! Meu nome � " + this.nome + ".");
		  System.out.println("Sou do genero " + this.genero + ".");
		  System.out.println("Sou " + this.nacionalidade + ".");
		  System.out.println("e tenho " + this.idade + ".");
		  
	  }

}
