package com.meksula.checkersonline.controller

import com.meksula.checkersonline.domain.Room
import com.meksula.checkersonline.domain.room.RoomManager
import org.springframework.http.HttpStatus
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.PathVariable
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
    private RoomManager roomManager

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Room createGameRoom() {
        return new Room()
    }

    @PostMapping(path = "/{roomId}")
    @ResponseStatus(HttpStatus.OK)
    Room joinGameRoom(@PathVariable("roomId") String roomId, Authentication authentication) {
        return roomManager.joinToRoom(roomId, authentication.getPrincipal() as String)
    }

}