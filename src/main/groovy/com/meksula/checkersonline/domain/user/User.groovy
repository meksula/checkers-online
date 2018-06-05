package com.meksula.checkersonline.domain.user

import com.meksula.checkersonline.domain.Player
import lombok.Getter
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@Getter
@Setter
@Document(collection = "user")
class User {

    @Id
    String userId

    String username
    String password
    String email
    List<String> authorities

    Player player
}
