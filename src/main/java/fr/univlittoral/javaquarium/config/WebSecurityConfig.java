/**
 * 
 */
package fr.univlittoral.javaquarium.config;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

/**
 * @author antoineoffroy
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true,prePostEnabled=true)

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private CustomAuthentificationProvider authProvider;

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authProvider);
	}

	@Override
	protected void configure(final HttpSecurity http) throws Exception {

		http.addFilterBefore(new CORSFilter(), BasicAuthenticationFilter.class);

		// 1. Arrêt de la gestion Cors/Csrf/FrameOptions via Srping
		// Gestion manuelle de la response http => CORSFilter.java
		http.cors().and().csrf().disable();
		http.headers().frameOptions().disable();

		// 2. Protection de tout ce qui n'est pas derrière /public
		// @formatter:off
		http.authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS, "/rest/**").permitAll()
			.antMatchers("/rest/public/**").permitAll()
			.antMatchers("/rest/**").authenticated()
			.and().httpBasic();
		// @formatter:on

	}

}