package com.vaccinate.vaccinatebackend.service;

import com.vaccinate.vaccinatebackend.entity.PrincipalUser;
import com.vaccinate.vaccinatebackend.entity.User;
import com.vaccinate.vaccinatebackend.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    UserRepository userRepository;

    public UserService(UserRepository repository){
        this.userRepository = repository;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email);

        if (user != null){
            return new PrincipalUser(user);
        }else {
            throw new UsernameNotFoundException(String.format("cannot find user with username %s",email));
        }
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

}
