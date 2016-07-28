package br.com.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dev.entity.TipoConta;
import br.com.dev.entity.Usuario;

/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 25/06/2016
 *
 * */


@Repository
public interface TipoContaRepository extends CrudRepository<TipoConta, Long>{
	//extends o crud basico do CrudRepository, caso haja alguama consulta especifica, devera ser implementada
}
