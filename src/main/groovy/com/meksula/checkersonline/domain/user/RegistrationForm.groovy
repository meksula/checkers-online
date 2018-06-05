package com.meksula.checkersonline.domain.user

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.Setter

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@Getter
@Setter
class RegistrationForm {
    String username
    String password
    String email

    @JsonCreator
    RegistrationForm(@JsonProperty("username") String username,
                     @JsonProperty("password") String password,
                     @JsonProperty("email") String email) {
        this.username = username
        this.password = password
        this.email = email
    }

}
