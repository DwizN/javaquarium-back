/**
 * 
 */
package fr.univlittoral.javaquarium.BD;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.univlittoral.javaquarium.DTO.LoginRequestDTO;
import fr.univlittoral.javaquarium.DTO.UtilisateurDTO;
import fr.univlittoral.javaquarium.config.PoissonSpringUser;

/**
 * @author antoineoffroy
 *
 */
@RestController
@RequestMapping(value = "/rest/public/bd/login")
@Transactional
public class LoginBD {


	@Autowired
	private AuthenticationProvider authenticationManager;


	@RequestMapping(method = RequestMethod.POST)
	public UtilisateurDTO login(@RequestBody final LoginRequestDTO request, final HttpServletRequest req) throws Exception{

		if (StringUtils.isEmpty(request.getIdentifiant()) || StringUtils.isEmpty(request.getPassword())) {
			throw new Exception();

		}
		
		final org.springframework.security.core.Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getIdentifiant(), request.getPassword()));
		if (authentication == null) {
			throw new Exception();
		}
		
		final PoissonSpringUser utilisateur = (PoissonSpringUser) authentication.getPrincipal();
		
		final UtilisateurDTO dto = new UtilisateurDTO();
		dto.setPrenom(utilisateur.getUsername());

		return dto;

	}

}