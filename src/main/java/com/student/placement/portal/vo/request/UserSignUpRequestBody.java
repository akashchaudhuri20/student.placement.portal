package com.student.placement.portal.vo.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpRequestBody {

    private String name;
    private String email;
    private String phoneNumber;
    private String userType;
    private String password;

}
