package com.upgrad.proman.service.business;

import com.upgrad.proman.service.dao.UserDao;
import com.upgrad.proman.service.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminBusinessService {

    @Autowired
    private UserDao userDao;

    public UserEntity getUser(final String userUuid){

        UserEntity userEntity =  userDao.getUser(userUuid);
        if(userEntity == null){
            //throw an exception here
        }
        return userEntity;
    }
}

