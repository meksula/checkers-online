package com.meksula.checkersonline.domain.user

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

class IncorrectUserData extends RuntimeException {

    @Override
    String getMessage() {
        return "Some value is invalid."
    }
}
