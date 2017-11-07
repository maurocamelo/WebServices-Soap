package org.mc.anagrafica.ws;

import org.mc.anagrafica.ws.model.AnagraficaRequest;
import org.mc.anagrafica.ws.model.AnagraficaResponse;

public class AnagraficaService{
	
public AnagraficaResponse findAnagrafica(AnagraficaRequest anagraficaRequest){
		
		AnagraficaResponse anagraficaResponse = new AnagraficaResponse();
		
		anagraficaResponse.setNome("Name");
		
		anagraficaResponse.setCognome("Surname");
		
		return anagraficaResponse;

	}

}