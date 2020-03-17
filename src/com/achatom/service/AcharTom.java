package com.achatom.service;
import java.util.ArrayList;
import java.util.List;
import com.achatom.model.*;

public class AcharTom {
	public static void acharTom(List<CampoHarmonicoModel> listaCamposHarmonicos, String nota) {
		List<CampoHarmonicoModel> camposEncontrados = new ArrayList<CampoHarmonicoModel>();
		
		if (nota.equals("C") || nota.equals("C#") || nota.equals("C#m") || nota.equals("C#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getDo() == nota) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("D") || nota.equals("D#") || nota.equals("D#m") || nota.equals("D#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getRe() == nota) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("E") || nota.equals("E#") || nota.equals("E#m") || nota.equals("E#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getMi() == "D") {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("F") || nota.equals("F#") || nota.equals("F#m") || nota.equals("F#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getFa() == nota) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("G") || nota.equals("G#") || nota.equals("G#m") || nota.equals("G#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getSol() == nota) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("A") || nota.equals("A#") || nota.equals("A#m") || nota.equals("A#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getLa() == nota) {camposEncontrados.add(campoHarmonico);}
			}
		}
		
		else if (nota.equals("B") || nota.equals("B#") || nota.equals("B#m") || nota.equals("B#m7")) {
			for (CampoHarmonicoModel campoHarmonico: listaCamposHarmonicos) {
				if(campoHarmonico.getSi() == nota) {camposEncontrados.add(campoHarmonico);}
			}
		}
			
		System.out.println(camposEncontrados);
	}
}
