package br.com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.entity.Usuario;
import br.com.dev.service.UsuarioService;



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
	private UsuarioService usuarioService;

	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listaUsuarios(){
		return usuarioService.listaUsuarios();
	}
	
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void savarUsuario(@RequestBody Usuario usuario){
		usuarioService.savarUsuario(usuario);
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editarUsuario(@RequestBody Usuario usuario){
		usuarioService.savarUsuario(usuario);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void excluirUsuario(@RequestBody Usuario usuario){
		usuarioService.excluirUsuario(usuario);
	}
}
