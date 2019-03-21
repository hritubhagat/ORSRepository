package com.bhagat.hritu.dao.impl;

import org.springframework.data.repository.CrudRepository;

import com.bhagat.hritu.dto.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO,Long>{
    UserDTO findByUserName(String userName);
    UserDTO findByAge(Integer age);
}
