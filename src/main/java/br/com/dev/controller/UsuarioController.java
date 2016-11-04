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
import br.com.dev.entity.Usuario;
import br.com.dev.repository.FotoRepository;
import br.com.dev.repository.UsuarioRepository;



/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 29/02/2016
 * */

@RestController
@CrossOrigin
@RequestMapping("/usuario")
public class UsuarioController {


	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private FotoRepository fotoRepository;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listaUsuarios(){
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		try {
			listaUsuario = (List<Usuario>) usuarioRepository.findAll();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return listaUsuario;
	}
	
	@RequestMapping(value = "/fotos",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Foto> listaFotos(){
		List<Foto> listaFoto = new ArrayList<Foto>();
		try {
			listaFoto = (List<Foto>) fotoRepository.findAll();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return listaFoto;
	}
	
	@RequestMapping(value = "/fotos/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savarFoto(@RequestBody Foto foto){
		fotoRepository.save(foto);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savarUsuario(@RequestBody Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editarUsuario(@RequestBody Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void excluirUsuario(@RequestBody Usuario usuario){
		usuarioRepository.delete(usuario);
	}
}
