package br.com.devisgood.copier;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.devisgood.copier.RightCopier;
import br.com.devisgood.copier.XMLReader;
import br.com.devisgood.copier.XMLWriter;

public class RightCopierTest {
	
	@Test
	public void shouldReadAndWriteContent() {
		XMLReader reader = Mockito.mock(XMLReader.class);
		XMLWriter writer = Mockito.mock(XMLWriter.class);
		
		Mockito.when(reader.hasCharacteres()).thenReturn(true, false);
		Mockito.when(reader.readCharacteres()).thenReturn("Filip Rains");
		
		RightCopier copier = new RightCopier(reader, writer);
		
		copier.copy();
		
		Mockito.verify(writer).write("Filip Rains");
	}

}
