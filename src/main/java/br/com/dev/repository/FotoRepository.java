package br.com.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dev.entity.Foto;

/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 03/11/2016
 *
 * */


@Repository
public interface FotoRepository extends CrudRepository<Foto, Long>{
	//extends o crud basico do CrudRepository, caso haja alguama consulta especifica, devera ser implementada
}
