package org.generation.blogPessoal.seguranca;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.reposiroy.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService{
	
	private UsuarioRepository userRepository;
	

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));
		
		return user.map(UserDetailsImp::new).get();
	}

}
