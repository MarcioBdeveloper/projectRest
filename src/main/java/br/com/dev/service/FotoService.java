package br.com.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dev.entity.Foto;
import br.com.dev.repository.FotoRepository;


/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 07/11/2016
 * */

@Service
public class FotoService {
	
	
	@Autowired
	private FotoRepository fotoRepository;
	
	
	public List<Foto> listaFotos(){
		List<Foto> listaFoto = new ArrayList<Foto>();
		try {
			listaFoto = (List<Foto>) fotoRepository.findAll();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return listaFoto;
	}
	
	public void savarFoto(Foto foto){
		fotoRepository.save(foto);
	}
	 
	public void excluirFoto(Long id){
		fotoRepository.delete(id);
	}

}
