package br.com.oauth2.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oauth2.auth.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>,UsuarioRepositoryCustom {

	List<Usuario> findByNameStartsWithIgnoreCase(String name);
	
	Usuario findByLoginStartsWithIgnoreCase(String login);

	void delete(Usuario usuario);

	List<Usuario> buscarUsuarios();
	
}
