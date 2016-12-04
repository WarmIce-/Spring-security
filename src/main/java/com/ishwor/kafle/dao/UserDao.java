package com.ishwor.kafle.dao;

import com.ishwor.kafle.model.User;

/**
 * Created by script on 12/4/16.
 */
public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);
}
