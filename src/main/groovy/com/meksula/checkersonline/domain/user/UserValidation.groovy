package com.meksula.checkersonline.domain.user

/**
 * @Author
 * Karol Meksuła
 * 05-06-2018
 * */

class UserValidation {
    private User user

    boolean validate(User user) {
        this.user = user
        return checkPassword() && checkUsername()
    }

    private boolean checkUsername() {
        user.getUsername().length() > 5 && user.getUsername().length() < 18
    }

    private boolean checkPassword() {
        return user.getPassword().length() > 30
    }

}
