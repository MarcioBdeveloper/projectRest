package br.com.dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.entity.Foto;
import br.com.dev.service.FotoService;



/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 07/11/2016
 * */

@RestController
@CrossOrigin
@RequestMapping("/foto")
public class FotoController {

	
	@Autowired
	private FotoService fotoService;

	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Foto> listaFotos(){
		return fotoService.listaFotos();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savarFoto(@RequestBody Foto foto){
		fotoService.savarFoto(foto);
	}
	 
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void excluirFoto(@PathVariable("id") Long id){
		fotoService.excluirFoto(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Foto buscaPorId(@PathVariable("id") Long id){
		return fotoService.buscaPorId(id);
	}
}
