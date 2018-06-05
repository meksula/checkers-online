package com.meksula.checkersonline.domain.user

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

class UserNotExistException extends RuntimeException {

    @Override
    String getMessage() {
        return "There is no user in database."
    }
}

