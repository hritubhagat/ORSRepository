package com.bhagat.hritu.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhagat.hritu.dao.UserDAO;
import com.bhagat.hritu.dto.UserDTO;
import com.bhagat.hritu.exception.ApplicationException;
import com.bhagat.hritu.exception.DatabaseException;
import com.bhagat.hritu.exception.DuplicateUserException;
import com.bhagat.hritu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDao;
    
    private static Logger LOG= LoggerFactory.getLogger(UserServiceImpl.class);
    
    @Override
    public UserDTO authenticate(UserDTO user) throws ApplicationException{
        try{
        UserDTO dtoExists = userDao.findByLogin(user.getUserName());
        if(null != dtoExists && dtoExists.getPassword().equalsIgnoreCase(user.getPassword())){
            dtoExists.setLastLogin(new Timestamp(new Date().getTime()));
            dtoExists.setLastLoginIP(user.getLastLoginIP());
            userDao.updateUser(dtoExists);
            return dtoExists;
        }else{
            throw new ApplicationException("Invalid user name or password");
        }
        }catch(DatabaseException e){
            LOG.error("Application Exception::{}",e);
            throw new ApplicationException("Database Exception");
        }
    }

    @Override
    public boolean registerUser(UserDTO user) throws DuplicateUserException {
        return userDao.createUser(user);
    }

}
