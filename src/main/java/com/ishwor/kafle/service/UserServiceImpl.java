package com.ishwor.kafle.service;

import com.ishwor.kafle.dao.UserDao;
import com.ishwor.kafle.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by script on 12/4/16.
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    public User findById(int id) {
        return dao.findById(id);
    }

    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }
}
