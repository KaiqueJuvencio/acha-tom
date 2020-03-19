package resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import repository.AchaTomRepository;

@RestController
@RequestMapping("/achatom")
public class AchaTomResource {
	
	@Autowired
	private AchaTomRepository achatom;
	List<String> lista = new ArrayList<String>();
	
	@PostMapping
	public void adicionar(@RequestBody String campoHarmonico) {
		lista.add(campoHarmonico);
	}
	
	@GetMapping
	public List<String> listar(){
		return lista;
	}
}
