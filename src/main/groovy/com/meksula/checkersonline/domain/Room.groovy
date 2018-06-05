package com.meksula.checkersonline.domain

import lombok.Getter
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


import java.time.LocalDateTime
import java.time.LocalTime

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@Getter
@Setter
@Document(collection = "room")
class Room {

    @Id
    private String roomId

    private Player first
    private Player second

    private LocalDateTime createTime
    private LocalTime started
    private LocalTime finished

    private Player winner
}
