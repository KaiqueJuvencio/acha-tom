package com.achatom.controller;

import java.util.Arrays;
import java.util.List;
import com.achatom.model.CampoHarmonicoModel;
import com.achatom.service.AcharTom;


public class AchaTomController {
	public static void main(String[] args) {
		CampoHarmonicoModel CampoDeDo = new CampoHarmonicoModel("DÓ", Arrays.asList("C", "Dm", "Em", "F", "G", "Am", "Bm7"));
		
		CampoHarmonicoModel CampoDeRe = new CampoHarmonicoModel("Ré", Arrays.asList("C#m7", "D", "Em", "F#m", "G", "A", "Bm"));

		CampoHarmonicoModel CampoDeMi = new CampoHarmonicoModel("Mi", Arrays.asList("C#m", "D#m7", "E", "F#m", "G#m", "A", "B"));
		
		CampoHarmonicoModel CampoDeFa = new CampoHarmonicoModel("Fá", Arrays.asList("C#", "D#m", "E#m7", "F#", "G#m", "A#m", "B#"));
	
		CampoHarmonicoModel CampoDeSol = new CampoHarmonicoModel("Sol", Arrays.asList("C", "D", "Em", "F#m7", "G", "Am", "Bm"));
		
		CampoHarmonicoModel CampoDeLa = new CampoHarmonicoModel("La", Arrays.asList("C#m", "D", "E", "F#m", "Gm7", "A", "Bm"));
		
		CampoHarmonicoModel CampoDeSi = new CampoHarmonicoModel("Si", Arrays.asList("C#m", "Dm", "E", "F#", "G#m", "Am7", "B"));

		List<CampoHarmonicoModel> TodosCampos = Arrays.asList(CampoDeDo, CampoDeRe, CampoDeMi, CampoDeFa, CampoDeSol, CampoDeLa, CampoDeSi);
			
		AcharTom.acharTom(TodosCampos, "B");			
	}
}
