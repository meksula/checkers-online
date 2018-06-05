package com.meksula.checkersonline.domain.user

import com.meksula.checkersonline.domain.Player
import com.meksula.checkersonline.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@Service
class UserCreatorImpl implements UserCreator {
    private UserRepository userRepository
    private PasswordEncoder passwordEncoder

    UserCreatorImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository
        this.passwordEncoder = passwordEncoder
    }

    @Override
    User createUser(RegistrationForm registrationForm) {
        User user = new User()
        user.setUserId(Long.valueOf(userRepository.count() + 1) as String)
        user.setUsername(registrationForm.username)
        user.setPassword(passwordEncoder.encode(registrationForm.getPassword()))
        user.setEmail(registrationForm.getEmail())
        user.setPlayer(new Player())
        user.setAuthorities(new ArrayList<String>(Arrays.asList("USER")))

        if (new UserValidation().validate(user)) {
            userRepository.save(user)
            return user
        }

        else throw new IncorrectUserData()
    }

}
