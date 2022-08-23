package com.student.placement.portal.common.structures.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserModel extends BaseModel{
    private String userId;
    private String name;
    private String emailId;
    private String phoneNo;
    private boolean isValid;
    private String password;
    private String userType;
}
