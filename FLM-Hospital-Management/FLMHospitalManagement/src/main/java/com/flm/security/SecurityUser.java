package com.flm.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flm.dao.UserRepository;
import com.flm.exception.InvalidCredentialsException;
import com.flm.exception.PasswordDoesntExistException;
import com.flm.model.User;

@Service
public class SecurityUser implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findUserByEmail(username);
		
		if(user==null) {
			throw new InvalidCredentialsException("Invalid email");
		}
		
		if (user.getPassword() == null) {
            throw new PasswordDoesntExistException("Please reset your password first");
        }
		
		ArrayList<GrantedAuthority> authorities = new ArrayList<>();
		String role = user.getRole();
		authorities.add(new SimpleGrantedAuthority(role));
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
	}
	
	

}
