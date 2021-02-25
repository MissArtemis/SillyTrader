package com.st.java.model;

import com.st.java.model.params.RegisterParams;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class RegisterForm implements RegisterParams {
    private String username;
    private String password;
    private String email;
    private String phone;

    @Override
    public String username() {
        return this.username;
    }

    @Override
    public String password() {
        return this.password;
    }

    @Override
    public String email() {
        return this.email;
    }

    @Override
    public String phone() {
        return this.phone;
    }
}
