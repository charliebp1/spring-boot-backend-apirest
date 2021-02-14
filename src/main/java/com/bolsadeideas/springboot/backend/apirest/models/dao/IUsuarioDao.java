package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	/* Sentencia query para buscar en este caso por Username (se pueden usar multiples consultas)
	 * public Usuario findByUsernameAndEmail(String username, String email);
	 */
	
	public Usuario findByUsername(String username);
	
	/* mediante notación query en el decorador quedaría:
	 * @Query("select u from Usuario u where u.username=?1 and u.otro=?2")
	 * public Usuario findByUsuario(String username, String otro);
	 */
}
