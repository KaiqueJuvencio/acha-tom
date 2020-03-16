package findo_tone;

import java.util.ArrayList;
import java.util.List;

public class AcharTom {
	public static void acharTom(List<CampoHarmonico> CamposHarmonicos, String nota) {
		List<CampoHarmonico> CamposEncontrados = new ArrayList();
		
		if(nota == "C" || nota == "C#" || nota == "C#m"|| nota == "C#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getDo() == nota) {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		if(nota == "D" || nota == "D#" || nota == "D#m"|| nota == "D#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getRe() == nota) {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		if(nota == "E" || nota == "E#" || nota == "E#m"|| nota == "E#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getMi() == "D") {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		if(nota == "F" || nota == "F#" || nota == "F#m"|| nota == "F#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getFa() == nota) {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		if(nota == "G" || nota == "G#" || nota == "G#m"|| nota == "G#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getSol() == nota) {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		if(nota == "A" || nota == "A#" || nota == "A#m"|| nota == "A#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getLa() == nota) {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		if(nota == "B" || nota == "B#" || nota == "B#m"|| nota == "B#m7") {
			for (CampoHarmonico campoHarmonico: CamposHarmonicos) {
				if(campoHarmonico.getSi() == nota) {CamposEncontrados.add(campoHarmonico);}
			}
		}
		
		
		System.out.println(CamposEncontrados);
	}
}
