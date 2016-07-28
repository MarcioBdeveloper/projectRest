package br.com.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dev.entity.Usuario;

/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 29/02/2016
 *
 * */


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	//extends o crud basico do CrudRepository, caso haja alguama consulta especifica, devera ser implementada
}
