package com.blackcode.spring_boot_auth.service;

import com.blackcode.spring_boot_auth.model.UserPrincipal;
import com.blackcode.spring_boot_auth.model.Users;
import com.blackcode.spring_boot_auth.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);

        if(user == null){
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("User not Found");
        }
        return new UserPrincipal(user);
    }
}
