package com.meksula.checkersonline.domain

import com.fasterxml.jackson.annotation.JsonAutoDetect

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Player {
    int win
    int lost


}
