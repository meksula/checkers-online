package com.meksula.checkersonline.controller

import com.meksula.checkersonline.domain.user.RegistrationForm
import com.meksula.checkersonline.domain.user.User
import com.meksula.checkersonline.domain.user.UserCreator
import com.meksula.checkersonline.domain.user.UserNotExistException
import com.meksula.checkersonline.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@RestController
class UserController {
    private UserCreator userCreator
    private UserRepository userRepository

    @Autowired
    void setUserCreator(UserCreator userCreator) {
        this.userCreator = userCreator
    }

    @Autowired
    void setRepository(UserRepository userRepository) {
        this.userRepository = userRepository
    }

    @PostMapping(path = "/registration")
    @ResponseStatus(HttpStatus.CREATED)
    User addNewUser(@RequestBody RegistrationForm registrationForm) {
        return userCreator.createUser(registrationForm)
    }

    @GetMapping(path = "/user/{userId}")
    @ResponseStatus(HttpStatus.OK)
    User getUser(@PathVariable("userId") String userId) {
        return userRepository.findById(userId).orElse(null)
    }

}
