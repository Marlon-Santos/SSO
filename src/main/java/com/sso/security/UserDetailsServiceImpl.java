package com.sso.security;

import com.sso.entity.Users;
import com.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userService.getUserByUsername(username);
        Set<SimpleGrantedAuthority> simpleGrantedAuthorities = new HashSet<>();
        user.getRoles().forEach(role -> simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role.getRole())));
        return new User(user.getUsername(), user.getPassword(), simpleGrantedAuthorities);
    }

}
