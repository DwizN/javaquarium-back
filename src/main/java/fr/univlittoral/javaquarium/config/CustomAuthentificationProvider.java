/**
 * 
 */
package fr.univlittoral.javaquarium.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.univlittoral.javaquarium.BO.UtilisateurBO;
import fr.univlittoral.javaquarium.DO.UtilisateurDO;

/**
 * @author antoineoffroy
 *
 */
@Component
@Transactional
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class CustomAuthentificationProvider implements AuthenticationProvider{
	
	@Autowired
	private UtilisateurBO utilisateurBO;
	
	@Override
	public Authentication authenticate(final Authentication authentication) throws AuthenticationException{
		final String userName=authentication.getName();
		final String password =authentication.getCredentials().toString();
		final UtilisateurDO utilisateurDO = utilisateurBO.findByUsername(userName);
		if(null != utilisateurDO) {
		
		final List<GrantedAuthority> grantedAuths = new ArrayList<>();
		final PoissonSpringUser principal = new PoissonSpringUser(utilisateurDO.getId(), userName, password, true, true, true, true, grantedAuths);
			return new UsernamePasswordAuthenticationToken(principal,password,grantedAuths);
		}
		return null;
		}

	@Override
	public boolean supports(final Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

	}

