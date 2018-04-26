package br.com.devisgood.copier;

// This example show the wrong way to work with class dependencies
public class WrongCopier {
	
	public void Copy() {
		XMLReader leitor = new XMLReader();
		XMLWriter escritor = new XMLWriter();
		while (leitor.hasCharacteres()) {
		escritor.write(leitor.readCharacteres());
		}
	}

}
