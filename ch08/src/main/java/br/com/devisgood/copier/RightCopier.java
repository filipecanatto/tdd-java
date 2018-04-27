package br.com.devisgood.copier;

import br.com.devisgood.copier.interfaces.IXMLReader;
import br.com.devisgood.copier.interfaces.IXMLWriter;

//This example show the right way to work with class dependencies using tdd
public class RightCopier {
	
	/* we use interface because it does not change with facility, so
	 * the class RightCopier become stable.
	 */
	IXMLReader reader;
	IXMLWriter writer;
	
	public void copy() {
		while (reader.hasCharacteres()) {
			writer.write(reader.readCharacteres());
		}
	}

	public RightCopier(IXMLReader reader, IXMLWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	

}
