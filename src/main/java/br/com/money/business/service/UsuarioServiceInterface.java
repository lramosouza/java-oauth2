package br.com.oauth2.business.service;

import br.com.oauth2.auth.usuario.Usuario;
import br.com.oauth2.business.exception.CampoObrigatorioException;

public interface UsuarioServiceInterface {
	
	public void incluir(Usuario usuario);

	void deletar(String login) throws CampoObrigatorioException;

	void atualizar(Usuario usuario) throws CampoObrigatorioException;
}
