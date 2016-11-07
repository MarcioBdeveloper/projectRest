package br.com.dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.entity.Foto;
import br.com.dev.repository.FotoRepository;



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
	private FotoRepository fotoRepository;

	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Foto> listaFotos(){
		List<Foto> listaFoto = new ArrayList<Foto>();
		try {
			listaFoto = (List<Foto>) fotoRepository.findAll();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return listaFoto;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savarFoto(@RequestBody Foto foto){
		fotoRepository.save(foto);
	}
	 
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void excluirFoto(@RequestBody Foto foto){
		fotoRepository.delete(foto);
	}
}
