package com.niranjan.springsecurity.security;

import com.niranjan.springsecurity.entity.User;
import com.niranjan.springsecurity.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    final Optional<User> user = userRepository.findByUsername(userName);
    user.orElseThrow(()->new UsernameNotFoundException("Not Found: " + userName));
    return user.map(CustomUserDetails::new).get();
  }
}
