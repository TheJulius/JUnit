package teste;

import junit.framework.TestCase;

public class JUnitTeste extends TestCase{
	
	Coluna teste1 = new Coluna("teste1", "int");
	Coluna teste2 = new Coluna("teste1", "int", true);
	Coluna teste3 = new Coluna("teste1", true,"int");
	Coluna teste4 = new Coluna("teste1",true ,true,"int");
	
	public void teste1() {
		assertEquals("’codigo’ INT", teste1.geraCampo());
	}
	
	public void teste2() {
		assertEquals("’codigo’ INT AUTO_INCREMENT", teste2.geraCampo());
	}
	
	public void teste3() {
		assertEquals("’codigo’ INT NOT NULL ", teste3.geraCampo());
	}
	
	public void teste4() {
		assertEquals("’codigo’ INT NOT NULL AUTO_INCREMENT", teste4.geraCampo());
	}

}
