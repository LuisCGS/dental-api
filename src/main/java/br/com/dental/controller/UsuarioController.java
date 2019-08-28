package br.com.dental.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dental.exception.GenericoException;
import br.com.dental.exception.ValidacaoException;
import br.com.dental.model.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@RequestMapping(value="/teste", method=RequestMethod.GET)
	public String teste() throws ValidacaoException, GenericoException {
		try {
			
			return "Olá mundo";
		} catch (ValidacaoException e) {
			throw e;
		} catch (Exception e) {
			throw new GenericoException();
		}
	}
	
	/**
	 * Metodos responsavel por salvar uma {@link Usuario} 
	 *
	 * @Autor: <b> Luis C. G. Sanches <luis.cgs@icloud.com> </b>
	 * @Data: <i> 25/03/2019 - 10:13 </i>
	 * @param usuario : {@link Usuario}
	 * @return {@link ResponseEntity}
	 * @throws ValidacaoException
	 * @throws GenericoException
	 */
	@PostMapping
	public ResponseEntity<?> salvar(@Valid @RequestBody Usuario usuario) throws ValidacaoException, GenericoException {
		try {
			
			return null;
		} catch (ValidacaoException e) {
			throw e;
		} catch (Exception e) {
			throw new GenericoException();
		}
	}
	
	/**
	 * Metodos responsavel por buscar uma lista ou paginas de {@link Usuario} por nome podendo ser ordenado e/ou paginado 
	 *
	 * @Autor: <b> Luis C. G. Sanches <luis.cgs@icloud.com> </b>
	 * @Data: <i> 14/03/2019 - 10:40 </i>
	 * @param nome : {@link String}
	 * @param ordem : {@link String}
	 * @param pagina : {@link Integer}
	 * @param tamanho : {@link Integer}
	 * @return {@link ResponseEntity}
	 * @throws GenericoException 
	 */
	@GetMapping
	public ResponseEntity<?> buscarPorNomeOrdenadoEOuPaginado(String login, String ordem, Integer pagina,
			Integer tamanho) throws ValidacaoException, GenericoException {
		try {
			return null;
		} catch (ValidacaoException e) {
			throw e;
		} catch (Exception e) {
			throw new GenericoException();
		}
	}
	
	/**
	 * Metodo responsavel por excluir uma {@link Usuario} a partir do codigo 
	 *
	 * @Autor: <b> Luis C. G. Sanches <luis.cgs@icloud.com> </b>
	 * @Data: <i> 25/03/2019 - 10:19 </i>
	 * @param codigo : {@link String}
	 * @throws ValidacaoException
	 * @throws GenericoException
	 */
	@DeleteMapping
	public void excluir(String codigo) throws ValidacaoException, GenericoException {
		try {
			
		} catch (ValidacaoException e) {
			throw e;
		} catch (Exception e) {
			throw new GenericoException();
		}
	}
}
