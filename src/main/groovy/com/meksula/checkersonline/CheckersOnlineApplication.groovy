package com.meksula.checkersonline

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@Import(SecurityConfigCustom.class)
@SpringBootApplication
class CheckersOnlineApplication {

    static void main(String[] args) {
        SpringApplication.run CheckersOnlineApplication, args
    }

}
