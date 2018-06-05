package com.meksula.checkersonline.domain.room

import com.meksula.checkersonline.domain.Room

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

interface RoomManager {
    Room createNewRoom(String username)

    Room loadRoom(String roomId)

    Room joinToRoom(String roomId, String username)
}