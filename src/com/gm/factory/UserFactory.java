package com.gm.factory;

import com.gm.model.User;

public class UserFactory {

    public static User creaUser(){
        return new User();
    }

}
