package br.com.achatom.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.achatom.model.CampoHarmonicoModel;
import br.com.achatom.service.AcharTomService;

@Service
public class AcharTomServiceImpl implements AcharTomService{
	
	@Override
	public List<CampoHarmonicoModel> acharTom(List<CampoHarmonicoModel> listaCamposHarmonicos, String nota) {
		List<CampoHarmonicoModel> camposEncontrados = new ArrayList<CampoHarmonicoModel>();
		  
		if (nota.equals("C") || nota.equals("C#") || nota.equals("C#m") || nota.equals("C#m7") || nota.equals("Cm")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getDo().equals(nota)) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("D") || nota.equals("D#") || nota.equals("D#m") || nota.equals("D#m7") || nota.equals("Dm")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getRe().equals(nota)) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("E") || nota.equals("E#") || nota.equals("E#m") || nota.equals("E#m7") || nota.equals("Em")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getMi().equals(nota)) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("F") || nota.equals("F#") || nota.equals("F#m") || nota.equals("F#m7") || nota.equals("Fm")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getFa().equals(nota)) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("G") || nota.equals("G#") || nota.equals("G#m") || nota.equals("G#m7") || nota.equals("Gm")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getSol().equals(nota)) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("A") || nota.equals("A#") || nota.equals("A#m") || nota.equals("A#m7") || nota.equals("Am")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getLa().equals(nota)) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("B") || nota.equals("B#") || nota.equals("B#m") || nota.equals("B#m7") || nota.equals("Bm")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getSi().equals(nota)) {camposEncontrados.add(campoHarmonico);
				}
			}
		}
		
		System.out.println(camposEncontrados);
		return camposEncontrados;
	}
}
