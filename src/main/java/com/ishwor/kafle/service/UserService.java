package com.ishwor.kafle.service;

import com.ishwor.kafle.model.User;

/**
 * Created by script on 12/4/16.
 */


public interface UserService {
    User findById(int id);

    User findBySso(String sso);

}
