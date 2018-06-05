package com.meksula.checkersonline.repository

import com.meksula.checkersonline.domain.user.User
import org.springframework.data.repository.CrudRepository

/** @Author
 * Karol Meksuła
 * 05-04-2018
 * */

interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username)
}
