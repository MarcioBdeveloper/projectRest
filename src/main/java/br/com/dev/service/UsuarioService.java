package br.com.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dev.entity.Usuario;
import br.com.dev.repository.UsuarioRepository;


/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 07/11/2016
 * */


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> listaUsuarios(){
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		try {
			listaUsuario = (List<Usuario>) usuarioRepository.findAll();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return listaUsuario;
	}
	

	public void savarUsuario(Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	public void editarUsuario(Usuario usuario){
		usuarioRepository.save(usuario);
	}

	public void excluirUsuario(Usuario usuario){
		usuarioRepository.delete(usuario);
	}

}
