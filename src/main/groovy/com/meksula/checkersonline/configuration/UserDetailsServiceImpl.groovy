package com.meksula.checkersonline.configuration

import com.meksula.checkersonline.domain.user.User
import com.meksula.checkersonline.repository.UserRepository
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@Service
class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository userRepository
    private User user

    UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository
    }

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optional = userRepository.findByUsername(username) as Optional<User>

        if (optional.isPresent())
            this.user = optional.get()

        else throw new EmptyResultDataAccessException("No user in database.", 0)

        return new org.springframework.security.core.userdetails.User(this.user.getUsername(),
        this.user.getPassword(), convertToAuthorities(this.user.getAuthorities()))
    }

    private List<GrantedAuthority> convertToAuthorities(List<String> authList) {
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>()

        for (int i = 0; i < authList.size(); i++) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authList.get(i)))
        }

        return grantedAuthorities
    }

}
