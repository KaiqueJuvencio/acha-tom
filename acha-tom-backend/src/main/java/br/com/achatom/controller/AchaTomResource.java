package br.com.achatom.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.achatom.model.CampoHarmonicoModel;
import br.com.achatom.service.AcharTomService;

@RestController
@RequestMapping("/")
public class AchaTomResource {
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
	
	@Autowired
	private AcharTomService achaTomService;

	List<String> lista = new ArrayList<String>();

	@CrossOrigin
	@GetMapping("/")
	public List<CampoHarmonicoModel> home() {
		return todosCampos;
	}

	@CrossOrigin
	@GetMapping("/nota/{id}")
	public List<CampoHarmonicoModel> adicionar(@PathVariable String id) {
		return achaTomService.acharTom(todosCampos, id);
	}

	@PostMapping
	public List<String> listar() {
		return lista;
	}
}
