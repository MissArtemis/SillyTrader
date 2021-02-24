package com.st.java.service;

import com.st.java.model.RegisterForm;
import com.st.java.model.RegisterResult;
import com.st.java.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public RegisterResult register(RegisterForm form) {

        return null;
    }
}
