package teste;

public class main {

	public static void main(String[] args) {
		
		Coluna teste1 = new Coluna("teste1", "int");
		Coluna teste2 = new Coluna("teste2", "int", true);
		Coluna teste3 = new Coluna("teste3", true,"int");
		Coluna teste4 = new Coluna("teste4",true ,true,"int");
		
		System.out.println(teste1.geraCampo());
		System.out.println(teste2.geraCampo());
		System.out.println(teste3.geraCampo());
		System.out.println(teste4.geraCampo());

	}

}
