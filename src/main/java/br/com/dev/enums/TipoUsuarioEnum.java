package br.com.dev.enums;

/***
 * 
 * Created by Márcio Barbosa - email: marciobarbosamobile@gmail.com
 * 29/02/2016
 * */

public enum TipoUsuarioEnum {

	Administrador(1);
	
	private final int idTipoUsuario;
	
	TipoUsuarioEnum(int id){
		idTipoUsuario = id;
	}
	
	public int getId(){
		return idTipoUsuario;
	}
}
