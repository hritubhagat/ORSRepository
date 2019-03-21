package com.bhagat.hritu.service;

import com.bhagat.hritu.dto.UserDTO;
import com.bhagat.hritu.exception.ApplicationException;
import com.bhagat.hritu.exception.DuplicateUserException;

public interface UserService {

    public UserDTO authenticate(UserDTO user) throws ApplicationException;
    public boolean registerUser(UserDTO user) throws DuplicateUserException;
}
