package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class topicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista() {
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "programacao"));

		return Arrays.asList(topico, topico, topico);

	}

}
