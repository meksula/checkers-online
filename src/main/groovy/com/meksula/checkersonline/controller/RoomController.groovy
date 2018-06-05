package com.meksula.checkersonline.controller

import com.meksula.checkersonline.domain.room.Room
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@RestController
@RequestMapping("/api/room")
class RoomController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Room createGameRoom() {

    }

    @PostMapping(path = "/{roomId}")
    @ResponseStatus(HttpStatus.OK)
    Room joinGameRoom() {

    }

}