package com.jtkj.service;

import com.jtkj.mode.LoginResult;

public interface loginService {

    public LoginResult login( String account, String password) throws Exception;
}
