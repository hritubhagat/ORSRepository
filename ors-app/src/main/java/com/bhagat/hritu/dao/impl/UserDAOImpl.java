package com.bhagat.hritu.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhagat.hritu.dao.UserDAO;
import com.bhagat.hritu.dto.UserDTO;
import com.bhagat.hritu.exception.DatabaseException;
import com.bhagat.hritu.exception.DuplicateUserException;

@Component
public class UserDAOImpl implements UserDAO{

    @Autowired
    private UserRepository userRepository;
    
    private static Logger LOG = LoggerFactory.getLogger(UserDAOImpl.class);

    @Override
    public UserDTO findByLogin(String userName) throws DatabaseException{
        LOG.debug("DAO findByLogin method starts");
        UserDTO userFound =null;
        try{
            userFound = userRepository.findByUserName(userName);
        }catch(Exception e){
            LOG.error("Database Exception::", e);
            throw new DatabaseException("Exception in getting user by Login");
        }
        LOG.debug("DAO findByLogin method ends");
        return userFound;
    }

    @Override
    public boolean createUser(UserDTO user) throws DuplicateUserException{
        UserDTO userExists = userRepository.findByUserName(user.getUserName());
        UserDTO userDto;
        if(null == userExists){
            userDto = userRepository.save(user);
        }else {
           throw new DuplicateUserException();
        }
        if(null != userDto){
            return true;
        }
        return false;
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return null;
    }
    
}
