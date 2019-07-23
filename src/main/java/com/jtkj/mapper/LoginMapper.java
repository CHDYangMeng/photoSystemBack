package com.jtkj.mapper;


import com.jtkj.mode.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    public User login( String account, String password) throws Exception;
}
