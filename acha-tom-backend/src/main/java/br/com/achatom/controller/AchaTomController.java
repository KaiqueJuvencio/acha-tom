package br.com.achatom.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.achatom.model.CampoHarmonicoModel;
import br.com.achatom.service.impl.AcharTomServiceImpl;

public class AchaTomController {
	public static void main(String[] args) {

		CampoHarmonicoModel campoDeDo = new CampoHarmonicoModel("D�",
				Arrays.asList("C", "Dm", "Em", "F", "G", "Am", "Bm7"));

		CampoHarmonicoModel campoDeRe = new CampoHarmonicoModel("R�",
				Arrays.asList("C#m7", "D", "Em", "F#m", "G", "A", "Bm"));

		CampoHarmonicoModel campoDeMi = new CampoHarmonicoModel("Mi",
				Arrays.asList("C#m", "D#m7", "E", "F#m", "G#m", "A", "B"));

		CampoHarmonicoModel campoDeFa = new CampoHarmonicoModel("F�",
				Arrays.asList("C#", "D#m", "E#m7", "F#", "G#m", "A#m", "B#"));

		CampoHarmonicoModel campoDeSol = new CampoHarmonicoModel("Sol",
				Arrays.asList("C", "D", "Em", "F#m7", "G", "Am", "Bm"));

		CampoHarmonicoModel campoDeLa = new CampoHarmonicoModel("La",
				Arrays.asList("C#m", "D", "E", "F#m", "Gm7", "A", "Bm"));

		CampoHarmonicoModel campoDeSi = new CampoHarmonicoModel("Si",
				Arrays.asList("C#m", "Dm", "E", "F#", "G#m", "Am7", "B"));

		List<CampoHarmonicoModel> todosCampos = Arrays.asList(campoDeDo, campoDeRe, campoDeMi, campoDeFa, campoDeSol,
				campoDeLa, campoDeSi);

		List<CampoHarmonicoModel> camposEncontrados = new ArrayList<CampoHarmonicoModel>();
		String valor = "E";
		camposEncontrados.addAll(AcharTomServiceImpl.acharTom(todosCampos, valor));
		int tamCampos = camposEncontrados.size();
		int i = 0;

		while (tamCampos > 1) {
			if (i == 0) {
				valor = "F#m";
			}
			if (i == 1) {
				valor = "Bm";
			}
			tamCampos = AcharTomServiceImpl.acharTom(camposEncontrados, valor).size();
			if (tamCampos == 0) {
				System.out.println("Nenhum Tom com as notas solicitadas...");
			}
			i++;
		}
	}
}
