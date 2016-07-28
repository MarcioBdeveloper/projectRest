package br.com.dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.entity.Contas;
import br.com.dev.entity.Usuario;
import br.com.dev.repository.ContaRepository;



/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 29/02/2016
 * */

@RestController
@RequestMapping("/contas")
public class ContasController {


	@Autowired
	private ContaRepository contaRepository;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contas> listaContas(){
		List<Contas> listaConta = new ArrayList<Contas>();
		try {
			listaConta = (List<Contas>) contaRepository.findAll();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return listaConta;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savarConta(@RequestBody Contas conta){
		contaRepository.save(conta);
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editarConta(@RequestBody Contas conta){
		contaRepository.save(conta);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void excluirConta(@RequestBody Contas conta){
		contaRepository.delete(conta);
	}
}
