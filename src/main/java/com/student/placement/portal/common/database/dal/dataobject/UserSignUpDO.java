package com.student.placement.portal.common.database.dal.dataobject;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("pp_user_register")
@Getter
@Setter
public class UserSignUpDO {

    private String userId;
    private String name;
    private String emailId;
    private String phoneNo;
    private String isValid;
    private String password;
    private String userType;
    private Date gmtModified;
    private Date gmtCreate;
}
