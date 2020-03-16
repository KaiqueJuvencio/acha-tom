package findo_tone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTone {
	public static void main(String[] args) {
		CampoHarmonico CampoDeDo = new CampoHarmonico("DÓ", Arrays.asList("C","Dm","Em","F","G","Am","Bm7"));
		
		CampoHarmonico CampoDeRe = new CampoHarmonico("Ré", Arrays.asList("C#m7","D","Em","F#m","G","A","Bm"));

		CampoHarmonico CampoDeMi = new CampoHarmonico("Mi", Arrays.asList("C#m","D#m7","E","F#m","G#m","A","B"));
		
		CampoHarmonico CampoDeFa = new CampoHarmonico("Fá", Arrays.asList("C#","D#m","E#m7","F#","G#m","A#m","B#"));
	
		CampoHarmonico CampoDeSol = new CampoHarmonico("Sol", Arrays.asList("C","D","Em","F#m7","G","Am","Bm"));
		
		CampoHarmonico CampoDeLa = new CampoHarmonico("La", Arrays.asList("C#m","D","E","F#m","Gm7","A","Bm"));
		
		CampoHarmonico CampoDeSi = new CampoHarmonico("Si", Arrays.asList("C#m","Dm","E","F#","G#m","Am7","B"));

		
		List<CampoHarmonico> TodosCampos = Arrays.asList(CampoDeDo,CampoDeRe,CampoDeMi,CampoDeFa,CampoDeSol,CampoDeLa,CampoDeSi);
			
		AcharTom.acharTom(TodosCampos, "B");		
		
	}


}
