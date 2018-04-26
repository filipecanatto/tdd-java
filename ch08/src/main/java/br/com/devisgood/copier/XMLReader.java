package br.com.devisgood.copier;

import br.com.devisgood.copier.interfaces.IXMLReader;

public class XMLReader implements IXMLReader {
	
	public boolean hasCharacteres() {
		return false;
	}
	
	public String readCharacteres() {
		return new String("");
	}

}
